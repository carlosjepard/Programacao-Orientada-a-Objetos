import java.io.Serializable;
import java.util.Date;

public class Aluguer implements Serializable
{
    // variaveis de instancia
    private int id;
    private Veiculo veiculo;
    private Date data;
    private Cliente cliente;
    private Proprietario proprietario;

    // construtores
    public Aluguer() {
        this.id = -1;
        this.veiculo = new Eletrico();
        this.data = null;
        this.cliente = new Cliente();
        this.proprietario = new Proprietario();
    }

    public Aluguer(int idAux, Veiculo veiculoAux, Date dataAux, Cliente clienteAux, Proprietario proprietarioAux){
        this.id = idAux;
        this.veiculo = veiculoAux; // ver melhor dps..
        this.data = dataAux;
        this.cliente = new Cliente(clienteAux);
        this.proprietario = new Proprietario(proprietarioAux);
    }

    public Aluguer(Aluguer a){
        this.id = a.getId();
        this.veiculo = a.getVeiculo(); // ver melhor dps..
        this.data = a.getData();
        this.cliente = new Cliente(a.getCliente());
        this.proprietario = new Proprietario(a.getProprietario());
    }

    // get's e set's
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Proprietario getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    // metodos equals, clone e toString
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Aluguer aux = (Aluguer) object;
        return  this.id == aux.id &&
                this.getVeiculo().equals(aux.getVeiculo()) &&
                this.getData().equals(aux.getData()) &&
                this.getVeiculo().equals(aux.getVeiculo()) &&
                this.getCliente().equals(aux.getCliente());
    }

    public Aluguer clone(){
        return new Aluguer(this);
    }



}
