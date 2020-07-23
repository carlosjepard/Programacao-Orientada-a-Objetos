import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class Ator implements Serializable {

    // Váriaveis de instancia
    private String email;
    private String nome;
    private String password;
    private String morada;
    private Date dataNascimento;
    private double classificacao;
    private List<Realizado> alugueres;
    private int nrClassificacoes;


    // construtores
    public Ator(String emailAux, String nomeAux, String passwordAux, String moradaAux,Date dataNascimentoAux,double classificacaoAux,List<Realizado> alugueresAux,int nrClassificacoesAux) {
        this.email = emailAux;
        this.nome = nomeAux;
        this.password = passwordAux;
        this.morada = moradaAux;
        this.dataNascimento = dataNascimentoAux;
        this.classificacao = classificacaoAux;
        this.nrClassificacoes = nrClassificacoesAux;
        this.alugueres = new ArrayList<Realizado>();
        for(Realizado r : alugueresAux)
            this.alugueres.add(r);
    }

    public Ator(){
        this.email = "";
        this.nome = "";
        this.password = "";
        this.morada = "";
        this.dataNascimento = null;
        this.classificacao = 0;
        this.alugueres = new ArrayList<>();
        this.nrClassificacoes = 0;
    }

    public Ator(Ator a){
        this(a.getEmail(),a.getNome(),a.getPassword(),a.getMorada(),a.getDataNascimento(),a.getClassificacao(),a.getAlugueres(),a.getNrClassificacoes());
    }

    // get's e set's
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String emailAux) {
        this.email = emailAux;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nomeAux) {
        this.nome = nomeAux;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String passwordAux) {
        this.password = passwordAux;
    }

    public String getMorada() {
        return this.morada;
    }

    public void setMorada(String moradaAux) {
        this.morada = moradaAux;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimentoAux) {
        this.dataNascimento = dataNascimentoAux;
    }

    public double getClassificacao(){ return this.classificacao;}

    public void setClassificacao(double classificacaoAux){ this.classificacao = classificacaoAux;}

    public List<Realizado> getAlugueres(){
        List<Realizado> l = new ArrayList();
        for(Realizado r : this.alugueres)
            l.add(r);
        return l;
    }

    public void setAlugueres(List<Realizado> l){
        this.alugueres = new ArrayList<>();
        for(Realizado r : l)
            this.alugueres.add(r);
    }

    public int getNrClassificacoes() {
        return this.nrClassificacoes;
    }

    public void setNrClassificacoes(int nrClassificacoesAux) {
        this.nrClassificacoes = nrClassificacoesAux;
    }

    // métodos: equals, toString e clone
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ator ator = (Ator) o;
        return this.email.equals(ator.email) &&
                this.nome.equals(ator.nome) &&
                this.password.equals(ator.password) &&
                this.morada.equals(ator.morada) &&
                this.dataNascimento.equals(ator.dataNascimento) &&
                this.getAlugueres().equals(ator.getAlugueres()) &&
                this.getNrClassificacoes() == ator.getNrClassificacoes();
    }

    public Ator clone(){
        return new Ator(this);}


    public String toString() {
        return  "Ator{" +
                "  email: " + this.getEmail() + '\'' +
                ", nome: " + this.getNome() + '\'' +
                ", password: " + this.getPassword() + '\'' +
                ", morada: " + this.getMorada() + '\'' +
                ", dataNascimento: " + this.getDataNascimento() + '\'' +
                ", classificacao: " + this.getClassificacao() + '\'' +
                ", alugueres: " + this.alugueres.toString();
    }

}






