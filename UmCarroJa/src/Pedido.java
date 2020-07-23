import java.io.Serializable;
import java.util.Date;

public class Pedido extends Aluguer implements Serializable
{   // variaveis de instancia
    private boolean respostaProp;
    private boolean flagRespondido;
    private Ponto destino;
    private double tempo;

    // construtores
    public Pedido(){
        super();
        this.respostaProp = false;
        this.flagRespondido = false;
        this.destino = new Ponto();
        this.tempo = 0;
    }

    public Pedido(int idAux, Veiculo veiculoAux, Date dataAux, Cliente clienteAux, Proprietario proprietarioAux, boolean respostaPropAux, boolean flagRespondidoAux,Ponto destinoAux,double tempoAux ){
        super(idAux,veiculoAux,dataAux,clienteAux, proprietarioAux);
        this.respostaProp = respostaPropAux;
        this.flagRespondido = flagRespondidoAux;
        this.destino = destinoAux;
        this.tempo = tempoAux;
    }

    public Pedido(Pedido p){
        this(p.getId(), p.getVeiculo(),p.getData(),p.getCliente(),p.getProprietario(),p.getRespostaProp(),p.getflagRespondido(),p.getDestino(),p.getTempo());
    }

    // get's e set's
    public boolean getRespostaProp() {
        return this.respostaProp;
    }

    public void setRespostaProp(boolean respostaPropAux) {
        this.respostaProp = respostaPropAux;
    }

    public boolean getflagRespondido(){ return this.flagRespondido;}

    public void setFlagRespondido(boolean flagRespondidoAux){this.flagRespondido = flagRespondidoAux; }

    public double getTempo() {
        return this.tempo;
    }

    public void setTempo(double tempoAux) {
        this.tempo = tempoAux;
    }

    public Ponto getDestino() {
        return this.destino;
    }

    public void setDestino(Ponto destino) {
        this.destino = destino;
    }

    // metodos equals, clone e toString
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Pedido pedido = (Pedido) object;
        return (this.getRespostaProp() == pedido.getRespostaProp()) && (this.getflagRespondido() == pedido.getflagRespondido()) && (this.getTempo() == pedido.getTempo()) && (this.getDestino() == pedido.getDestino());
    }


    public Pedido clone(){
        return new Pedido(this);
    }

    public String toString() {
        return "Pedido{" +
                "Id: " + this.getId() +
                ", veiculo: " + this.getVeiculo().getMatricula() +
                ", data: " + this.getData().toString() +
                ", cliente: " + this.getCliente().getEmail()+
                ", classificação do cliente: " + this.getCliente().getClassificacao() +
                ", tempo: " + this.getTempo() +
                ", resposta do Proprietário: " + this.getRespostaProp() +
                ", destino: " + this.getDestino() +

                '}';
    }

}
