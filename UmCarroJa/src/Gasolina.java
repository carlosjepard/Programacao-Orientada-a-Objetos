import java.io.Serializable;

public class Gasolina extends Veiculo implements Serializable
{
    // variaveis de instancia
    private double consumoKm; // em litros por km
    private double combustivelAtual;
    private double tamanhoDeposito; // em litros
    private double autonomia;
    private Boolean condicao;

    // construtores
    public Gasolina(){
        super();
       // this.setNrClassificacoes(0);
        this.consumoKm = 0;
        this.combustivelAtual = 0;
        this.tamanhoDeposito = 0;
        this.autonomia = 0;
        this.condicao = false;
    }

    public Gasolina (String matriculaAux,Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux,double classificacaoAux, String descricaoAux,Proprietario proprietarioAux, double consumoKmAux,double combustivelAtualAux,double tamanhoDepositoAux,double autonomiaAux,boolean condicaoAux){
        super(matriculaAux,localizacaoAux,precoKmAux,velocidadeKmAux,classificacaoAux,descricaoAux,proprietarioAux);
        //this.setNrClassificacoes(0);
        this.consumoKm = consumoKmAux;
        this.combustivelAtual = combustivelAtualAux;
        this.tamanhoDeposito = tamanhoDepositoAux;
        this.autonomia = autonomiaAux;
        this.condicao = condicaoAux;
    }

    public Gasolina (Gasolina aux){
        this(aux.getMatricula(),aux.getLocalizacao(), aux.getPrecoKm(), aux.getVelocidadeKm(),aux.getClassificacao(), aux.getDescricao(),aux.getProprietario(),aux.getConsumoKm(),aux.getCombustivelAtual(),aux.getTamanhoDeposito(),aux.getAutonomia(), aux.getCondicao());
    }

    // get's e set's
    public double getConsumoKm() {
        return this.consumoKm;
    }

    public void setConsumoKm(double consumoKm) {
        this.consumoKm = consumoKm;
    }

    public double getCombustivelAtual(){return this.combustivelAtual;}

    public void setCombustivelAtual(double combustivelAtual) {this.combustivelAtual = combustivelAtual;}

    public double getTamanhoDeposito(){return this.tamanhoDeposito;}

    public void setTamanhoDeposito(double tamanhoDeposito) {this.tamanhoDeposito = tamanhoDeposito;}

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
        Gasolina aux = (Gasolina) o;
        return
                Double.compare(aux.getPrecoKm(), this.getPrecoKm()) == 0 &&
                        Double.compare(aux.getVelocidadeKm(), this.getVelocidadeKm()) == 0 &&
                        Double.compare(aux.getConsumoKm(), this.getConsumoKm()) == 0 &&
                        Double.compare(aux.getClassificacao(), this.getClassificacao()) == 0 &&
                        Double.compare(aux.getCombustivelAtual(), this.getCombustivelAtual()) == 0 &&
                        Double.compare(aux.getTamanhoDeposito(), this.getTamanhoDeposito()) == 0 &&
                        Double.compare(aux.getAutonomia(), this.getAutonomia()) == 0 &&
                        this.getMatricula().equals(aux.getMatricula()) &&
                        this.getLocalizacao().equals(aux.getLocalizacao()) &&
                        this.getDescricao().equals(aux.getDescricao()) &&
                        this.getCondicao().equals(aux.getCondicao()) &&
                        this.getProprietario().equals(aux.getProprietario()) &&
                        this.getNrClassificacoes() == aux.getNrClassificacoes();
    }

    public Gasolina clone (){
        Gasolina aux = new Gasolina(this);
        return aux;
    }

    public String toString() {
        return "Gasolina{" +
                "Matricula: '" + this.getMatricula() + '\'' +
                ", localizacao: " + this.getLocalizacao() + '\'' +
                ", precoKm: " + this.getPrecoKm() + '\'' +
                ", velocidadeKm: " + this.getVelocidadeKm() + '\'' +
                ", classificacao: " + this.getClassificacao() + '\'' +
                ", descricao: '" + this.getDescricao() + '\'' +
                ", proprietario: " + this.getProprietario().getEmail() + '\'' +
                ", consumo po Km:" + this.getConsumoKm() + '\'' +
                ", combustivel Atual: " + this.getCombustivelAtual() + '\'' +
                ", tamanho do Deposito: " + this.getTamanhoDeposito() + '\'' +
                ", autonomia: " + this.getAutonomia() + '\'' +
                '}';
    }

    // método de abstecimento
    public int abasteceGasolina(double combustivelAux){
        if ((this.getCombustivelAtual() + combustivelAux) > this.getTamanhoDeposito()) return -1;
        else {
            double resultado;
            resultado = this.getCombustivelAtual() + combustivelAux;
            this.setCombustivelAtual(resultado);
            return 1;
        }
    }

    // atualizar após uma viagem
    public void atualizaG(Ponto destino){
    double distancia = this.getLocalizacao().distanciaPonto(destino);
    this.setAutonomia(this.getAutonomia()-distancia);
    this.setCombustivelAtual(this.getCombustivelAtual()-(distancia * this.getConsumoKm()));
    if (this.getCombustivelAtual()/this.getTamanhoDeposito()<0.1) this.setCondicao(false);
    this.setLocalizacao(destino);
    }

    public double calculaAutonomiaG(){
        double autonomia = 0;
        autonomia = this.getCombustivelAtual()/this.getConsumoKm();
        return autonomia;
    }

    public void calculaCombustivelG(){
        double x = 0;
        x = this.getAutonomia() * this.getConsumoKm();
        this.setCombustivelAtual(x);
        this.setTamanhoDeposito(x);
    }




}

