import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Cliente extends Ator implements Serializable
{
    // variaveis de instancia
    private Ponto localizacao;

    // construtores
    public Cliente(){
        super();
        this.localizacao = new Ponto();
    }

    public Cliente(String emailAux, String nomeAux, String passwordAux, String moradaAux, Date dataNascimentoAux,double classificacaoAux,List<Realizado> alugueresAux,int nrClassificaoesAux, Ponto localizacaoAux) {
        super(emailAux,nomeAux,passwordAux,moradaAux,dataNascimentoAux,classificacaoAux,alugueresAux,nrClassificaoesAux);
        this.localizacao=localizacaoAux;
    }

    public Cliente(Cliente c){
        this(c.getEmail(),c.getNome(),c.getPassword(),c.getMorada(),c.getDataNascimento(),c.getClassificacao(),c.getAlugueres(),c.getNrClassificacoes(),c.getLocalizacao());
    }

    // set's e get's
    public Ponto getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(Ponto localizacaoAux) {
        this.localizacao = localizacaoAux;
    }

    // metodos equals, toString e clone
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        if (super.equals(object)==false) return false;
        Cliente aux = (Cliente) object;
        return (this.getLocalizacao().equals(aux.getLocalizacao()));
    }

    public Cliente clone(){
        return new Cliente(this);
    }

    public String toString(){
        return  "Cliente{" +
                "  Email: " + this.getEmail() + '\'' +
                ", nome: " + this.getNome() + '\'' +
                ", morada: " + this.getMorada() + '\'' +
                ", dataNascimento: " + this.getDataNascimento() +
                ", alugueres: " + this.getAlugueres().toString() + '\'' +
                ", classificacao:  " + this.getClassificacao() + '\'' +
                ", localização: " + this.getLocalizacao().toString() + '}';
    }


    // funcionalidades
    public void atualizaC(Ponto dest,Realizado r){
        ArrayList<Realizado> list = new ArrayList<Realizado>(this.getAlugueres());
        list.add(r);
        this.setAlugueres(list);
        this.setLocalizacao(dest);
    }

    public void atualizaClogs(Realizado r){
        ArrayList<Realizado> list = new ArrayList<Realizado>(this.getAlugueres());
        list.add(r);
        this.setAlugueres(list);
    }
}
