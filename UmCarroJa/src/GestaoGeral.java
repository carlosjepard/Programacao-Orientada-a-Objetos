import java.util.*;
import java.io.*;

public class GestaoGeral implements Serializable {
    // variaveis de instancia
    private GestaoAluguer alugueres;
    private GestaoAtor atores;
    private GestaoVeiculo veiculos;


    // construtores
    public GestaoGeral() {

        this.alugueres = new GestaoAluguer();
        this.atores = new GestaoAtor();
        this.veiculos = new GestaoVeiculo();
    }

    public HashMap<String, Ator> getAtores() {
        return this.atores.getAtor();
    }

    public HashMap<String, Veiculo> getVeiculos() {
        return this.veiculos.getVeiculo();
    }


    public HashMap<Integer, Aluguer> getAlugueres() {
        return this.alugueres.getAluguer();
    }



    // métodos para registar atores
    public void registaCliente(String emailAux, String nomeAux, String passwordAux, String moradaAux, Date dataNascimentoAux, double classificacaoAux, List<Realizado> alugueresAux, Ponto localizacaoAux) throws GestaoGeralException {
        if (atores.verifica(emailAux)) throw new GestaoGeralException(emailAux);
        else {
            Cliente c_aux = new Cliente(emailAux, nomeAux, passwordAux, moradaAux, dataNascimentoAux, classificacaoAux, alugueresAux,0, localizacaoAux);
            this.atores.addAtor(c_aux);
        }
    }

    public void registaProprietario(String emailAux, String nomeAux, String passwordAux, String moradaAux, Date dataNascimentoAux, double classificacaoAux, List<Realizado> alugueresAux) throws GestaoGeralException {
        if (atores.verifica(emailAux)) throw new GestaoGeralException(emailAux);
        else {
            Proprietario p_aux = new Proprietario(emailAux, nomeAux, passwordAux, moradaAux, dataNascimentoAux, classificacaoAux, alugueresAux,0);
            this.atores.addAtor(p_aux);
        }
    }

    // métodos para registar veiculos
    public void registaEletrico(String matriculaAux, Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux, Proprietario proprietarioAux, double consumoKmAux, double bateriaAtualAux, double tamanhoBateriaAux, double autonomiaAux, Boolean condicaoAux) throws GestaoGeralException {
        if (veiculos.verifica(matriculaAux)) throw new GestaoGeralException(matriculaAux);
        else {
            Eletrico e_aux = new Eletrico(matriculaAux, localizacaoAux, precoKmAux, velocidadeKmAux, classificacaoAux, descricaoAux, proprietarioAux, consumoKmAux, bateriaAtualAux, tamanhoBateriaAux, autonomiaAux, condicaoAux);
            this.veiculos.addVeiculo(e_aux);
        }
    }

    public void registaPrancha(String matriculaAux, Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux, Proprietario proprietarioAux, double consumoKmAux, double bateriaAtualAux, double tamanhoBateriaAux, double autonomiaAux, Boolean condicaoAux) throws GestaoGeralException {
        if (veiculos.verifica(matriculaAux)) throw new GestaoGeralException(matriculaAux);
        else {
            Prancha p_aux = new Prancha(matriculaAux, localizacaoAux, precoKmAux, velocidadeKmAux, classificacaoAux, descricaoAux, proprietarioAux, consumoKmAux, bateriaAtualAux, tamanhoBateriaAux, autonomiaAux, condicaoAux);
            this.veiculos.addVeiculo(p_aux);
        }
    }

    public void registaGasolina(String matriculaAux, Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux, Proprietario proprietarioAux, double consumoKmAux, double combustivelAtualAux, double tamanhoDepositoAux, double autonomiaAux, Boolean condicaoAux) throws GestaoGeralException {
        if (veiculos.verifica(matriculaAux)) throw new GestaoGeralException(matriculaAux);
        else {
            Gasolina g_aux = new Gasolina(matriculaAux, localizacaoAux, precoKmAux, velocidadeKmAux, classificacaoAux, descricaoAux, proprietarioAux, consumoKmAux, combustivelAtualAux, tamanhoDepositoAux, autonomiaAux, condicaoAux);
            this.veiculos.addVeiculo(g_aux);
        }
    }

    public void registaBicicleta(String matriculaAux, Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux, Proprietario proprietarioAux) throws GestaoGeralException {
        if (veiculos.verifica(matriculaAux)) throw new GestaoGeralException(matriculaAux);
        else {
            Bicicleta b_aux = new Bicicleta(matriculaAux, localizacaoAux, precoKmAux, velocidadeKmAux, classificacaoAux, descricaoAux, proprietarioAux);
            this.veiculos.addVeiculo(b_aux);
        }
    }

    public void registaHibrido(String matriculaAux, Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux, Proprietario proprietarioAux, double consumoKmAuxEletricidade,double consumoKmAuxGasolina, double bateriaAtualAux, double tamanhoBateriaAux, double combustivelAtualAux, double tamanhoDepositoAux, double autonomiaAux, Boolean condicaoAux) throws GestaoGeralException {
        if (veiculos.verifica(matriculaAux)) throw new GestaoGeralException(matriculaAux);
        else {
            Hibridos h_aux = new Hibridos(matriculaAux, localizacaoAux, precoKmAux, velocidadeKmAux, classificacaoAux, descricaoAux, proprietarioAux, consumoKmAuxEletricidade,consumoKmAuxGasolina, bateriaAtualAux, tamanhoBateriaAux, combustivelAtualAux, tamanhoDepositoAux, autonomiaAux, condicaoAux);
            this.veiculos.addVeiculo(h_aux);
        }
    }

    public void registaEletricoL(String matriculaAux, Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux, String proprietarioAux, double consumoKmAux, double autonomiaAux, Boolean condicaoAux) throws GestaoGeralException {
        if (veiculos.verifica(matriculaAux)) throw new GestaoGeralException(matriculaAux);
        else {
            Proprietario proprietarioAux2 = (Proprietario) this.getAtores().get(proprietarioAux + "@gmail.com");
            Eletrico e_aux = new Eletrico(matriculaAux, localizacaoAux, precoKmAux, velocidadeKmAux, classificacaoAux, descricaoAux, proprietarioAux2, consumoKmAux, 0, 0, autonomiaAux, condicaoAux);
            this.veiculos.addVeiculo(e_aux);
            this.veiculos.setCombustivel(matriculaAux);
        }
    }

    public void registaPranchaL(String matriculaAux, Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux, String proprietarioAux, double consumoKmAux, double autonomiaAux, Boolean condicaoAux) throws GestaoGeralException {
        if (veiculos.verifica(matriculaAux)) throw new GestaoGeralException(matriculaAux);
        else {
            Proprietario proprietarioAux2 = (Proprietario) this.getAtores().get(proprietarioAux + "@gmail.com");
            Prancha p_aux = new Prancha(matriculaAux, localizacaoAux, precoKmAux, velocidadeKmAux, classificacaoAux, descricaoAux, proprietarioAux2, consumoKmAux,0,0, autonomiaAux, condicaoAux);
            this.veiculos.addVeiculo(p_aux);
            this.veiculos.setCombustivel(matriculaAux);
        }
    }

    public void registaGasolinaL(String matriculaAux, Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux, String proprietarioAux, double consumoKmAux, double autonomiaAux, Boolean condicaoAux) throws GestaoGeralException {
        if (veiculos.verifica(matriculaAux)) throw new GestaoGeralException(matriculaAux);
        else {
            Proprietario proprietarioAux2 = (Proprietario) this.getAtores().get(proprietarioAux + "@gmail.com");
            Gasolina g_aux = new Gasolina(matriculaAux, localizacaoAux, precoKmAux, velocidadeKmAux, classificacaoAux, descricaoAux, proprietarioAux2, consumoKmAux, 0,0, autonomiaAux, condicaoAux);
            this.veiculos.addVeiculo(g_aux);
            this.veiculos.setCombustivel(matriculaAux);
        }
    }

    public void registaBicicletaL(String matriculaAux, Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux, String proprietarioAux) throws GestaoGeralException {
        if (veiculos.verifica(matriculaAux)) throw new GestaoGeralException(matriculaAux);
        else {
            Proprietario proprietarioAux2 = (Proprietario) this.getAtores().get(proprietarioAux + "@gmail.com");
            Bicicleta b_aux = new Bicicleta(matriculaAux, localizacaoAux, precoKmAux, velocidadeKmAux, classificacaoAux, descricaoAux, proprietarioAux2);
            this.veiculos.addVeiculo(b_aux);
        }
    }

    public void registaHibridoL(String matriculaAux, Ponto localizacaoAux, double precoKmAux, double velocidadeKmAux, double classificacaoAux, String descricaoAux, String proprietarioAux, double consumoKmAux, double autonomiaAux, Boolean condicaoAux) throws GestaoGeralException {
        if (veiculos.verifica(matriculaAux)) throw new GestaoGeralException(matriculaAux);
        else {
            Proprietario proprietarioAux2 = (Proprietario) this.getAtores().get(proprietarioAux + "@gmail.com");
            Hibridos h_aux = new Hibridos(matriculaAux, localizacaoAux, precoKmAux, velocidadeKmAux, classificacaoAux, descricaoAux, proprietarioAux2, consumoKmAux,consumoKmAux,0,0,0,0, autonomiaAux, condicaoAux);
            this.veiculos.setCombustivel(matriculaAux);
            this.veiculos.addVeiculo(h_aux);
        }
    }

    // métodos para login
    public void loginCliente(String emailAux, String passwordAux) throws GestaoGeralException {
        if (atores.loginCl(emailAux, passwordAux) == false) throw new GestaoGeralException(emailAux);
    }

    public void loginProprietario(String emailAux, String passwordAux) throws GestaoGeralException {
        if (atores.loginProp(emailAux, passwordAux) == false) throw new GestaoGeralException(emailAux);
    }

    public void loginAdmin(String admin,String pass) throws GestaoGeralException {
        if ((admin.equals("admin"))==false || (pass.equals("123"))==false) throw new GestaoGeralException();
    }

    // métodos para abastecimento
    public void abasteceVAUX(String matriculaAux, Proprietario prop) throws GestaoGeralException {
        if ((this.getVeiculos().get(matriculaAux) == null)) throw new GestaoGeralException(matriculaAux);
        if (((this.getVeiculos().get(matriculaAux).verificaDono(prop)) == false))
            throw new GestaoGeralException(matriculaAux);
    }

    public void abasteceE(String matriculaAux, double quantidade) throws GestaoGeralException {
        HashMap<String, Veiculo> gv = new HashMap<String, Veiculo>(this.getVeiculos());
        Eletrico e = new Eletrico();
        e = (Eletrico) gv.get(matriculaAux);
        if (e.abasteceEletrico(quantidade) == -1) throw new GestaoGeralException(matriculaAux);
        else {
            e.abasteceEletrico(quantidade);
            this.veiculos.setVeiculo(gv);
        }
    }

    public void abasteceG(String matriculaAux, double quantidade) throws GestaoGeralException {
        HashMap<String, Veiculo> gv = new HashMap<String, Veiculo>(this.getVeiculos());
        Gasolina ga = new Gasolina();
        ga = (Gasolina) gv.get(matriculaAux);
        if (ga.abasteceGasolina(quantidade) == -1) throw new GestaoGeralException(matriculaAux);
        else {
            ga.abasteceGasolina(quantidade);
            this.veiculos.setVeiculo(gv);
        }
    }

    public void abasteceH(String matriculaAux, double quantidadeC, double quantidadeE) throws GestaoGeralException {
        HashMap<String, Veiculo> gv = new HashMap<String, Veiculo>(this.getVeiculos());
        Hibridos h = new Hibridos();
        h = (Hibridos) gv.get(matriculaAux);
        if (h.abasteceHibrido(quantidadeE, quantidadeC) == -1) throw new GestaoGeralException(matriculaAux);
        else {
            h.abasteceHibrido(quantidadeE, quantidadeC);
            this.veiculos.setVeiculo(gv);
        }
    }

    public void abasteceP(String matriculaAux, double quantidade) throws GestaoGeralException {
        HashMap<String, Veiculo> gv = new HashMap<String, Veiculo>(this.getVeiculos());
        Prancha p = new Prancha();
        p = (Prancha) gv.get(matriculaAux);
        if (p.abastecePrancha(quantidade) == -1) throw new GestaoGeralException(matriculaAux);
        else {
            p.abastecePrancha(quantidade);
            this.veiculos.setVeiculo(gv);
        }
    }

    // método para alteração de preço

    public void alteraPreco(String matriculaAux, double preco, Proprietario prop) throws GestaoGeralException {
        if ((this.getVeiculos().get(matriculaAux) == null)) throw new GestaoGeralException(matriculaAux);
        if (((this.getVeiculos().get(matriculaAux).verificaDono(prop)) == false))
            throw new GestaoGeralException(matriculaAux);
        else {
            HashMap<String, Veiculo> gv = new HashMap<String, Veiculo>(this.getVeiculos());
            Veiculo v = gv.get(matriculaAux);
            v.alteracaPrecoKm(preco);
            this.veiculos.setVeiculo(gv);
        }
    }



    // métodos para registar alugueres

    //pedido mais barato

    // qualquer tipo de veiculo
    public void registaPedidoBarato(Date dataAux, Cliente clienteAux, Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBarato(destino).equals("")) throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBarato(destino)));
            int id = this.getAlugueres().size();
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais barato carro a gasolina
    public void registaPedidoBaratoGasolina(Date dataAux, Cliente clienteAux, Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBaratoGasolina(destino).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBaratoGasolina(destino)));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais barato carro eletrico
    public void registaPedidoBaratoEletrico(Date dataAux, Cliente clienteAux, Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBaratoEletrico(destino).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBaratoEletrico(destino)));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais barato carro hibrido
    public void registaPedidoBaratoHibrido(Date dataAux, Cliente clienteAux, Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBaratoHibrido(destino).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBaratoHibrido(destino)));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais barato prancha
    public void registaPedidoBaratoPrancha(Date dataAux, Cliente clienteAux, Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBaratoPrancha(destino).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBaratoPrancha(destino)));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais barato bike
    public void registaPedidoBaratoBicicleta(Date dataAux, Cliente clienteAux,Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBaratoBicicleta().equals("")) throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBaratoBicicleta()));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    //Pedido mais proximo

    // qualquer tipo de veiculo
    public void registaPedidoProximo(Date dataAux, Cliente clienteAux, Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisPerto(destino, clienteAux.getLocalizacao()).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisPerto(destino, clienteAux.getLocalizacao())));
            int id = this.getAlugueres().size(); // posteriormente por como variavel de classe ??
            Proprietario propAux = veiculoAux.getProprietario();
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais perto carro a gasolina
    public void registaPedidoProximoGasolina(Date dataAux, Cliente clienteAux, Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisPertoGasolina(destino, clienteAux.getLocalizacao()).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisPertoGasolina(destino, clienteAux.getLocalizacao())));
            int id = this.getAlugueres().size(); // posteriormente por como variavel de classe ??
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);

        }

    }

    // mais perto carro eletrico
    public void registaPedidoProximoEletrico(Date dataAux, Cliente clienteAux, Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisPertoEletrico(destino, clienteAux.getLocalizacao()).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisPertoEletrico(destino, clienteAux.getLocalizacao())));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais perto carro hibrido
    public void registaPedidoProximoHibrido(Date dataAux, Cliente clienteAux, Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisPertoHibrido(destino, clienteAux.getLocalizacao()).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisPertoHibrido(destino, clienteAux.getLocalizacao())));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais perto prancha
    public void registaPedidoProximoPrancha(Date dataAux, Cliente clienteAux, Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisPertoPrancha(destino, clienteAux.getLocalizacao()).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisPertoPrancha(destino, clienteAux.getLocalizacao())));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais perto bike
    public void registaPedidoProximoBicicleta(Date dataAux, Cliente clienteAux, Ponto destino) throws GestaoGeralException {
        if (this.veiculos.procuraMaisPertoBicicleta(clienteAux.getLocalizacao()).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisPertoBicicleta(clienteAux.getLocalizacao())));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    //pedido mais barato dentro de uma distancia

    // qualquer tipo de veiculo
    public void registaPedidoBaratoDist(Date dataAux, Cliente clienteAux, Ponto destino, double dist) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBaratoDist(destino, clienteAux.getLocalizacao(), dist).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBaratoDist(destino, clienteAux.getLocalizacao(), dist)));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais barato carro a gasolina
    public void registaPedidoBaratoGasolinaDist(Date dataAux, Cliente clienteAux, Ponto destino, double dist) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBaratoGasolinaDist(destino, clienteAux.getLocalizacao(), dist).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBaratoGasolinaDist(destino, clienteAux.getLocalizacao(), dist)));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais barato carro eletrico
    public void registaPedidoBaratoEletricoDist(Date dataAux, Cliente clienteAux,Ponto destino, double dist) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBaratoEletricoDist(destino, clienteAux.getLocalizacao(), dist).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBaratoEletricoDist(destino, clienteAux.getLocalizacao(), dist)));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais barato carro hibrido
    public void registaPedidoBaratoHibridoDist(Date dataAux, Cliente clienteAux,Ponto destino, double dist) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBaratoHibridoDist(destino, clienteAux.getLocalizacao(), dist).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBaratoHibridoDist(destino, clienteAux.getLocalizacao(), dist)));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais barato prancha
    public void registaPedidoBaratoPranchaDist(Date dataAux, Cliente clienteAux,Ponto destino, double dist) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBaratoPranchaDist(destino, clienteAux.getLocalizacao(), dist).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBaratoPranchaDist(destino, clienteAux.getLocalizacao(), dist)));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // mais barato bike
    public void registaPedidoBaratoBicicletaDist(Date dataAux, Cliente clienteAux, Ponto destino, double dist) throws GestaoGeralException {
        if (this.veiculos.procuraMaisBaratoBicicletaDist(clienteAux.getLocalizacao(), dist).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = (this.getVeiculos().get(this.veiculos.procuraMaisBaratoBicicletaDist(clienteAux.getLocalizacao(), dist)));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }


    }


    // pedido de um carro especifico
    public void registaEspecifico(Date dataAux, Cliente clienteAux,Ponto destino, String ma) throws GestaoGeralException {
        int id = this.getAlugueres().size();
        Veiculo veiculoAux = this.getVeiculos().get(ma);
        if (this.getVeiculos().get(ma) == null) throw new GestaoGeralException(ma);
        if (veiculoAux instanceof Bicicleta) {
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        } else {
            if (veiculoAux instanceof Gasolina) {
                Gasolina g = (Gasolina) veiculoAux;
                if (g.getAutonomia() < g.getLocalizacao().distanciaPonto(destino)) throw new GestaoGeralException(ma);
                else {
                    double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
                    Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
                    Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
                    this.alugueres.addPedido(p);
                }
            }

            if (veiculoAux instanceof Eletrico) {
                Eletrico e = (Eletrico) veiculoAux;
                if (e.getAutonomia() < e.getLocalizacao().distanciaPonto(destino)) throw new GestaoGeralException(ma);
                else {
                    double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
                    Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
                    Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
                    this.alugueres.addPedido(p);
                }
            }

            if (veiculoAux instanceof Hibridos) {
                Hibridos h = (Hibridos) veiculoAux;
                if (h.getAutonomia() < h.getLocalizacao().distanciaPonto(destino)) throw new GestaoGeralException(ma);
                else {
                    double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
                    Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
                    Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
                    this.alugueres.addPedido(p);
                }
            }

            if (veiculoAux instanceof Prancha) {
                Prancha p = (Prancha) veiculoAux;
                if (p.getAutonomia() < p.getLocalizacao().distanciaPonto(destino)) throw new GestaoGeralException(ma);
                else {
                    double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
                    Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
                    Pedido pe = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
                    this.alugueres.addPedido(pe);
                }
            }


        }
    }

    // registo de pedidos com certa autonomia

    // qualquer tipo de veiculo
    public void registaPedidoAutonomia(Date dataAux, Cliente clienteAux, Ponto destino, double autonomia) throws GestaoGeralException {
        if (this.veiculos.procuraAutonomia(destino,autonomia).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = this.getVeiculos().get(this.veiculos.procuraAutonomia(destino,autonomia));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    // carro a gasolina
    public void registaPedidoAutonomiaGasolina(Date dataAux, Cliente clienteAux, Ponto destino, double autonomia) throws GestaoGeralException {
        if (this.veiculos.procuraAutonomiaGasolina(destino,autonomia).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = this.getVeiculos().get(this.veiculos.procuraAutonomiaGasolina(destino,autonomia));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    //  carro eletrico
    public void registaPedidoAutonomiaEletrico(Date dataAux, Cliente clienteAux,Ponto destino, double autonomia) throws GestaoGeralException {
        if (this.veiculos.procuraAutonomiaEletrico(destino,autonomia).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = this.getVeiculos().get(this.veiculos.procuraAutonomiaEletrico(destino,autonomia));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    //  carro hibrido
    public void registaPedidoAutonomiaHibrido(Date dataAux, Cliente clienteAux,Ponto destino, double autonomia) throws GestaoGeralException {
        if (this.veiculos.procuraAutonomiaHibrido(destino,autonomia).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = this.getVeiculos().get(this.veiculos.procuraAutonomiaHibrido(destino,autonomia));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }

    //  prancha
    public void registaPedidoAutonomiaPrancha(Date dataAux, Cliente clienteAux,Ponto destino, double autonomia) throws GestaoGeralException {
        if (this.veiculos.procuraAutonomiaPrancha(destino,autonomia).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = this.getVeiculos().get(this.veiculos.procuraAutonomiaPrancha(destino,autonomia));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }

    }


    //  bike
    public void registaPedidoAutonomiaBicicleta(Date dataAux, Cliente clienteAux, Ponto destino, double autonomia) throws GestaoGeralException {
        if (this.veiculos.procuraAutonomiaBicicleta(destino).equals(""))
            throw new GestaoGeralException(destino.toString());
        else {
            Veiculo veiculoAux = this.getVeiculos().get(this.veiculos.procuraAutonomiaBicicleta(destino));
            int id = this.getAlugueres().size();
            Proprietario propAux = new Proprietario(veiculoAux.getProprietario());
            double tempo = veiculoAux.getLocalizacao().tempoHumano(clienteAux.getLocalizacao());
            Pedido p = new Pedido(id, veiculoAux, dataAux, clienteAux, propAux, false, false, destino, tempo);
            this.alugueres.addPedido(p);
        }


    }

    // método que aceita pedido e trata de todas as atualizaçoes necessarias

    public void AceitaPedido(int idP,Proprietario p) throws GestaoGeralException {
        if ((this.getAlugueres().get(idP)) instanceof Realizado) throw new GestaoGeralException(String.valueOf(idP));
        Pedido pd = (Pedido) this.getAlugueres().get(idP);
        if (pd == null) throw new GestaoGeralException(String.valueOf(idP));
        if (pd.getflagRespondido() != false) throw new GestaoGeralException(String.valueOf(idP));
        if (pd.getProprietario().getEmail().equals(p.getEmail())==false) throw new GestaoGeralException(String.valueOf(idP));
        else {
            pd.setFlagRespondido(true);
            pd.setRespostaProp(true);
            double km = pd.getVeiculo().getLocalizacao().distanciaPonto(pd.getDestino());
            double duracao = km / pd.getVeiculo().getVelocidadeKm();
            double preco = km * pd.getVeiculo().getPrecoKm();
            int id = this.getAlugueres().size();
            Date data = new Date();
            Realizado r = new Realizado(id,pd.getVeiculo(),data,pd.getCliente(),pd.getProprietario(),-1,-1,-1,preco,duracao,km);
            this.alugueres.remove(this.getAlugueres().get(idP).getVeiculo().getMatricula(),this.getAlugueres().get(idP).getCliente()); //está a dar shit!!!!
            this.atores.atualizaProp(r,pd.getProprietario().getEmail());
            this.alugueres.addRealizado(r);
            this.veiculos.atualizaVeiculo(pd.getVeiculo().getMatricula(), pd.getDestino());
            this.atores.atualizaCliente(pd.getDestino(),pd.getCliente().getEmail(),r);
        }

    }


    // historico
    public List<Realizado> RealizadosProp(Proprietario p){
        return p.getAlugueres();
    }

    public List<Realizado> RealizadosCliente(Cliente c){
        return c.getAlugueres();
    }

    public List<Realizado> RealizadosPropDatas(Proprietario p,Date inicio,Date fim){

        List<Realizado> list = new ArrayList<>(p.getAlugueres());
        List<Realizado> list2 = new ArrayList<>();


        for(Realizado a : list)
            if (a.getData().after(inicio) && a.getData().before(fim))
                list2.add(a);

        return list2;
    }

    public List<Realizado> RealizadosClienteDatas(Cliente c,Date inicio, Date fim){

        ArrayList<Realizado> list = new ArrayList<>(c.getAlugueres());
        ArrayList<Realizado> list2 = new ArrayList<>();


        for(Realizado a : list)
            if (a.getData().after(inicio) && a.getData().before(fim))
                list2.add(a);

        return list2;
    }

    // faturado veiculo

    public double faturadoVeiculo(String matricula,Proprietario p, Date inicio, Date fim) throws GestaoGeralException{
        if (this.getVeiculos().get(matricula) == null) throw new GestaoGeralException(matricula);
        if (this.getVeiculos().get(matricula).getProprietario().getEmail().equals(p.getEmail()) == false) throw new GestaoGeralException(matricula);
        else {
            return this.alugueres.faturacao(matricula,inicio,fim);
        }
    }

    // rankings

    public TreeSet<Cliente> rank10Vezes() {
        TreeSet<Cliente> t = new TreeSet<>(new ComparadorNrVezes());
        ArrayList<Ator> atores = new ArrayList<Ator> (this.getAtores().values());
        for (Ator a : atores)
            if (a instanceof Cliente) t.add(((Cliente) a).clone());

        return t;
    }

    public TreeSet<Cliente> rank10km() {
        TreeSet<Cliente> t = new TreeSet<>(new ComparadorKmPercorridos());
        ArrayList<Ator> atores = new ArrayList<Ator>(this.getAtores().values());
        for (Ator a : atores)
            if (a instanceof Cliente) t.add(((Cliente) a).clone());

        return t;
    }


    // notificacoes
    public List<Veiculo> notificacoes(Proprietario p){

        ArrayList<Veiculo> list = new ArrayList<Veiculo>(this.getVeiculos().values());
        ArrayList<Veiculo> resultado = new ArrayList<Veiculo>();
        for(Veiculo v : list)
            if (v.getProprietario().getEmail().equals(p.getEmail())){
                if (v instanceof Hibridos && ((Hibridos)v).getCondicao() == false) resultado.add(v);
                if (v instanceof Gasolina && ((Gasolina)v).getCondicao() == false) resultado.add(v);
                if (v instanceof Eletrico && ((Eletrico)v).getCondicao() == false) resultado.add(v);
                if (v instanceof Prancha && ((Prancha)v).getCondicao() == false) resultado.add(v);

            }
        return  resultado;

    }

    // admin

    public List<Veiculo> listagemVeiculos(){

        ArrayList<Veiculo> list = new ArrayList<Veiculo>(this.getVeiculos().values());
        return list;
    }

    public List<Cliente> listagemClientes(){

        ArrayList<Ator> list = new ArrayList<Ator>(this.getAtores().values());
        ArrayList<Cliente> list2 = new ArrayList<Cliente>();

        for(Ator a : list)
            if (a instanceof Cliente) list2.add((Cliente)a);

        return list2;
    }

    public List<Proprietario> listagemProprietarios(){

        ArrayList<Ator> list = new ArrayList<Ator>(this.getAtores().values());
        ArrayList<Proprietario> list2 = new ArrayList<Proprietario>();

        for(Ator a : list)
            if (a instanceof Proprietario) list2.add((Proprietario) a);

        return list2;
    }

    public List<Realizado> listagemAlugueresRealizados(){

        ArrayList<Aluguer> list = new ArrayList<Aluguer>(this.getAlugueres().values());
        ArrayList<Realizado> list2 = new ArrayList<Realizado>();

        for(Aluguer a : list)
            if (a instanceof Realizado) list2.add((Realizado) a);

            return list2;
    }

    public List<Pedido> listagemPedidos(){

        ArrayList<Aluguer> list = new ArrayList<Aluguer>(this.getAlugueres().values());
        ArrayList<Pedido> list2 = new ArrayList<Pedido>();

        for(Aluguer a : list) {
            if (a instanceof Pedido) list2.add((Pedido) a);
        }

        return list2;
    }



    // lista alugueres possiveis de aceitar por parte do proprietario

    public List<Pedido> listaPedidos(Proprietario prop){

        ArrayList<Aluguer> list = new ArrayList<Aluguer>(this.getAlugueres().values());
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

        for(Aluguer a: list)
            if((a instanceof Pedido) && ((Pedido)a).getflagRespondido()==false && a.getProprietario().getEmail().equals(prop.getEmail()) ) pedidos.add((Pedido)a);

            return pedidos;
    }

    // logs
    public String logsGasolinaMaisPerto(Ponto destino,Ponto cliente){
        return this.veiculos.procuraMaisPertoGasolina(destino,cliente);
    }
    public String logsGasolinaMaisBarato(Ponto destino){
        return this.veiculos.procuraMaisBaratoGasolina(destino);
    }
    public String logsEletricoMaisPerto(Ponto destino,Ponto cliente){
        return this.veiculos.procuraMaisPertoEletrico(destino,cliente);
    }
    public String logsEletricoMaisBarato(Ponto destino){
        return this.veiculos.procuraMaisBaratoEletrico(destino);
    }


    public void logsRegistaAluguer(String matricula,String emailCliente,Ponto destino){
        int id = this.getAlugueres().size();
        Date data = new Date();
        double km = this.getVeiculos().get(matricula).getLocalizacao().distanciaPonto(destino);
        double duracao = km / this.getVeiculos().get(matricula).getVelocidadeKm();
        double preco = km * this.getVeiculos().get(matricula).getPrecoKm();
        Realizado r = new Realizado(id,this.getVeiculos().get(matricula),data,(Cliente)this.getAtores().get(emailCliente),this.getVeiculos().get(matricula).getProprietario(),-1,-1,-1,preco,duracao,km); // passar a -1
        this.alugueres.addRealizado(r);
        this.atores.atualizaProp(r,this.getVeiculos().get(matricula).getProprietario().getEmail());
        this.atores.atualizaClientelogs(r.getCliente().getEmail(),r);
    }

    // métodos que tratam da clasificação
    public void registaClassProp(int idA,double classificacao,Proprietario p) throws GestaoGeralException{
        if (this.getAlugueres().get(idA) == null) throw new GestaoGeralException(String.valueOf(idA));
        if (this.getAlugueres().get(idA).getProprietario().getEmail().equals(p.getEmail()) == false) throw new GestaoGeralException(String.valueOf(idA));
        if (((Realizado)(this.getAlugueres().get(idA))).getClassificacaoCliente() != -1) throw new GestaoGeralException(String.valueOf(idA));
        else {
            this.alugueres.classificacaoProprietario(idA,classificacao);
            this.atores.atualizaClassificacaoCliente(classificacao,this.getAlugueres().get(idA).getCliente());
        }

    }

    public void registaClassCliente(int idA,double classificacaoVeiculo,double classificacaoProp,Cliente c) throws GestaoGeralException{
        if (this.getAlugueres().get(idA) == null) throw new GestaoGeralException(String.valueOf(idA));
        if (this.getAlugueres().get(idA).getCliente().getEmail().equals(c.getEmail()) == false) throw new GestaoGeralException(String.valueOf(idA));
        if ((((Realizado)(this.getAlugueres().get(idA))).getClassificacaoProprietario() != -1) || (((Realizado)(this.getAlugueres().get(idA))).getClassificacaoVeiculo() != -1)) throw new GestaoGeralException(String.valueOf(idA));
        else {
            this.alugueres.classificacaoCliente(idA,classificacaoProp,classificacaoVeiculo);
            this.atores.atualizaClassificacaoProprietario(classificacaoProp,this.getAlugueres().get(idA).getProprietario());
            this.veiculos.atualizaClassificacaoVeiculo(classificacaoVeiculo,this.getVeiculos().get(this.getAlugueres().get(idA).getVeiculo().getMatricula()));
        }

    }

    public List<Realizado> listaClassificarProp(Proprietario p){
        return this.alugueres.realidadosClassificarProp(p);
    }

    public List<Realizado> listaClassificarCliente(Cliente c){
        return this.alugueres.realizadosClassificarCliente(c);
    }

    // gravar e carregar

    //metodo para gravar estado
    public void guardaEstado() throws FileNotFoundException,IOException {

        FileOutputStream fos1 = new FileOutputStream("GAluguer");
        FileOutputStream fos2 = new FileOutputStream("GAtores");
        FileOutputStream fos3 = new FileOutputStream("GVeiculos");
        ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
        ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
        ObjectOutputStream oos3 = new ObjectOutputStream(fos3);
        oos1.writeObject(this.alugueres);
        oos2.writeObject(this.atores);
        oos3.writeObject(this.veiculos);
        oos1.flush(); oos2.flush(); oos3.flush();
        oos1.close(); oos2.close(); oos3.close();

    }

    //metodo para carregar estado
    public void carregaEstado() throws FileNotFoundException,IOException, ClassNotFoundException{
        FileInputStream fis1 = new FileInputStream("GAluguer");
        FileInputStream fis2 = new FileInputStream("GAtores");
        FileInputStream fis3 = new FileInputStream("GVeiculos");
        ObjectInputStream ois1 = new ObjectInputStream(fis1);
        ObjectInputStream ois2 = new ObjectInputStream(fis2);
        ObjectInputStream ois3 = new ObjectInputStream(fis3);
        alugueres = (GestaoAluguer) ois1.readObject();
        atores = (GestaoAtor) ois2.readObject();
        veiculos = (GestaoVeiculo) ois3.readObject();
        ois1.close(); ois2.close(); ois3.close();
    }




}
