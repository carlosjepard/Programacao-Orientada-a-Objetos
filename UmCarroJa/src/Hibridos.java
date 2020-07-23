import java.io.Serializable;

public class Hibridos extends Veiculo implements Serializable
{
    // variaveis de instancia
    private double consumoKmEletricidade;
    private double consumoKmGasolina;
    private double bateriaAtual;
    private double tamanhoBateria; // em watts
    private double combustivelAtual;
    private double tamanhoDeposito; // em litros
    private double autonomia;
    private Boolean condicao;

    // construtores
    public Hibridos(){
        super();
        this.consumoKmEletricidade = 0;
        this.consumoKmGasolina = 0;
        this.bateriaAtual =0;
        this.tamanhoBateria = 0;
        this.combustivelAtual = 0;
        this.tamanhoDeposito = 0;
        this.condicao = false;
    }

    public Hibridos (String matriculaAux,Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux,double classificacaoAux, String descricaoAux,Proprietario proprietarioAux, double consumoKmEletricidadeAux,double consumoKmGasolinaAux, double bateriaAtualAux, double tamanhoBateriaAux, double combustivelAtualAux, double tamanhoDepositoAux,double autonomiaAux,boolean condicaoAux){
        super(matriculaAux,localizacaoAux,precoKmAux,velocidadeKmAux,classificacaoAux,descricaoAux,proprietarioAux);
        this.consumoKmEletricidade = consumoKmEletricidadeAux;
        this.consumoKmGasolina = consumoKmGasolinaAux;
        this.bateriaAtual = bateriaAtualAux;
        this.tamanhoBateria = tamanhoBateriaAux;
        this.combustivelAtual = combustivelAtualAux;
        this.tamanhoDeposito = tamanhoDepositoAux;
        this.autonomia = autonomiaAux;
        this.condicao = condicaoAux;
    }

    public Hibridos (Hibridos aux){
        this(aux.getMatricula(),aux.getLocalizacao(), aux.getPrecoKm(), aux.getVelocidadeKm(),aux.getClassificacao(), aux.getDescricao(),aux.getProprietario(),aux.getConsumoKmEletricidade(),aux.getConsumoKmGasolina(),aux.getBateriaAtual(),aux.getTamanhoBateria(),aux.getCombustivelAtual(),aux.getTamanhoDeposito(), aux.getAutonomia(), aux.getCondicao());
    }

    // get's e set's
    public double getConsumoKmEletricidade() {
        return this.consumoKmEletricidade;
    }

    public void setConsumoKmEletricidade (double consumoKm) {
        this.consumoKmEletricidade = consumoKm;
    }

    public double getConsumoKmGasolina() {
        return this.consumoKmGasolina;
    }

    public void setConsumoKmGasolina (double consumoKm) {
        this.consumoKmGasolina = consumoKm;
    }

    public double getBateriaAtual(){return this.bateriaAtual;}

    public void setBateriaAtual (double bateriaAtual) {this.bateriaAtual = bateriaAtual;}

    public double getTamanhoBateria(){return this.tamanhoBateria;}

    public void setTamanhoBateria (double tamanhoBateria) {this.tamanhoBateria = tamanhoBateria;}

    public double getCombustivelAtual(){return this.combustivelAtual;}

    public void setCombustivelAtual (double combustivelAtual) {this.combustivelAtual = combustivelAtual;}

    public double getTamanhoDeposito(){return this.tamanhoDeposito;}

    public void setTamanhoDeposito (double tamanhoDeposito) {this.tamanhoDeposito = tamanhoDeposito;}

    public double getAutonomia(){return this.autonomia;}

    public void setAutonomia (double autonomia) {this.autonomia = autonomia;}

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
        Hibridos aux = (Hibridos) o;
        return
                Double.compare(aux.getPrecoKm(), this.getPrecoKm()) == 0 &&
                        Double.compare(aux.getVelocidadeKm(), this.getVelocidadeKm()) == 0 &&
                        Double.compare(aux.getConsumoKmEletricidade(), this.getConsumoKmEletricidade()) == 0 &&
                        Double.compare(aux.getConsumoKmGasolina(), this.getConsumoKmGasolina()) == 0 &&
                        Double.compare(aux.getClassificacao(), this.getClassificacao()) == 0 &&
                        Double.compare(aux.getCombustivelAtual(), this.getCombustivelAtual()) == 0 &&
                        Double.compare(aux.getTamanhoDeposito(), this.getTamanhoDeposito()) == 0 &&
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

    public Hibridos clone (){
        Hibridos aux = new Hibridos(this);
        return aux;
    }

    public String toString() {
        return "Hibridos{" +
                "Matricula: '" + this.getMatricula() + '\'' +
                ", localizacao: " + this.getLocalizacao() + '\'' +
                ", preco por Km: " + this.getPrecoKm() + '\'' +
                ", velocidade por Km: " + this.getVelocidadeKm() + '\'' +
                ", classificacao: " + this.getClassificacao() + '\'' +
                ", descricao: '" + this.getDescricao() + '\'' +
                ", proprietario: " + this.getProprietario().getEmail() + '\'' +
                ", consumoKmEletricidadae: " + this.getConsumoKmEletricidade() + '\'' +
                ", bateria Atual: " + this.getBateriaAtual() + '\'' +
                ", tamanhoBateria: " + this.getTamanhoBateria() + '\'' +
                ", consumoKmGasolina: " + this.getConsumoKmGasolina() + '\'' +
                ", combustivelAtual: " + this.getCombustivelAtual() + '\'' +
                ", tamanho do Deposito: " + this.getTamanhoDeposito() + '\'' +
                ", autonomia: " + this.getAutonomia() + '\'' +
                '}';
    }

    // método para abastecimento
    public int abasteceHibrido(double bateriaAux, double combustivelAux){
        if (((this.getBateriaAtual() + bateriaAux) > this.getTamanhoBateria()) || ((this.getCombustivelAtual() + combustivelAux) > this.getTamanhoDeposito())) return -1;
        else {
            double resultadoBateria;
            double resultadoCombustivel;
            resultadoBateria = this.getBateriaAtual() + bateriaAux;
            this.setBateriaAtual(resultadoBateria);
            resultadoCombustivel = this.getCombustivelAtual() + combustivelAux;
            this.setCombustivelAtual(resultadoCombustivel);
            return 1;
        }
    }

    public void atualizaH(Ponto destino){

        double distancia = this.getLocalizacao().distanciaPonto(destino);
        this.setAutonomia(this.getAutonomia()-distancia);
        this.setCombustivelAtual(this.getCombustivelAtual()-(distancia * this.getConsumoKmGasolina()));
        this.setBateriaAtual(this.getBateriaAtual()-(distancia * this.getConsumoKmEletricidade()));
        if ((this.getCombustivelAtual()/this.getTamanhoDeposito()<0.1)||(this.getBateriaAtual()/this.getTamanhoBateria()<0.1)) this.setCondicao(false);
        this.setLocalizacao(destino);
    }

    public double calculaAutonomiaH(){
        double autonomia1 = 0;
        double autonomia2 = 0;
        autonomia1 = this.getBateriaAtual()/this.getConsumoKmEletricidade();
        autonomia2 = this.getCombustivelAtual()/this.getConsumoKmGasolina();
        if (autonomia1 > autonomia2) return autonomia2;
        else return autonomia1;
    }

    // método que devolve combustivel atual tendo autonomia
    public void calculaCombustivelH(){
        double x = 0;
        x = this.getAutonomia() * this.getConsumoKmGasolina();
       this.setBateriaAtual(x);
       this.setCombustivelAtual(x);
       this.setTamanhoBateria(x);
       this.setTamanhoDeposito(x);
    }



}
