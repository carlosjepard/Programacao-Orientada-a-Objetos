import java.io.Serializable;

public class Bicicleta extends Veiculo implements Serializable
{
    // construtores
    public Bicicleta(){
        super();
    }

    public Bicicleta(String matriculaAux,Ponto localizacaoAux,double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux,Proprietario proprietarioAux) {
        super(matriculaAux,localizacaoAux,precoKmAux,velocidadeKmAux,classificacaoAux,descricaoAux,proprietarioAux);
        //this.setNrClassificacoes(0);
    }

    public Bicicleta(Bicicleta aux){
        this(aux.getMatricula(),aux.getLocalizacao(),aux.getPrecoKm(),aux.getVelocidadeKm(),aux.getClassificacao(),aux.getDescricao(),aux.getProprietario());
    }

    // metodos equals, clone e toString
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicicleta aux = (Bicicleta) o;
        return  Double.compare(aux.getPrecoKm(), this.getPrecoKm()) == 0 &&
                Double.compare(aux.getVelocidadeKm(), this.getVelocidadeKm()) == 0 &&
                Double.compare(aux.getClassificacao(), this.getClassificacao()) == 0 &&
                this.getMatricula().equals(aux.getMatricula()) &&
                this.getLocalizacao().equals(aux.getLocalizacao()) &&
                this.getDescricao().equals(aux.getDescricao()) &&
                this.getProprietario().equals(aux.getProprietario()) &&
                this.getNrClassificacoes() == aux.getNrClassificacoes();
    }

    public Bicicleta clone (){
        Bicicleta aux = new Bicicleta(this);
        return aux;
    }

    public String toString() {
        return "Bicicleta{" +
                "Matricula: '" + this.getMatricula() + '\'' +
                ", localizacao: " + this.getLocalizacao() + '\'' +
                ", preço po Km: " + this.getPrecoKm() + '\'' +
                ", velocidade por Km: " + this.getVelocidadeKm() + '\'' +
                ", classificacao: " + this.getClassificacao() + '\'' +
                ", descricao: '" + this.getDescricao() + '\'' +
                ", proprietario: " + this.getProprietario().getEmail() + '\'' +
                '}';
    }

    public void atualizaB(Ponto destino){
        this.setLocalizacao(destino);
    }

}
