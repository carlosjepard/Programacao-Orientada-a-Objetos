import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Proprietario extends Ator implements Serializable
{
    // construtores
    public Proprietario(){
        super();
    }

    public Proprietario(String emailAux, String nomeAux, String passwordAux, String moradaAux, Date dataNascimentoAux,double classificacaoAux,List<Realizado> alugueresAux,int nrClassificacoesAux) {
        super(emailAux,nomeAux,passwordAux,moradaAux,dataNascimentoAux,classificacaoAux,alugueresAux,nrClassificacoesAux);
    }

    public Proprietario(Proprietario p){
        this(p.getEmail(),p.getNome(),p.getPassword(),p.getMorada(),p.getDataNascimento(),p.getClassificacao(),p.getAlugueres(),p.getNrClassificacoes());
    }


    // metodos equals, clone e toString
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        if (super.equals(object)==false) return false;
        else return true;
    }

    public Proprietario clone(){
        return new Proprietario(this);
    }

    public String toString() {
        return  "Proprietário {" +
                "  Email: " + this.getEmail() + '\'' +
                ", nome: " + this.getNome() + '\'' +
                ", morada: " + this.getMorada() + '\'' +
                ", dataNascimento: " + this.getDataNascimento() +
                ", alugueres: " + this.getAlugueres().toString() + '\'' +
                ", classificacao:  " + this.getClassificacao() + '\'' +
                '}';
    }

    public void atualizaP(Realizado r){
        ArrayList<Realizado> list = new ArrayList<Realizado>(this.getAlugueres());
        list.add(r);
        this.setAlugueres(list);
    }
}

