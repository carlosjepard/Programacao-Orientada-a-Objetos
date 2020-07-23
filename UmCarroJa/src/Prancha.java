import java.io.Serializable;

public class Prancha extends Veiculo implements Serializable
{
    // variaveis de instancia
    private double consumoKm;
    private double bateriaAtual;
    private double tamanhoBateria; // em watts
    private double autonomia;
    private Boolean condicao;

    // construtores
    public Prancha(){
        super();
        this.consumoKm = 0;
        this.bateriaAtual = 0;
        this.tamanhoBateria = 0;
        this.autonomia = 0;
        this.condicao = false;
    }

    public Prancha (String matriculaAux,Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux,double classificacaoAux, String descricaoAux,Proprietario proprietarioAux, double consumoKmAux,double bateriaAtualAux,double tamanhoBateriaAux,double autonomiaAux,boolean condicaoAux){
        super(matriculaAux,localizacaoAux,precoKmAux,velocidadeKmAux,classificacaoAux,descricaoAux,proprietarioAux);
        this.consumoKm = consumoKmAux;
        this.bateriaAtual = bateriaAtualAux;
        this.tamanhoBateria = tamanhoBateriaAux;
        this. autonomia = autonomiaAux;
        this.condicao = condicaoAux;
    }

    public Prancha (Prancha aux){
        this(aux.getMatricula(),aux.getLocalizacao(), aux.getPrecoKm(), aux.getVelocidadeKm(),aux.getClassificacao(), aux.getDescricao(),aux.getProprietario(),aux.getConsumoKm(),aux.getBateriaAtual(),aux.getTamanhoBateria(),aux.getAutonomia(), aux.getCondicao());
    }

    // get's e set's
    public double getConsumoKm() {
        return this.consumoKm;
    }

    public void setConsumoKm(double consumoKm) {
        this.consumoKm = consumoKm;
    }


    public double getBateriaAtual(){return this.bateriaAtual;}

    public void setBateriaAtual(double bateriaAtualAux) {this.bateriaAtual = bateriaAtualAux;}

    public double getTamanhoBateria(){return this.tamanhoBateria;}

    public void setTamanhoBateria(double tamanhoBateria) {this.tamanhoBateria = tamanhoBateria;}

    public double getAutonomia(){return this.autonomia;}

    public void setAutonomia(double autonomia) {this.autonomia = autonomia;}

    public Boolean getCondicao() {
        return this.condicao;
    }

    public void setCondicao(Boolean condicao) {
        this.condicao = condicao;
    }

    // metodos equals, clone e toString
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prancha aux = (Prancha) o;
        return  Double.compare(aux.getPrecoKm(), this.getPrecoKm()) == 0 &&
                Double.compare(aux.getVelocidadeKm(), this.getVelocidadeKm()) == 0 &&
                Double.compare(aux.getConsumoKm(), this.getConsumoKm()) == 0 &&
                Double.compare(aux.getClassificacao(), this.getClassificacao()) == 0 &&
                Double.compare(aux.getBateriaAtual(), this.getBateriaAtual()) == 0 &&
                Double.compare(aux.getTamanhoBateria(), this.getTamanhoBateria()) == 0 &&
                Double.compare(aux.getAutonomia(), this.getAutonomia()) == 0 &&
                this.getMatricula().equals(aux.getMatricula()) &&
                this.getLocalizacao().equals(aux.getLocalizacao()) &&
                this.getDescricao().equals(aux.getDescricao()) &&
                this.getCondicao().equals(aux.getCondicao()) &&
                this.getProprietario().equals(aux.getProprietario()) &&
                this.getNrClassificacoes() == aux.getNrClassificacoes();
    }

    public Prancha clone (){
        Prancha aux = new Prancha(this);
        return aux;
    }

    public String toString() {
        return "Prancha{" +
                "Matricula:'" + this.getMatricula() + '\'' +
                ", localizacao: " + this.getLocalizacao() + '\'' +
                ", precoKm: " + this.getPrecoKm() + '\'' +
                ", velocidadeKm: " + this.getVelocidadeKm() + '\'' +
                ", classificacao: " + this.getClassificacao() + '\'' +
                ", descricao: '" + this.getDescricao() + '\'' +
                ", proprietario: " + this.getProprietario().getEmail() + '\'' +
                ", consumoKm: " + this.getConsumoKm() + '\'' +
                ", bateriaAtual: " + this.getBateriaAtual() + '\'' +
                ", tamanhoBateria: " + this.getTamanhoBateria() + '\'' +
                ", autonomia: " + this.getAutonomia() + '\'' +
                '}';
    }


    // método de abastecimento

    public int abastecePrancha(double bateriaAux){
        if ((this.getBateriaAtual() + bateriaAux) > this.getTamanhoBateria()) return -1;
        else {
                double resultado;
                resultado = this.getBateriaAtual() + bateriaAux;
                this.setBateriaAtual(resultado);
                return 1;
        }
    }

    public void atualizaP(Ponto destino){

        double distancia = this.getLocalizacao().distanciaPonto(destino);
        this.setAutonomia(this.getAutonomia()-distancia);
        this.setBateriaAtual(this.getBateriaAtual()-(distancia * this.getConsumoKm()));
        if (this.getBateriaAtual()/this.getTamanhoBateria()<0.1) this.setCondicao(false);
        this.setLocalizacao(destino);
    }

    public double calculaAutonomiaP(){
        double autonomia = 0;
        autonomia = this.getBateriaAtual()/this.getConsumoKm();
        return autonomia;
    }

    public void calculaCombustivelP(){
        double x = 0;
        x = this.getAutonomia() * this.getConsumoKm();
        this.setBateriaAtual(x);
        this.setTamanhoBateria(x);
    }



}