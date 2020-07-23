import java.io.Serializable;
import java.util.*;

public class GestaoAtor implements Serializable
{
    // variaveis instancia
    private HashMap<String,Ator> atores; // String = email

    // construtores
    public GestaoAtor(){
        this.atores = new HashMap();
    }

    public GestaoAtor(HashMap<String,Ator> atoresAux){
        this.atores = new HashMap();
        for(Ator a: atoresAux.values())
            this.atores.put(a.getEmail(),a.clone());
    }

    public GestaoAtor(GestaoAtor g){
        this.atores = g.getAtor();
    }

    // get's e set's
    public HashMap<String,Ator> getAtor() {
        HashMap<String,Ator> aux = new HashMap<>();
        for(Ator a: this.atores.values())
            aux.put(a.getEmail(),a.clone());
        return  aux;
    }

    public void setAtor(HashMap<String,Ator> atores) {
        this.atores = new HashMap<>();
        for(Ator a : atores.values())
            this.atores.put(a.getEmail(),a.clone());
    }

    // metodos equals, clone e toString

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        GestaoAtor aux = (GestaoAtor) object;
        return aux.getAtor().equals(this.getAtor());
    }

    public GestaoAtor clone(){
        return new GestaoAtor(this);
    }

    public String toString(){
        return "Os Atores são:" + this.getAtor();
    }
    // métodos que permitem fazer outras funcionalidades

    public void addAtor(Ator a){
        this.atores.put(a.getEmail(),a.clone());
    }

    public void addCliente(Cliente a){
        this.atores.put(a.getEmail(),a.clone());
    }

    public void addProprietario(Proprietario p){
        this.atores.put(p.getEmail(),p.clone());
    }

    public boolean verifica(String e){
        return(atores.containsKey(e));
    }

    public boolean loginCl(String email, String pass){
        if((this.verifica(email)) == false) return false;
        if ((this.getAtor().get(email).getPassword().equals(pass) == true) && (this.getAtor().get(email) instanceof Cliente)) return true;
        else return false;

    }

    public boolean loginProp(String email, String pass){
        if((this.verifica(email)) == false) return false;
        if ((this.getAtor().get(email).getPassword().equals(pass) == true) && (this.getAtor().get(email) instanceof Proprietario)) return true;
        else return false;
    }

    public void atualizaCliente(Ponto dest,String mail,Realizado r){
        ((Cliente)(this.atores.get(mail))).atualizaC(dest,r);
    }

    public void atualizaClientelogs(String mail,Realizado r){
        ((Cliente)(this.atores.get(mail))).atualizaClogs(r);
    }

    public void atualizaProp(Realizado r, String mail) {((Proprietario)(this.atores.get(mail))).atualizaP(r);}

    public void atualizaClassificacaoCliente(double c, Cliente cl){
        if (this.atores.get(cl.getEmail()).getNrClassificacoes() == 0 ) {
            this.atores.get(cl.getEmail()).setClassificacao(c);
            this.atores.get(cl.getEmail()).setNrClassificacoes(1);
        }
        else {
            this.atores.get(cl.getEmail()).setClassificacao(((c)+ (this.atores.get(cl.getEmail()).getClassificacao() * this.atores.get(cl.getEmail()).getNrClassificacoes())) / (this.atores.get(cl.getEmail()).getNrClassificacoes() +1)) ;
            this.atores.get(cl.getEmail()).setNrClassificacoes(this.atores.get(cl.getEmail()).getNrClassificacoes() + 1);
        }
    }

    public void atualizaClassificacaoProprietario(double c, Proprietario p){
        if (this.atores.get(p.getEmail()).getNrClassificacoes() == 0 ) {
            this.atores.get(p.getEmail()).setClassificacao(c);
            this.atores.get(p.getEmail()).setNrClassificacoes(1);
        }
        else {
            this.atores.get(p.getEmail()).setClassificacao(((c)+ (this.atores.get(p.getEmail()).getClassificacao() * this.atores.get(p.getEmail()).getNrClassificacoes())) / (this.atores.get(p.getEmail()).getNrClassificacoes() +1)) ;
            this.atores.get(p.getEmail()).setNrClassificacoes(this.atores.get(p.getEmail()).getNrClassificacoes() + 1);
        }
    }
}
