import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Realizado extends Aluguer implements Serializable
{   // variaveis de instancia
    private double classificacaoProprietario;
    private double classificacaoCliente;
    private double classificacaoVeiculo;
    private double precoViagem;
    private double duracaoViagem;
    private double tamanhoViagem; // em km

    // construtores
    public Realizado(){
        super();
        this.classificacaoProprietario = -1;
        this.classificacaoCliente = -1;
        this.classificacaoVeiculo = -1;
        this.duracaoViagem = -1;
        this.tamanhoViagem = -1;

    }

    public Realizado(int idAux, Veiculo veiculoAux, Date dataAux, Cliente clienteAux, Proprietario proprietarioAux, double classificacaoProprietarioAux,double classificacaoClienteAux, double classificacaoVeiculoAux, double precoViagemAux,double duracaoViagemAux,double tamanhoViagemAux){
        super(idAux,veiculoAux,dataAux,clienteAux, proprietarioAux);
        this.classificacaoProprietario = classificacaoProprietarioAux;
        this.classificacaoCliente = classificacaoClienteAux;
        this.classificacaoVeiculo = classificacaoVeiculoAux;
        this.precoViagem = precoViagemAux;
        this.duracaoViagem = duracaoViagemAux;
        this.tamanhoViagem = tamanhoViagemAux;
    }

    public  Realizado(Realizado r){
        this(r.getId(), r.getVeiculo(),r.getData(),r.getCliente(),r.getProprietario(),r.getClassificacaoProprietario(),r.getClassificacaoCliente(),r.getClassificacaoVeiculo(),r.getPrecoViagem(),r.getDuracaoViagem(),r.getTamanhoViagem());
    }

    // get's e set's


    public double getClassificacaoProprietario() {
        return this.classificacaoProprietario;
    }

    public void setClassificacaoProprietario(double classificacaoProprietario) {
        this.classificacaoProprietario = classificacaoProprietario;
    }

    public double getClassificacaoCliente() {
        return this.classificacaoCliente;
    }

    public void setClassificacaoCliente(double classificacaoCliente) {
        this.classificacaoCliente = classificacaoCliente;
    }

    public double getClassificacaoVeiculo() {
        return this.classificacaoVeiculo;
    }

    public void setClassificacaoVeiculo(double classificacaoVeiculo) {
        this.classificacaoVeiculo = classificacaoVeiculo;
    }

    public double getPrecoViagem() {
        return this.precoViagem;
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public double getDuracaoViagem() {
        return this.duracaoViagem;
    }

    public void setDuracaoViagem(double duracaoViagem) {
        this.duracaoViagem = duracaoViagem;
    }

    public double getTamanhoViagem() {
        return this.tamanhoViagem;
    }

    public void setTamanhoViagem(double tamanhoViagem) {
        this.tamanhoViagem = tamanhoViagem;
    }


    // metodos equals , clone e toString

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Realizado realizado = (Realizado) o;
        return Double.compare(realizado.getClassificacaoProprietario(), this.classificacaoProprietario) == 0 &&
                Double.compare(realizado.getClassificacaoCliente(), this.classificacaoCliente) == 0 &&
                Double.compare(realizado.getClassificacaoVeiculo(), this.classificacaoVeiculo) == 0 &&
                Double.compare(realizado.getPrecoViagem(), this.precoViagem) == 0 &&
                Double.compare(realizado.getDuracaoViagem(), this.duracaoViagem) == 0 &&
                Double.compare(realizado.getTamanhoViagem(), this.tamanhoViagem) == 0;
    }


    public Realizado clone(){
        return  new Realizado(this);
    }

    public String toString() {
        return "Realizado{" +
                "Id: " + this.getId() +
                ", veiculo: " + this.getVeiculo().getMatricula() +
                ", data: " + this.getData().toString() +
                ", cliente: " + this.getCliente().getEmail() +
                ", proprietario: " + this.getProprietario().getEmail() +
                ", classificação do Proprietário: " + this.getClassificacaoProprietario() +
                ", classificação do Cliente: " + this.getClassificacaoCliente() +
                ", classificação do Veiculo: " + this.getClassificacaoVeiculo() +
                ", preço da Viagem: " + this.getPrecoViagem() +
                ", duração de Viagem: " + this.getDuracaoViagem() +
                ", tamanho de Viagem: " + this.getTamanhoViagem() + '}';
    }

    public void classificaProp(double classificacao){
        this.setClassificacaoCliente(classificacao);

    }

    public void classificaCliente(double clprop,double clveiculo){
        this.setClassificacaoProprietario(clprop);
        this.setClassificacaoVeiculo(clveiculo);
    }

}
