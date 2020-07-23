import java.util.*;
import java.io.*;

public class Menus implements Serializable {


    public static void menu(){
        System.out.println("--------------------MENU PRINCIPAL--------------------");
        System.out.println("1-Login");
        System.out.println("2-Registar Ator");
        System.out.println("3-Ranking Clientes");
        System.out.println("4-Gravar/Carrregar");
        System.out.println("5-Administrador App");
        System.out.println("0-Sair");
    }

    public static void submenu_administrador(){
        System.out.println("--------------------MENU ADMINISTRADOR--------------------");
        System.out.println("1-Consultar Alugueres Realizados");
        System.out.println("2-Consultar Pedidos Aluguer");
        System.out.println("3-Consultar Veiculos");
        System.out.println("4-Consultar Clientes");
        System.out.println("5-Consultar Proprietários");
        System.out.println("6-Carregar Ficheiro Logs ");
        System.out.println("0-Sair");
    }

    public static void submenu_login(){
        System.out.println("--------------------MENU LOGIN--------------------");
        System.out.println("1-Login Cliente");
        System.out.println("2-Login Proprietário");
        System.out.println("0-Sair");
    }

    public static void submenu_cliente(){
        System.out.println("--------------------MENU CLIENTE--------------------");
        System.out.println("1-Pedido Aluguer");
        System.out.println("2-Classificar Aluguer");
        System.out.println("3-Histórico de Alugueres");
        System.out.println("0-Sair");
    }
    public static void submenu_proprietario(){
        System.out.println("--------------------MENU PROPRIETARIO--------------------");
        System.out.println("1-Registar Veiculo");
        System.out.println("2-Aceitar Aluguer");
        System.out.println("3-Alterar Preco/Km Veiculo");
        System.out.println("4-Abastecer Veiculo");
        System.out.println("5-Notificações");
        System.out.println("6-Consulta dados");
        System.out.println("7-Classificar Aluguer");
        System.out.println("0-Sair");
    }

    public static void submenu_proprietarioConsulta(){
        System.out.println("--------------------MENU CONSULTA DADOS--------------------");
        System.out.println("1-Histórico de Alugueres");
        System.out.println("2-Consultar Veiculos");
        System.out.println("0-Sair");
    }

    public static void submenu_historicoAlugueres(){
        System.out.println("--------------------MENU HISTORICO ALUGUERES--------------------");
        System.out.println("1-Todo Histórico de Alugueres");
        System.out.println("2-Histórico de Alugueres entre datas");
        System.out.println("0-Sair");
    }


    public static void submenu_proprietarioFuncionalidades(){
        System.out.println("--------------------MENU CONSULTA VEICULO--------------------");
        System.out.println("1-Veiculos registados");
        System.out.println("2-Faturado por veiculo especifico");
        System.out.println("0-Sair");
    }


    public static void submenu_registarVeiculo(){
        System.out.println("--------------------MENU REGISTAR VEICULO--------------------");
        System.out.println("1-Registar Carro");
        System.out.println("2-Registar Prancha");
        System.out.println("3-Registar Bicicleta");
        System.out.println("0-Sair");
    }

    public static void submenu_registarCarro(){
        System.out.println("--------------------MENU REGISTAR CARRO--------------------");
        System.out.println("1-Gasolina");
        System.out.println("2-Hibrido");
        System.out.println("3-Elétrico");
        System.out.println("0-Sair");
    }

    public static void submenu_registarAtor(){
        System.out.println("--------------------MENU REGISTAR ATOR--------------------");
        System.out.println("1-Registar Cliente");
        System.out.println("2-Registar Proprietário");
        System.out.println("0-Sair");

    }

    public static void submenu_rankingClientes(){
        System.out.println("--------------------MENU RANKING CLIENTES--------------------");
        System.out.println("1-Top 10 Alugueres");
        System.out.println("2-Top 10 Kms");
        System.out.println("0-Sair");
    }

    public static void submenu_pedidoAluguer2(){
        System.out.println("--------------------MENU PEDIDO ALUGUER--------------------");
        System.out.println("1-Carro Gasolina");
        System.out.println("2-Carro Elétrico");
        System.out.println("3-Carro Hibrido");
        System.out.println("4-Prancha");
        System.out.println("5-Bicicleta");
        System.out.println("6-Qualquer");
        System.out.println("0-Sair");
    }

    public static void submenu_pedidoAluguer1(){
        System.out.println("--------------------MENU PEDIDO ALUGUER--------------------");
        System.out.println("1-Mais Próximo");
        System.out.println("2-Mais Barato");
        System.out.println("3-Barato Dentro De Distância");
        System.out.println("4-Autonomia Desejada");
        System.out.println("5-Específico");
        System.out.println("0-Sair");
    }

    public static void submenu_gravar(){
        System.out.println("--------------------MENU GRAVAR/CARREGAR--------------------");
        System.out.println("1-Gravar");
        System.out.println("2-Carregar");
        System.out.println("0-Sair");
    }

    public static void submenu_propDados(){
        System.out.println("--------------------MENU CONSULTA DE DADOS--------------------");
        System.out.println("1-Consultar Veiculos");
        System.out.println("2-Consultar Faturado por Veiculo num periodo de tempo");
        System.out.println("0-Sair");
    }


}
