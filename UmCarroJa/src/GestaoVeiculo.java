import java.io.Serializable;
import java.util.*;

public class GestaoVeiculo implements Serializable {
    // variaveis instancia
    private HashMap<String,Veiculo> veiculos; // String = matricula

    // construtores
    public GestaoVeiculo(){
        this.veiculos = new HashMap();
    }

    public GestaoVeiculo (HashMap<String,Veiculo> veiculosAux){
        this.veiculos = new HashMap<String,Veiculo>();
        for(Veiculo v: veiculosAux.values())
            this.veiculos.put(v.getMatricula(),v.clone());
    }

    public GestaoVeiculo(GestaoVeiculo g){
        this.veiculos = g.getVeiculo();
    }

    // get's e set's
    public HashMap<String,Veiculo> getVeiculo() {
        HashMap<String,Veiculo> aux = new HashMap<>();
        for(Veiculo v: this.veiculos.values())
            aux.put(v.getMatricula(),v.clone());
        return aux;
    }

    public void setVeiculo(HashMap<String,Veiculo> veiculos) {
        this.veiculos = new HashMap<>();
        for(Veiculo v : veiculos.values())
            this.veiculos.put(v.getMatricula(),v.clone());
    }

    // metodos equals, clone e toString

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        GestaoVeiculo aux = (GestaoVeiculo) object;
        return aux.getVeiculo().equals(this.getVeiculo());
    }

    public GestaoVeiculo clone(){
        return new GestaoVeiculo(this);
    }

    // funcionalidade
    public void addVeiculo(Veiculo v){
        this.veiculos.put(v.getMatricula(),v.clone());
    }

    public boolean verifica(String e){
        return(veiculos.containsKey(e));
    }



    public String procuraMaisBarato(Ponto destino){

        double preco = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());



        for(Veiculo v : l)
            if ((v.getPrecoKm() < preco)){
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Bicicleta) result = v.getMatricula();
                else {
                    if (v instanceof Gasolina) {
                        Gasolina aux = new Gasolina();
                        aux = (Gasolina) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        preco = v.getPrecoKm();
                    }

                    if (v instanceof Eletrico) {
                        Eletrico aux = new Eletrico();
                        aux = (Eletrico) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        preco = v.getPrecoKm();
                    }

                    if (v instanceof Hibridos) {
                        Hibridos aux = new Hibridos();
                        aux = (Hibridos) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        preco = v.getPrecoKm();
                    }

                    if (v instanceof Prancha) {
                       Prancha aux = new Prancha();
                        aux = (Prancha) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        preco = v.getPrecoKm();
                    }

                    }
                }


            return result;
    }

    public String procuraMaisBaratoGasolina(Ponto destino){


        double preco = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());

        for(Veiculo v : l)
            if ((v.getPrecoKm() < preco)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Gasolina) {
                    Gasolina aux = new Gasolina();
                    aux = (Gasolina) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    preco = v.getPrecoKm();

                }
            }

        return result;
    }

    public String procuraMaisBaratoHibrido(Ponto destino){


        double preco = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());



        for(Veiculo v : l)
            if ((v.getPrecoKm() < preco)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Hibridos) {
                    Hibridos aux = new Hibridos();
                    aux = (Hibridos) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    preco = v.getPrecoKm();

                }
            }

        return result;
    }

    public String procuraMaisBaratoEletrico(Ponto destino){


        double preco = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());

        for(Veiculo v : l)
            if ((v.getPrecoKm() < preco)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Eletrico) {
                    Eletrico aux = new Eletrico();
                    aux = (Eletrico) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    preco = v.getPrecoKm();

                }
            }

        return result;
    }

    public String procuraMaisBaratoPrancha(Ponto destino){


        double preco = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());


        for(Veiculo v : l)
            if ((v.getPrecoKm() < preco)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Prancha) {
                   Prancha aux = new Prancha();
                    aux = (Prancha) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    preco = v.getPrecoKm();

                }
            }

        return result;
    }

    public String procuraMaisBaratoBicicleta(){

        double preco = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());



        for(Veiculo v : l) {
            if ((v.getPrecoKm() < preco) && (v instanceof Bicicleta)) result = v.getMatricula();
            preco = v.getPrecoKm();
        }

        return result;
    }


    public String procuraMaisPerto(Ponto cliente,Ponto destino){

        double dist = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());


        for(Veiculo v : l)
            if ((v.getLocalizacao().distanciaPonto(cliente) < dist)){
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Bicicleta) result = v.getMatricula();
                else {
                    if (v instanceof Gasolina) {
                        Gasolina aux = new Gasolina();
                        aux = (Gasolina) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        dist = v.getLocalizacao().distanciaPonto(cliente);
                    }

                    if (v instanceof Eletrico) {
                        Eletrico aux = new Eletrico();
                        aux = (Eletrico) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        dist = v.getLocalizacao().distanciaPonto(cliente);
                    }

                    if (v instanceof Hibridos) {
                        Hibridos aux = new Hibridos();
                        aux = (Hibridos) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        dist = v.getLocalizacao().distanciaPonto(cliente);
                    }

                    if (v instanceof Prancha) {
                        Prancha aux = new Prancha();
                        aux = (Prancha) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        dist = v.getLocalizacao().distanciaPonto(cliente);
                    }

                }
            }


        return result;
    }

    public String procuraMaisPertoGasolina(Ponto destino,Ponto cliente){


        double dist = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());


        for(Veiculo v : l)
            if ((v.getLocalizacao().distanciaPonto(cliente) < dist)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Gasolina) {
                    Gasolina aux = new Gasolina();
                    aux = (Gasolina) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    dist = v.getLocalizacao().distanciaPonto(cliente);

                }
            }

        return result;
    }

    public String procuraMaisPertoHibrido(Ponto destino,Ponto cliente){


        double dist = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());


        for(Veiculo v : l)
            if ((v.getLocalizacao().distanciaPonto(cliente) < dist)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Hibridos) {
                    Hibridos aux = new Hibridos();
                    aux = (Hibridos) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    dist = v.getLocalizacao().distanciaPonto(cliente);

                }
            }

        return result;
    }

    public String procuraMaisPertoEletrico(Ponto destino,Ponto cliente){


        double dist = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());



        for(Veiculo v : l)
            if ((v.getLocalizacao().distanciaPonto(cliente) < dist)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Eletrico) {
                    Eletrico aux = new Eletrico();
                    aux = (Eletrico) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    dist = v.getLocalizacao().distanciaPonto(cliente);

                }
            }

        return result;
    }

    public String procuraMaisPertoPrancha(Ponto destino,Ponto cliente){


        double dist = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());

        for(Veiculo v : l)
            if ((v.getLocalizacao().distanciaPonto(cliente) < dist)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Prancha) {
                    Prancha aux = new Prancha();
                    aux = (Prancha) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    dist = v.getLocalizacao().distanciaPonto(cliente);

                }
            }

        return result;
    }

    public String procuraMaisPertoBicicleta(Ponto cliente){

        double dist = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());



        for(Veiculo v : l){
            if ((v.getLocalizacao().distanciaPonto(cliente) < dist) && (v instanceof Bicicleta)) result = v.getMatricula();
            dist = v.getLocalizacao().distanciaPonto(cliente);}

        return result;
    }

    public String procuraMaisBaratoDist(Ponto destino,Ponto cliente,double dist){

        double preco = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());



        for(Veiculo v : l)
            if ((v.getPrecoKm() < preco) && (v.getLocalizacao().distanciaPonto(cliente)<=dist)){
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Bicicleta) {
                    result = v.getMatricula();
                    preco = v.getPrecoKm();
                }
                else {
                    if (v instanceof Gasolina) {
                        Gasolina aux = new Gasolina();
                        aux = (Gasolina) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        preco = v.getPrecoKm();
                    }

                    if (v instanceof Eletrico) {
                        Eletrico aux = new Eletrico();
                        aux = (Eletrico) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        preco = v.getPrecoKm();
                    }

                    if (v instanceof Hibridos) {
                        Hibridos aux = new Hibridos();
                        aux = (Hibridos) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        preco = v.getPrecoKm();
                    }

                    if (v instanceof Prancha) {
                        Prancha aux = new Prancha();
                        aux = (Prancha) v;
                        if (aux.getAutonomia()>distancia && aux.getCondicao() == true) result = aux.getMatricula();
                        preco = v.getPrecoKm();
                    }

                }
            }


        return result;
    }

    public String procuraMaisBaratoGasolinaDist(Ponto destino,Ponto cliente,double dist){


        double preco = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());



        for(Veiculo v : l)
            if ((v.getPrecoKm() < preco) && (v.getLocalizacao().distanciaPonto(cliente)<=dist)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Gasolina) {
                    Gasolina aux = new Gasolina();
                    aux = (Gasolina) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    preco = v.getPrecoKm();

                }
            }

        return result;
    }

    public String procuraMaisBaratoHibridoDist(Ponto destino,Ponto cliente, double dist){


        double preco = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());


        for(Veiculo v : l)
            if ((v.getPrecoKm() < preco) && (v.getLocalizacao().distanciaPonto(cliente)<=dist)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Hibridos) {
                    Hibridos aux = new Hibridos();
                    aux = (Hibridos) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    preco = v.getPrecoKm();

                }
            }

        return result;
    }

    public String procuraMaisBaratoEletricoDist(Ponto destino,Ponto cliente,double dist){


        double preco = 9999999999999999999.99999999999 ;
        String result = "";

        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());


        for(Veiculo v : l)
            if ((v.getPrecoKm() < preco) && (v.getLocalizacao().distanciaPonto(cliente)<=dist)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Eletrico) {
                    Eletrico aux = new Eletrico();
                    aux = (Eletrico) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    preco = v.getPrecoKm();

                }
            }

        return result;
    }

    public String procuraMaisBaratoPranchaDist(Ponto destino,Ponto cliente , double dist){


        double preco = 9999999999999999999.99999999999 ;
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());



        for(Veiculo v : l)
            if ((v.getPrecoKm() < preco) && (v.getLocalizacao().distanciaPonto(cliente)<=dist)) {
                double distancia = destino.distanciaPonto(v.getLocalizacao());
                if (v instanceof Prancha) {
                    Prancha aux = new Prancha();
                    aux = (Prancha) v;
                    if (aux.getAutonomia() > distancia && aux.getCondicao() == true) result = aux.getMatricula();
                    preco = v.getPrecoKm();

                }
            }

        return result;
    }

    public String procuraMaisBaratoBicicletaDist(Ponto cliente, double dist ){

        // ver melhor solucao para isto
        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());
        double preco = 99999999999999999999.9999999999;


        for(Veiculo v : l)
            if ((v.getPrecoKm() < preco) && (v instanceof Bicicleta)&& (v.getLocalizacao().distanciaPonto(cliente)<=dist)) {
                result = v.getMatricula();
                preco = v.getPrecoKm();
            }

        return result;
    }



    public String procuraAutonomia(Ponto destino,double autonomia){

        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());
        Iterator it = l.iterator();


        while (it.hasNext() && result.equals("")){

            Veiculo v = (Veiculo)it.next();
            double distancia = destino.distanciaPonto(v.getLocalizacao());
            if (v instanceof Gasolina) {
                Gasolina aux = new Gasolina();
                aux = (Gasolina) v;
                if (aux.getAutonomia()>distancia && aux.getCondicao() == true && aux.getAutonomia()>autonomia) result = aux.getMatricula();
            }

            if (v instanceof Eletrico) {
                Eletrico aux = new Eletrico();
                aux = (Eletrico) v;
                if (aux.getAutonomia()>distancia && aux.getCondicao() == true && aux.getAutonomia()>autonomia) result = aux.getMatricula();
            }

            if (v instanceof Hibridos) {
                Hibridos aux = new Hibridos();
                aux = (Hibridos) v;
                if (aux.getAutonomia()>distancia && aux.getCondicao() == true && aux.getAutonomia()>autonomia) result = aux.getMatricula();
            }

            if (v instanceof Prancha) {
                Prancha aux = new Prancha();
                aux = (Prancha) v;
                if (aux.getAutonomia()>distancia && aux.getCondicao() == true && aux.getAutonomia()>autonomia) result = aux.getMatricula();
            }

        }

        return result;
    }

    public String procuraAutonomiaGasolina(Ponto destino,double autonomia){

        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());
        Iterator it = l.iterator();


        while (it.hasNext() && result.equals("")){

            Veiculo v = (Veiculo)it.next();
            double distancia = destino.distanciaPonto(v.getLocalizacao());
            if (v instanceof Gasolina) {
                Gasolina aux = new Gasolina();
                aux = (Gasolina) v;
                if (aux.getAutonomia()>distancia && aux.getCondicao() == true && aux.getAutonomia()>autonomia) result = aux.getMatricula();
            }
        }

        return result;
    }

    public String procuraAutonomiaHibrido(Ponto destino,double autonomia){

        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());
        Iterator it = l.iterator();


        while (it.hasNext() && result.equals("")){

            Veiculo v = (Veiculo)it.next();
            double distancia = destino.distanciaPonto(v.getLocalizacao());
            if (v instanceof Hibridos) {
                Hibridos aux = new Hibridos();
                aux = (Hibridos) v;
                if (aux.getAutonomia()>distancia && aux.getCondicao() == true && aux.getAutonomia()>autonomia) result = aux.getMatricula();
            }
        }

        return result;
    }

    public String procuraAutonomiaEletrico(Ponto destino,double autonomia){

        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());
        Iterator it = l.iterator();


        while (it.hasNext() && result.equals("")){

            Veiculo v = (Veiculo)it.next();
            double distancia = destino.distanciaPonto(v.getLocalizacao());

            if (v instanceof Eletrico) {
                Eletrico aux = new Eletrico();
                aux = (Eletrico) v;
                if (aux.getAutonomia()>distancia && aux.getCondicao() == true && aux.getAutonomia()>autonomia) result = aux.getMatricula();
            }
        }

        return result;
    }

    public String procuraAutonomiaPrancha(Ponto destino,double autonomia){

        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());
        Iterator it = l.iterator();


        while (it.hasNext() && result.equals("")){

            Veiculo v = (Veiculo)it.next();
            double distancia = destino.distanciaPonto(v.getLocalizacao());
            if (v instanceof Prancha) {
                Prancha aux = new Prancha();
                aux = (Prancha) v;
                if (aux.getAutonomia()>distancia && aux.getCondicao() == true && aux.getAutonomia()>autonomia) result = aux.getMatricula();
            }

        }

        return result;
    }

    public String procuraAutonomiaBicicleta(Ponto destino){

        String result = "";
        ArrayList<Veiculo> l = new ArrayList<Veiculo>(this.getVeiculo().values());
        Iterator it = l.iterator();


        while (it.hasNext() && result.equals("")){

            Veiculo v = (Veiculo)it.next();
            if (v instanceof Bicicleta) {
                Bicicleta aux = new Bicicleta();
                aux = (Bicicleta) v;
                result = aux.getMatricula();
            }

        }

        return result;
    }

// atualiza veiculo apos viagem
public void atualizaVeiculo(String m, Ponto dest){

    HashMap<String,Veiculo> gv = new HashMap<String,Veiculo>(this.getVeiculo());
    Veiculo v = gv.get(m);
    if (v instanceof Bicicleta){
        ((Bicicleta)v).atualizaB(dest);
    };
    if (v instanceof Hibridos){
        ((Hibridos)v).atualizaH(dest);
    };
    if (v instanceof Gasolina){
        ((Gasolina)v).atualizaG(dest);
    };
    if (v instanceof Prancha){
        ((Prancha)v).atualizaP(dest);
    };
    if (v instanceof Eletrico){
        ((Eletrico)v).atualizaE(dest);
    }
    this.setVeiculo(gv);
}

public void setCombustivel(String matriculaAux){
        if (this.veiculos.get(matriculaAux) instanceof Gasolina){
            ((Gasolina)this.veiculos.get(matriculaAux)).calculaCombustivelG();
        }
        if (this.veiculos.get(matriculaAux) instanceof Eletrico){
            ((Eletrico)this.veiculos.get(matriculaAux)).calculaCombustivelE();
         }
        if (this.veiculos.get(matriculaAux) instanceof Hibridos){
            ((Hibridos)this.veiculos.get(matriculaAux)).calculaCombustivelH();
         }
        if (this.veiculos.get(matriculaAux) instanceof Prancha){
             ((Prancha)this.veiculos.get(matriculaAux)).calculaCombustivelP();
        }
}

    public void atualizaClassificacaoVeiculo(double c, Veiculo v){
        if (this.veiculos.get(v.getMatricula()).getNrClassificacoes() == 0 ) {
            this.veiculos.get(v.getMatricula()).setClassificacao(c);
            this.veiculos.get(v.getMatricula()).setNrClassificacoes(1);
        }
        else {
            this.veiculos.get(v.getMatricula()).setClassificacao(((c)+ (this.veiculos.get(v.getMatricula()).getClassificacao() * this.veiculos.get(v.getMatricula()).getNrClassificacoes())) / (this.veiculos.get(v.getMatricula()).getNrClassificacoes() +1)) ;
            this.veiculos.get(v.getMatricula()).setNrClassificacoes(this.veiculos.get(v.getMatricula()).getNrClassificacoes() + 1);
        }
    }


}
