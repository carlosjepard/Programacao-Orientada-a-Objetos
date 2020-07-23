import java.io.Serializable;
import java.util.*;

public class GestaoAluguer implements Serializable {
    // variaveis instancia
    private HashMap<Integer, Aluguer> alugueres; // int = idAluguer

    // construtores
    public GestaoAluguer() {
        this.alugueres = new HashMap();
    }

    public GestaoAluguer(HashMap<Integer, Aluguer> alugueresAux) {
        this.alugueres = new HashMap();
        for (Aluguer a : alugueresAux.values())
            this.alugueres.put(a.getId(), a.clone());
    }

    public GestaoAluguer(GestaoAluguer g) {
        this.alugueres = g.getAluguer();
    }

    // get's e set's
    public HashMap<Integer, Aluguer> getAluguer() {
        HashMap<Integer, Aluguer> aux = new HashMap<>();
        for (Aluguer a : this.alugueres.values())
            aux.put(a.getId(), a.clone());
        return aux;
    }

    public void setAlugueres(HashMap<Integer, Aluguer> alugueres) {
        this.alugueres = new HashMap<>();
        for (Aluguer a : this.alugueres.values())
            this.alugueres.put(a.getId(), a.clone());
    }

    // metodos equals, clone e toString

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        GestaoAluguer aux = (GestaoAluguer) object;
        return aux.getAluguer().equals(this.getAluguer());
    }

    public GestaoAluguer clone() {
        return new GestaoAluguer(this);
    }

    // funcionalidades
    public void addPedido(Pedido p) {
        this.alugueres.put(p.getId(), p.clone());
    }

    public void addRealizado(Realizado r) {
        this.alugueres.put(r.getId(), r.clone());
    }

    public void remove(String matricula, Cliente cliente) {
        //HashMap<Integer,Aluguer> map = new HashMap<Integer,Aluguer>();
        ArrayList<Aluguer> l = new ArrayList<Aluguer>(this.getAluguer().values());
        this.setAlugueres(new HashMap<Integer, Aluguer>());
        for (Aluguer a : l) {
            if (a instanceof Pedido) {
                if ((a.getVeiculo().getMatricula().equals(matricula) || a.getCliente().getEmail().equals(cliente.getEmail())) && (((Pedido) a).getflagRespondido() == false)) {
                    ((Pedido) a).setFlagRespondido(true);
                    ((Pedido) a).setRespostaProp(false);
                    this.addPedido((Pedido) a);
                } else this.addPedido((Pedido) a);
            } else this.addRealizado((Realizado) a);
        }
    }

    // classificar aluguer
    // método para prop
    public void classificacaoProprietario(int id, double c) {
        ((Realizado) (this.alugueres.get(id))).classificaProp(c);
    }

    // método para cliente
    public void classificacaoCliente(int id, double p, double v) {
        ((Realizado) (this.alugueres.get(id))).classificaCliente(p, v);
    }


    public List<Realizado> getRealizados() {
        List<Aluguer> list = new ArrayList<>(this.alugueres.values());
        List<Realizado> r = new ArrayList<>();

        for (Aluguer a : list)
            if (a instanceof Realizado) r.add((Realizado) a);
    return r;
}

    // listagem alugueres para classificar

    public List<Realizado> realizadosClassificarCliente(Cliente c) {
        List<Realizado> result = new ArrayList<>(this.getRealizados());
        List<Realizado> result2 = new ArrayList<>();

        for (Realizado r : result) {
            if (r.getCliente().getEmail().equals(c.getEmail())){
                if ((r.getClassificacaoProprietario() == -1) && (r.getClassificacaoVeiculo() == -1))
                    result2.add(r);
            }
        }

        return result2;
    }

    public List<Realizado> realidadosClassificarProp(Proprietario p) {
        List<Aluguer> list = new ArrayList<Aluguer>(this.getRealizados());
        List<Realizado> result = new ArrayList<>();

        for (Aluguer a : list) {
            if ((a.getProprietario().getEmail().equals(p.getEmail())) && (a instanceof Realizado)) {
                if (((Realizado) a).getClassificacaoCliente() == -1) result.add(((Realizado) a));
            }
        }

        return result;
    }

    // faturado por veiculo entre datas
    public double faturacao(String m,Date inicio,Date fim){
        double result = 0;
        List<Aluguer> list = new ArrayList<Aluguer>(this.getRealizados());

        for (Aluguer a: list){
            if (a.getVeiculo().getMatricula().equals(m) && a.getData().after(inicio) && a.getData().before(fim)) result = result + (((Realizado)a).getPrecoViagem());
    }
    return  result;
    }





}
