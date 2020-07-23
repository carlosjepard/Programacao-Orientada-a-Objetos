import java.io.Serializable;
import java.util.Objects;

public abstract class Veiculo implements Serializable {

    // Váriaveis de instancia
    private String matricula;
    private Ponto localizacao;
    private double precoKm;
    private double velocidadeKm;
    private double classificacao;
    private String descricao;
    private Proprietario proprietario;
    private int nrClassificacoes;

    // get's e set's
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matriculaAux) {
        this.matricula = matriculaAux;
    }

    public Ponto getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(Ponto localizacaoAux) {
        this.localizacao = localizacaoAux;
    }

    public double getPrecoKm() {
        return this.precoKm;
    }

    public void setPrecoKm(double precoKmAux) {
        this.precoKm = precoKmAux;
    }

    public double getVelocidadeKm() {
        return this.velocidadeKm;
    }

    public void setVelocidadeKm(double velocidadeKmAux) {
        this.velocidadeKm = velocidadeKmAux;
    }

    public double getClassificacao() {
        return this.classificacao;
    }

    public void setClassificacao(double classificacaoAux) {
        this.classificacao = classificacaoAux;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricaoAux) {
        this.descricao = descricaoAux;
    }

    public Proprietario getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Proprietario proprietarioAux) {
        this.proprietario = proprietarioAux;
    }

    public int getNrClassificacoes() {
        return this.nrClassificacoes;
    }

    public void setNrClassificacoes(int nrClassificacoesAux) {
        this.nrClassificacoes = nrClassificacoesAux;
    }

    // construtores
    public Veiculo(String matriculaAux,Ponto localizacaoAux,double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux,Proprietario proprietarioAux) {
        this.matricula = matriculaAux;
        this.localizacao = new Ponto(localizacaoAux);
        this.precoKm = precoKmAux;
        this.velocidadeKm = velocidadeKmAux;
        this.classificacao = classificacaoAux;
        this.descricao = descricaoAux;
        this.proprietario = proprietarioAux;
        this.nrClassificacoes = 0;
    }

    public Veiculo(){
        Ponto p = new Ponto();
        Proprietario pr = new Proprietario();
        this.matricula = "";
        this.localizacao = p;
        this.precoKm = 0;
        this.velocidadeKm = 0;
        this.classificacao = 0;
        this.descricao = "";
        this.proprietario = pr;
        this.nrClassificacoes = 0;

    }

    public Veiculo(Veiculo aux){
        this.matricula = aux.getMatricula();
        this.localizacao = aux.getLocalizacao();
        this.precoKm = aux.getPrecoKm();
        this.velocidadeKm = aux.getVelocidadeKm();
        this.classificacao = aux.getClassificacao();
        this.descricao = aux.getDescricao();
        this.proprietario = aux.getProprietario();
        this.nrClassificacoes = aux.getNrClassificacoes();
    }

    // métodos: equals, toString e clone
    public abstract boolean equals(Object o);
    public  abstract Veiculo clone();


    public String toString() {
        return "Veiculo{" +
                "Matricula: '" + this.getMatricula() + '\'' +
                ", localizacao: " + this.getLocalizacao() +
                ", precoKm: " + this.getPrecoKm() +
                ", velocidadeKm:" + this.getVelocidadeKm() +
                ", classificacao: " + this.getClassificacao() +
                ", descricao: '" + this.getDescricao() + '\'' +
                ", proprietario: " + this.getProprietario() +
                '}';
    }

    // métodos para abastecimento de veiculos
    public boolean verificaDono(Proprietario p){
        if (this.getProprietario().getEmail().equals(p.getEmail())) return true;
        else return false;
    }

    // método de alteracaoPreco
    public void alteracaPrecoKm(double p){
        this.setPrecoKm(p);
    }
}