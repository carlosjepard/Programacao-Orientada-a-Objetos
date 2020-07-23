import java.awt.*;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.*;


public class UmCarroJa implements Serializable {

    public static void main(String[] args) {

        GestaoGeral g = new GestaoGeral();

        int optionMenu;

        do {
            Menus.menu();
            optionMenu = Leituras.leituraInt("Escolha uma opção:");

            switch (optionMenu) {
                case 1: {
                    int optionLogin;
                    do {
                        Menus.submenu_login();
                        optionLogin = Leituras.leituraInt("Escolha uma opção");
                        switch (optionLogin) {
                            case 1: {
                                String email = Leituras.leituraString("Email:");
                                String password = Leituras.leituraString("Password:");

                                try {
                                    g.loginCliente(email, password);
                                    Cliente cliente = (Cliente) g.getAtores().get(email);
                                    int optionLoginCliente;
                                    do {
                                        Menus.submenu_cliente();
                                        optionLoginCliente = Leituras.leituraInt("Escolha uma opçâo");
                                        switch (optionLoginCliente) {

                                            case 1: {
                                                int optionAluguer;
                                                do {
                                                    Menus.submenu_pedidoAluguer1();
                                                    optionAluguer = Leituras.leituraInt("Escolha a opção desejada");
                                                    switch (optionAluguer) {
                                                        case 1: {
                                                            int optionAluguer2;
                                                            do {
                                                                Menus.submenu_pedidoAluguer2();
                                                                optionAluguer2 = Leituras.leituraInt("Escolha o tipo de carro desejado");
                                                                switch (optionAluguer2) {
                                                                    case 1: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoProximoGasolina(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 2: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoProximoEletrico(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 3: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoProximoHibrido(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 4: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoProximoPrancha(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 5: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoProximoBicicleta(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 6: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoProximo(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 0: {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            while (optionAluguer2 != 0);
                                                            break;
                                                        }
                                                        case 2: {
                                                            int optionAluguer2;
                                                            do {
                                                                Menus.submenu_pedidoAluguer2();
                                                                optionAluguer2 = Leituras.leituraInt("Escolha o tipo de carro desejado");
                                                                switch (optionAluguer2) {
                                                                    case 1: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBaratoGasolina(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 2: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBaratoEletrico(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 3: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBaratoHibrido(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 4: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBaratoPrancha(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 5: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBaratoBicicleta(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 6: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBarato(data, cliente, destino);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 0: {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            while (optionAluguer2 != 0);
                                                            break;
                                                        }
                                                        case 3: {
                                                            int optionAluguer2;
                                                            do {
                                                                Menus.submenu_pedidoAluguer2();
                                                                optionAluguer2 = Leituras.leituraInt("Escolha o tipo de carro desejado");
                                                                switch (optionAluguer2) {
                                                                    case 1: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double dist = Leituras.leituraDouble("Qual a distancia máxima que está disposto a percorrer?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBaratoGasolinaDist(data, cliente, destino, dist);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 2: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double dist = Leituras.leituraDouble("Qual a distancia máxima que está disposto a percorrer?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBaratoEletricoDist(data, cliente, destino, dist);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 3: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double dist = Leituras.leituraDouble("Qual a distancia máxima que está disposto a percorrer?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBaratoHibridoDist(data, cliente, destino, dist);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 4: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double dist = Leituras.leituraDouble("Qual a distancia máxima que está disposto a percorrer?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBaratoPranchaDist(data, cliente, destino, dist);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 5: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double dist = Leituras.leituraDouble("Qual a distancia máxima que está disposto a percorrer?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBaratoBicicletaDist(data, cliente, destino, dist);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 6: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double dist = Leituras.leituraDouble("Qual a distancia máxima que está disposto a percorrer?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoBaratoDist(data, cliente, destino, dist);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 0: {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            while (optionAluguer2 != 0);
                                                            break;
                                                        }
                                                        case 4: {
                                                            int optionAluguer2;
                                                            do {
                                                                Menus.submenu_pedidoAluguer2();
                                                                optionAluguer2 = Leituras.leituraInt("Escolha o tipo de carro desejado");
                                                                switch (optionAluguer2) {
                                                                    case 1: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double autonomia = Leituras.leituraDouble("Qual a autonomia desejada?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoAutonomiaGasolina(data, cliente, destino, autonomia);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 2: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double autonomia = Leituras.leituraDouble("Qual a autonomia desejada?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoAutonomiaEletrico(data, cliente, destino, autonomia);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 3: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double autonomia = Leituras.leituraDouble("Qual a autonomia desejada?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoAutonomiaHibrido(data, cliente, destino, autonomia);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 4: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double autonomia = Leituras.leituraDouble("Qual a autonomia desejada?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoAutonomiaPrancha(data, cliente, destino, autonomia);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 5: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double autonomia = Leituras.leituraDouble("Qual a autonomia desejada?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoAutonomiaBicicleta(data, cliente, destino, autonomia);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 6: {
                                                                        Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                                        Double y = Leituras.leituraDouble("Especifique coordenada y do destino");
                                                                        Double autonomia = Leituras.leituraDouble("Qual a autonomia desejada?");
                                                                        Ponto destino = new Ponto(x, y);
                                                                        Date data = new Date();

                                                                        try {
                                                                            g.registaPedidoAutonomia(data, cliente, destino, autonomia);
                                                                            System.out.println("Pedido efetuado com sucesso");

                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 0: {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            while (optionAluguer2 != 0);
                                                            break;
                                                        }
                                                        case 5: {
                                                            Double x = Leituras.leituraDouble("Especifique coordenada x do destino");
                                                            Double y = Leituras.leituraDouble("Especifique coordenada y do destino");

                                                            ArrayList<Veiculo> result = new ArrayList<Veiculo>();
                                                            result = (ArrayList) g.listagemVeiculos();
                                                            for (Veiculo v : result)
                                                                if (v instanceof Gasolina)
                                                                    System.out.println(((Gasolina) v).toString());
                                                            for (Veiculo v : result)
                                                                if (v instanceof Hibridos)
                                                                    System.out.println(((Hibridos) v).toString());
                                                            for (Veiculo v : result)
                                                                if (v instanceof Eletrico)
                                                                    System.out.println(((Eletrico) v).toString());
                                                            for (Veiculo v : result)
                                                                if (v instanceof Prancha)
                                                                    System.out.println(((Prancha) v).toString());
                                                            for (Veiculo v : result)
                                                                if (v instanceof Bicicleta)
                                                                    System.out.println(((Bicicleta) v).toString());

                                                            String matricula = Leituras.leituraString("Qual a matricula do carro que pretende alugar");
                                                            Ponto destino = new Ponto(x, y);
                                                            Date data = new Date();

                                                            try {
                                                                g.registaEspecifico(data, cliente, destino, matricula);
                                                                System.out.println("Pedido efetuado com sucesso");

                                                            } catch (GestaoGeralException e) {
                                                                System.out.println("Não existem carros disponiveis para o seguinte destino" + e.getMessage());
                                                            }
                                                            break;

                                                        }
                                                        case 0: {
                                                            break;
                                                        }
                                                    }
                                                }
                                                while (optionAluguer != 0);
                                                break;

                                            }

                                            case 2: {
                                                    List<Realizado> l = new ArrayList<>(g.listaClassificarCliente(cliente));
                                                    for (Realizado r : l)
                                                        System.out.println(r.toString());

                                                    int id = Leituras.leituraInt("Escolha da lista acima o id do aluguer que quer classificar");
                                                    double cv= Leituras.leituraDouble("Qual a classificação que quer atribuir ao veiculo (0-100)");
                                                    double cp= Leituras.leituraDouble("Qual a classificação que quer atribuir ao proprietário (0-100)");
                                                    if (cv > 100) cv = 100;
                                                    if (cp > 100) cp = 100;

                                                    try{
                                                        g.registaClassCliente(id,cv,cp,cliente);
                                                        System.out.println("Classificação realizada com sucesso");
                                                    }
                                                    catch (GestaoGeralException e){
                                                        System.out.println("Não pode classificar o seguinte aluguer" + e.getMessage());
                                                    }
                                                    break;
                                            }
                                            case 3: {
                                                int optionHistorico;
                                                do{
                                                    Menus.submenu_historicoAlugueres();
                                                    optionHistorico = Leituras.leituraInt("Escolha uma opção");
                                                    switch (optionHistorico){
                                                        case 1: {
                                                            List<Realizado> l = new ArrayList<>(g.RealizadosCliente(cliente));
                                                            for (Realizado r : l)
                                                                System.out.println(r.toString());
                                                            break;

                                                        }
                                                        case 2: {
                                                            int dia1 = Leituras.leituraInt("Dia Inicial:");
                                                            int mes1 = Leituras.leituraInt("Mês Inicial");
                                                            int ano1 = Leituras.leituraInt("Ano Inicial:");
                                                            int dia2 = Leituras.leituraInt("Dia Final:");
                                                            int mes2 = Leituras.leituraInt("Mês Final");
                                                            int ano2 = Leituras.leituraInt("Ano Final:");
                                                            LocalDate d1 = LocalDate.of(ano1,mes1,dia1);
                                                            LocalDate d2 = LocalDate.of(ano2,mes2,dia2);
                                                            Date auxD1 = java.sql.Date.valueOf(d1);
                                                            Date auxD2 = java.sql.Date.valueOf(d2);
                                                            List<Realizado> l = new ArrayList<>(g.RealizadosClienteDatas(cliente,auxD1,auxD2));
                                                            for (Realizado r : l)
                                                                System.out.println(r.toString());
                                                            break;


                                                        }
                                                        case 0: {
                                                            break;
                                                        }

                                                    }
                                                }
                                                while(optionHistorico != 0);
                                                break;
                                            }
                                            case 0: {
                                                break;
                                            }
                                        }
                                    }
                                    while (optionLoginCliente != 0);
                                } catch (GestaoGeralException e) {
                                    System.out.println("Dados incorretos para esta conta: " + e.getMessage());
                                }
                                break;

                            }

                            case 2: {
                                String email = Leituras.leituraString("Email:");
                                String password = Leituras.leituraString("Password:");

                                try {
                                    g.loginProprietario(email, password);
                                    Proprietario proprietario = (Proprietario) g.getAtores().get(email);
                                    int optionLoginProp;
                                    do {
                                        Menus.submenu_proprietario();
                                        optionLoginProp = Leituras.leituraInt("Escolha uma opção");
                                        switch (optionLoginProp) {
                                            case 1: {
                                                int optionRegistaVeiculo;
                                                do {
                                                    Menus.submenu_registarVeiculo();
                                                    optionRegistaVeiculo = Leituras.leituraInt("Escolha uma opção");
                                                    switch (optionRegistaVeiculo) {
                                                        case 1: {
                                                            int optionRegistaCarro;
                                                            do {
                                                                Menus.submenu_registarCarro();
                                                                optionRegistaCarro = Leituras.leituraInt("Escolha uma opção");
                                                                switch (optionRegistaCarro) {
                                                                    case 1: {
                                                                        String matricula = Leituras.leituraString("Matricula:");
                                                                        double x = Leituras.leituraDouble("Coordenada x:");
                                                                        double y = Leituras.leituraDouble("Coordenada y:");
                                                                        double preco = Leituras.leituraDouble("Preco  ($/km):");
                                                                        double velocidade = Leituras.leituraDouble("Velocidade (km/h):");
                                                                        String descricao = Leituras.leituraString("Descricao:");
                                                                        double consumo = Leituras.leituraDouble("Consumo: (Watts/km)");
                                                                        double combustivel = Leituras.leituraDouble("Combustivel atual (Watt:");
                                                                        double tamanhoDeposito = Leituras.leituraDouble("Tamanho depósito (Watt):");
                                                                        double autonomia = combustivel/consumo;
                                                                        Ponto p = new Ponto(x, y);
                                                                        boolean condicao;
                                                                        if ((combustivel / tamanhoDeposito) < 0.1)
                                                                            condicao = false;
                                                                        else condicao = true;


                                                                        try {
                                                                            g.registaGasolina(matricula, p, preco, velocidade, 0, descricao, proprietario, consumo, combustivel, tamanhoDeposito, autonomia, condicao);
                                                                            System.out.println("Registo do carro a gasolina com sucesso!");
                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Esta matricula já tem um veiculo associado " + e.getMessage());
                                                                        }
                                                                        break;

                                                                    }
                                                                    case 2: {
                                                                        String matricula = Leituras.leituraString("Matricula:");
                                                                        double x = Leituras.leituraDouble("Coordenada x:");
                                                                        double y = Leituras.leituraDouble("Coordenada y:");
                                                                        double preco = Leituras.leituraDouble("Preco  ($/km):");
                                                                        double velocidade = Leituras.leituraDouble("Velocidade (km/h):");
                                                                        String descricao = Leituras.leituraString("Descricao:");
                                                                        double consumo = Leituras.leituraDouble("Consumo: (Watts/km)");
                                                                        double consumo2 = Leituras.leituraDouble("Consumo: (litros/km)");
                                                                        double combustivel = Leituras.leituraDouble("Combustivel atual (litros):");
                                                                        double tamanhoDeposito = Leituras.leituraDouble("Tamanho depósito (litros):");
                                                                        double bateria = Leituras.leituraDouble("Bateria atual (Watt:");
                                                                        double tamanhoBateria = Leituras.leituraDouble("Tamanho bateria (Watt):");
                                                                        double autonomia = combustivel/consumo2;
                                                                        if ((combustivel/consumo2) > (bateria/consumo)) autonomia = bateria/consumo;
                                                                        Ponto p = new Ponto(x, y);
                                                                        boolean condicao;
                                                                        if (((bateria / tamanhoBateria) < 0.1) || ((combustivel / tamanhoDeposito) < 0.1))
                                                                            condicao = false;
                                                                        else condicao = true;


                                                                        try {
                                                                            g.registaHibrido(matricula, p, preco, velocidade, 0, descricao, proprietario, consumo, consumo2, bateria, tamanhoBateria, combustivel, tamanhoDeposito, autonomia, condicao);
                                                                            System.out.println("Registo do carro hibrido com sucesso!");
                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Esta matricula já tem um veiculo associado " + e.getMessage());
                                                                        }
                                                                        break;

                                                                    }
                                                                    case 3: {
                                                                        String matricula = Leituras.leituraString("Matricula:");
                                                                        double x = Leituras.leituraDouble("Coordenada x:");
                                                                        double y = Leituras.leituraDouble("Coordenada y:");
                                                                        double preco = Leituras.leituraDouble("Preco  ($/km):");
                                                                        double velocidade = Leituras.leituraDouble("Velocidade (km/h):");
                                                                        String descricao = Leituras.leituraString("Descricao:");
                                                                        double consumo = Leituras.leituraDouble("Consumo: (Watts/km)");
                                                                        double bateria = Leituras.leituraDouble("Bateria atual (Watt:");
                                                                        double tamanhoBateria = Leituras.leituraDouble("Tamanho bateria (Watt):");
                                                                        double autonomia = bateria/consumo;
                                                                        Ponto p = new Ponto(x, y);
                                                                        boolean condicao;
                                                                        if ((bateria / tamanhoBateria) < 0.1)
                                                                            condicao = false;
                                                                        else condicao = true;


                                                                        try {
                                                                            g.registaEletrico(matricula, p, preco, velocidade, 0, descricao, proprietario, consumo, bateria, tamanhoBateria, autonomia, condicao);
                                                                            System.out.println("Registo do carro eletrico com sucesso!");
                                                                        } catch (GestaoGeralException e) {
                                                                            System.out.println("Esta matricula já tem um veiculo associado " + e.getMessage());
                                                                        }
                                                                        break;

                                                                    }
                                                                    case 0: {
                                                                        break;
                                                                    }

                                                                }
                                                            }
                                                            while (optionRegistaCarro != 0);
                                                            break;
                                                        }
                                                        case 2: {
                                                            String matricula = Leituras.leituraString("Matricula:");
                                                            double x = Leituras.leituraDouble("Coordenada x:");
                                                            double y = Leituras.leituraDouble("Coordenada y:");
                                                            double preco = Leituras.leituraDouble("Preco  ($/km):");
                                                            double velocidade = Leituras.leituraDouble("Velocidade (km/h):");
                                                            String descricao = Leituras.leituraString("Descricao:");
                                                            double consumo = Leituras.leituraDouble("Consumo: (Watts/km)");
                                                            double bateria = Leituras.leituraDouble("Bateria atual (Watt:");
                                                            double tamanhoBateria = Leituras.leituraDouble("Tamanho bateria (Watt):");
                                                            double autonomia = bateria/consumo;
                                                            Ponto p = new Ponto(x, y);
                                                            boolean condicao;
                                                            if ((bateria / tamanhoBateria) < 0.1) condicao = false;
                                                            else condicao = true;


                                                            try {
                                                                g.registaPrancha(matricula, p, preco, velocidade, 0, descricao, proprietario, consumo, bateria, tamanhoBateria, autonomia, condicao);
                                                                System.out.println("Registo da prancha com sucesso!");
                                                            } catch (GestaoGeralException e) {
                                                                System.out.println("Esta matricula já tem um veiculo associado " + e.getMessage());
                                                            }
                                                            break;
                                                        }

                                                        case 3: {
                                                            String matricula = Leituras.leituraString("Matricula:");
                                                            double x = Leituras.leituraDouble("Coordenada x:");
                                                            double y = Leituras.leituraDouble("Coordenada y:");
                                                            double preco = Leituras.leituraDouble("Preco  ($/km):");
                                                            double velocidade = Leituras.leituraDouble("Velocidade (km/h):");
                                                            String descricao = Leituras.leituraString("Descricao:");
                                                            Ponto p = new Ponto(x, y);
                                                            try {
                                                                g.registaBicicleta(matricula, p, preco, velocidade, 0, descricao, proprietario);
                                                                System.out.println("Registo da bicicleta com sucesso!");
                                                            } catch (GestaoGeralException e) {
                                                                System.out.println("Esta matricula já tem um veiculo associado " + e.getMessage());
                                                            }
                                                            break;
                                                        }
                                                        case 0: {
                                                            break;
                                                        }
                                                    }
                                                }
                                                while (optionRegistaVeiculo != 0);
                                                break;
                                            }
                                            case 2: {
                                                ArrayList<Pedido> list = (ArrayList) g.listaPedidos(proprietario);
                                                for (Pedido p : list)
                                                    System.out.println(p.toString());
                                                int id = Leituras.leituraInt("Escolha id do aluguer que pretende aceitar:");
                                                try {
                                                    g.AceitaPedido(id, proprietario);
                                                    System.out.println("Pedido aceite");
                                                } catch (GestaoGeralException e) {
                                                    System.out.println("Não podes aceitar o seguinte pedido" + e.getMessage());
                                                }
                                                break;

                                            }


                                            case 3: {
                                                String matricula = Leituras.leituraString("Matricula:");
                                                double preco;

                                                try {
                                                    g.abasteceVAUX(matricula, proprietario);
                                                    preco = Leituras.leituraDouble("Preço novo?");
                                                    g.alteraPreco(matricula, preco, proprietario);
                                                    System.out.println("Alteração de preço realizada com sucesso");
                                                } catch (GestaoGeralException e) {
                                                    System.out.println("Não possui nenhum veiculo com a seguinte matricula " + e.getMessage());
                                                }
                                                break;

                                            }

                                            case 4: { // falta exececao da bike
                                                String matricula = Leituras.leituraString("Matricula:");
                                                double quantidadeC;
                                                double quantidadeE;

                                                try {
                                                    g.abasteceVAUX(matricula, proprietario);
                                                    try {
                                                        if ((g.getVeiculos().get(matricula)) instanceof Eletrico) {
                                                            quantidadeE = Leituras.leituraDouble("Qauntidade de bateria? (em Watt)");
                                                            g.abasteceE(matricula, quantidadeE);
                                                        }

                                                        if ((g.getVeiculos().get(matricula)) instanceof Gasolina) {
                                                            quantidadeC = Leituras.leituraDouble("Qauntidade de gasolina? (em litros)");
                                                            g.abasteceG(matricula, quantidadeC);
                                                        }

                                                        if ((g.getVeiculos().get(matricula)) instanceof Hibridos) {
                                                            quantidadeE = Leituras.leituraDouble("Qauntidade de bateria? (em Watt)");
                                                            quantidadeC = Leituras.leituraDouble("Qauntidade de gasolina? (em litros)");
                                                            g.abasteceH(matricula, quantidadeC, quantidadeE);
                                                        }

                                                        if ((g.getVeiculos().get(matricula)) instanceof Prancha) {
                                                            quantidadeE = Leituras.leituraDouble("Qauntidade de bateria? (em Watt)");
                                                            g.abasteceP(matricula, quantidadeE);
                                                        }

                                                        if ((g.getVeiculos().get(matricula)) instanceof Bicicleta) {
                                                            System.out.println("Não pode abastecer uma bicicleta");
                                                        }
                                                        System.out.println("Abastecimento realizado com sucesso");

                                                    } catch (GestaoGeralException e) {
                                                        System.out.println("O seguinte veiculo nâo possui depósito grande o suficiente para a quantidade pretendida: " + e.getMessage());
                                                    }

                                                } catch (GestaoGeralException e) {
                                                    System.out.println("Não possui nenhum veiculo com a seguinte matricula " + e.getMessage());
                                                }
                                                break;
                                            }

                                            case 5: {
                                                System.out.println("Os seguintes veiculos estão com a percenteagem de combustivel abaixo dos 10%");
                                                List<Veiculo> lista = new ArrayList<>(g.notificacoes(proprietario));
                                                for (Veiculo v : lista) {
                                                    System.out.println(v.toString());
                                                }
                                                break;

                                            }

                                                case 6: {
                                                    int optionDados;
                                                    do{
                                                        Menus.submenu_proprietarioConsulta();
                                                        optionDados =Leituras.leituraInt("Escolha uma opção ");
                                                        switch(optionDados){
                                                            case 1:{
                                                                int optionHistorico;
                                                                do{
                                                                Menus.submenu_historicoAlugueres();
                                                                optionHistorico = Leituras.leituraInt("Escolha uma opção");
                                                                switch (optionHistorico){
                                                                        case 1: {
                                                                            List<Realizado> l = new ArrayList<>(g.RealizadosProp(proprietario));
                                                                            for (Realizado r : l) {
                                                                                System.out.println(r.toString());
                                                                            }

                                                                            break;


                                                                        }
                                                                        case 2: {
                                                                            int dia1 = Leituras.leituraInt("Dia Inicial:");
                                                                            int mes1 = Leituras.leituraInt("Mês Inicial");
                                                                            int ano1 = Leituras.leituraInt("Ano Inicial:");
                                                                            int dia2 = Leituras.leituraInt("Dia Final:");
                                                                            int mes2 = Leituras.leituraInt("Mês Final");
                                                                            int ano2 = Leituras.leituraInt("Ano Final:");
                                                                            LocalDate d1 = LocalDate.of(ano1,mes1,dia1);
                                                                            LocalDate d2 = LocalDate.of(ano2,mes2,dia2);
                                                                            Date auxD1 = java.sql.Date.valueOf(d1);
                                                                            Date auxD2 = java.sql.Date.valueOf(d2);
                                                                            System.out.println(auxD1);
                                                                            List<Realizado> l = new ArrayList<>(g.RealizadosPropDatas(proprietario,auxD1,auxD2));
                                                                            for (Realizado r : l)
                                                                                System.out.println(r.toString());
                                                                            break;

                                                                        }
                                                                        case 0: {
                                                                            break;
                                                                        }

                                                                    }
                                                                }
                                                                while(optionHistorico != 0);
                                                                break;
                                                            }
                                                            case 2:{
                                                                int optionCveiculo;
                                                                 do {
                                                                     Menus.submenu_propDados();
                                                                     optionCveiculo = Leituras.leituraInt("Escolha uma opção");
                                                                     switch (optionCveiculo) {
                                                                         case 1: {
                                                                             System.out.println("Os veiculos que possui são os seguintes: ");
                                                                             ArrayList<Veiculo> result = new ArrayList<Veiculo>();
                                                                             result = (ArrayList) g.listagemVeiculos();
                                                                             for (Veiculo v : result)
                                                                                 if (v instanceof Gasolina && v.getProprietario().getEmail().equals(proprietario.getEmail())) System.out.println(((Gasolina) v).toString());
                                                                             for (Veiculo v : result)
                                                                                 if (v instanceof Hibridos && v.getProprietario().getEmail().equals(proprietario.getEmail())) System.out.println(((Hibridos) v).toString());
                                                                             for (Veiculo v : result)
                                                                                 if (v instanceof Eletrico && v.getProprietario().getEmail().equals(proprietario.getEmail())) System.out.println(((Eletrico) v).toString());
                                                                             for (Veiculo v : result)
                                                                                 if (v instanceof Prancha && v.getProprietario().getEmail().equals(proprietario.getEmail())) System.out.println(((Prancha) v).toString());
                                                                             for (Veiculo v : result)
                                                                                 if (v instanceof Bicicleta && v.getProprietario().getEmail().equals(proprietario.getEmail())) System.out.println(((Bicicleta) v).toString());

                                                                             break;
                                                                         }
                                                                         case 2: {
                                                                             String matricula = Leituras.leituraString("Introduza matricula do veiculo");
                                                                             int dia1 = Leituras.leituraInt("Dia Inicial:");
                                                                             int mes1 = Leituras.leituraInt("Mês Inicial");
                                                                             int ano1 = Leituras.leituraInt("Ano Inicial:");
                                                                             int dia2 = Leituras.leituraInt("Dia Final:");
                                                                             int mes2 = Leituras.leituraInt("Mês Final");
                                                                             int ano2 = Leituras.leituraInt("Ano Final:");
                                                                             LocalDate d1 = LocalDate.of(ano1,mes1,dia1);
                                                                             LocalDate d2 = LocalDate.of(ano2,mes2,dia2);
                                                                             Date auxD1 = java.sql.Date.valueOf(d1);
                                                                             Date auxD2 = java.sql.Date.valueOf(d2);
                                                                             try {
                                                                                 String r = Double.toString(g.faturadoVeiculo(matricula, proprietario, auxD1, auxD2));
                                                                                 System.out.println("O faturado foi o seguinte " + r);

                                                                             } catch (GestaoGeralException e) {
                                                                                 System.out.println("Não é possivel obter essa informação deste veiculo " + e.getMessage());
                                                                             }
                                                                             break;
                                                                         }
                                                                     }}
                                                                     while (optionCveiculo != 0) ;

                                                                 break;


                                                        }

                                                    }}
                                                    while(optionDados !=0);
                                                    break;
                                                }

                                            case 7: {
                                                List<Realizado> l = new ArrayList<>(g.listaClassificarProp(proprietario));
                                                for (Realizado r : l)
                                                    System.out.println(r.toString());

                                                int id = Leituras.leituraInt("Escolha da lista acima o id do aluguer que quer classificar");
                                                double cv= Leituras.leituraDouble("Qual a classificação que quer atribuir ao Cliente (0-100)");
                                                if (cv > 100) cv = 100;

                                                try{
                                                    g.registaClassProp(id,cv,proprietario);
                                                    System.out.println("Classificação realizada com sucesso");
                                                }
                                                catch (GestaoGeralException e){
                                                    System.out.println("Não pode classificar o seguinte aluguer" + e.getMessage());
                                                }
                                                break;
                                            }

                                            case 0: {
                                                break;
                                            }

                                        }
                                    }

                                    while (optionLoginProp != 0);


                                } catch (GestaoGeralException e) {
                                    System.out.println("Dados incorretos para esta conta: " + e.getMessage());
                                }
                                break;


                            }
                        }
                    }
                    while (optionLogin != 0);
                    break;
                }

                case 2: {
                    int optionRegistaAtor;
                    do {
                        Menus.submenu_registarAtor();
                        optionRegistaAtor = Leituras.leituraInt("Escolha uma opção");
                        switch (optionRegistaAtor) {
                            case 1: {
                                String email = Leituras.leituraString("Email:");
                                String nome = Leituras.leituraString("Nome:");
                                String password = Leituras.leituraString("Password:");
                                String morada = Leituras.leituraString("Morada:");
                                int dia = Leituras.leituraInt("Dia de nascimento:");
                                int mes = Leituras.leituraInt("Mês de nascimento:");
                                int ano = Leituras.leituraInt("Ano de nascimento:");
                                double x = Leituras.leituraDouble("Coordenada x:");
                                double y = Leituras.leituraDouble("Coordenada y:");
                                Date auxD = new Date(dia, mes, ano);
                                List<Realizado> auxL = new ArrayList<Realizado>();
                                Ponto auxP = new Ponto(x, y);


                                try {
                                    g.registaCliente(email, nome, password, morada, auxD, 0, auxL, auxP);
                                    System.out.println("Registo de cliente com sucesso!");
                                } catch (GestaoGeralException e) {
                                    System.out.println("Este email já tem conta associada " + e.getMessage());
                                }
                                break;

                            }

                            case 2: {
                                String email = Leituras.leituraString("Email:");
                                String nome = Leituras.leituraString("Nome:");
                                String password = Leituras.leituraString("Password:");
                                String morada = Leituras.leituraString("Morada:");
                                int dia = Leituras.leituraInt("Dia de nascimento:");
                                int mes = Leituras.leituraInt("Mês de nascimento:");
                                int ano = Leituras.leituraInt("Ano de nascimento:");
                                Date auxD = new Date(dia, mes, ano);
                                List<Realizado> auxL = new ArrayList<Realizado>();


                                try {
                                    g.registaProprietario(email, nome, password, morada, auxD, 0, auxL);
                                    System.out.println("Registo de proptriétario com sucesso!");
                                } catch (GestaoGeralException e) {
                                    System.out.println("Este email já tem conta associada " + e.getMessage());
                                }
                                break;

                            }

                            case 0: {
                                break;
                            }

                        }
                    }
                    while (optionRegistaAtor != 0);
                    break;
                }

                case 3: {
                    int optionRank;
                    do {
                        Menus.submenu_rankingClientes();
                        optionRank = Leituras.leituraInt("Escolha uma opção");
                        switch (optionRank) {
                            case 1: {
                                TreeSet<Cliente> t = new TreeSet<Cliente>(g.rank10Vezes());
                                int x = 1;
                                while (x <= 10 && t != null) {
                                    System.out.println(x + " " + t.pollFirst().toString() + "\n");
                                    x++;
                                }
                                break;

                            }
                            case 2: {
                                TreeSet<Cliente> t = new TreeSet<Cliente>(g.rank10km());
                                int x = 1;
                                while (x <= 10 && t != null) {
                                    System.out.println(x + " " + t.pollFirst().toString() + "\n");
                                    x++;
                                }
                                break;

                            }
                        }
                    }
                    while (optionRank != 0);
                }
                break;

                case 4: {
                    int optionGravar;
                    do{
                        Menus.submenu_gravar();
                        optionGravar = Leituras.leituraInt("Escolha a opção desejada");
                        switch(optionGravar){
                            case 1:{
                                try {
                                    g.guardaEstado();
                                    System.out.println("Gravação realizada com sucesso");
                                }
                                catch(IOException i){
                                    System.out.println(i);

                                }

                            }
                            case 2:{
                                try {
                                    g.carregaEstado();
                                    System.out.println("Carregamento realizado com sucesso");
                                }
                                catch(IOException i){
                                    System.out.println(i);

                                }
                                catch (ClassNotFoundException c){
                                    System.out.println(c);
                                }

                            }

                            case 0: {
                                break;
                            }
                        }
                    }
                    while (optionGravar!=0);
                    break;


                }

                case 5: {
                    String user = Leituras.leituraString("Conta administrador:");
                    String pass = Leituras.leituraString("Password administrador:");
                    try {
                        g.loginAdmin(user, pass);
                        int optionAdmin;
                        do {
                            Menus.submenu_administrador();
                            optionAdmin = Leituras.leituraInt("Escolha uma opção:");
                            switch (optionAdmin) {
                                case 1: {

                                    ArrayList<Realizado> result = new ArrayList<Realizado>();
                                    result = (ArrayList) g.listagemAlugueresRealizados();
                                    for (Realizado r : result)
                                        System.out.println(r.toString());
                                    break;

                                }
                                case 2: {
                                    ArrayList<Pedido> result = new ArrayList<Pedido>();
                                    result = (ArrayList) g.listagemPedidos();
                                    for (Pedido p : result)
                                        System.out.println(p.toString());
                                    break;
                                }

                                case 3: {
                                    ArrayList<Veiculo> result = new ArrayList<Veiculo>();
                                    result = (ArrayList) g.listagemVeiculos();
                                    for (Veiculo v : result)
                                        if (v instanceof Gasolina) System.out.println(((Gasolina) v).toString());
                                    for (Veiculo v : result)
                                        if (v instanceof Hibridos) System.out.println(((Hibridos) v).toString());
                                    for (Veiculo v : result)
                                        if (v instanceof Eletrico) System.out.println(((Eletrico) v).toString());
                                    for (Veiculo v : result)
                                        if (v instanceof Prancha) System.out.println(((Prancha) v).toString());
                                    for (Veiculo v : result)
                                        if (v instanceof Bicicleta) System.out.println(((Bicicleta) v).toString());

                                    break;
                                }
                                case 4: {
                                    ArrayList<Cliente> result = new ArrayList<Cliente>();
                                    result = (ArrayList) g.listagemClientes();
                                    for (Cliente c : result)
                                        System.out.println(c.toString());
                                    break;
                                }
                                case 5: {
                                    ArrayList<Proprietario> result = new ArrayList<Proprietario>();
                                    result = (ArrayList) g.listagemProprietarios();
                                    for (Proprietario p : result)
                                        System.out.println(p.toString());
                                    break;
                                }
                                case 6: {
                                    String s = Leituras.leituraString("Indica o nome do ficheiro a executar");
                                    try {
                                        FileReader f = new FileReader(s);
                                        BufferedReader ler = new BufferedReader(f);
                                        String linha = ler.readLine();

                                        while (linha != null) {
                                            String[] instrucao;
                                            String[] instrucao2;
                                            instrucao = linha.split(":");
                                            if (instrucao[0].equals("NovoCliente")) {
                                                instrucao2 = instrucao[1].split(",");
                                                Date data = new Date();
                                                Double x;
                                                Double y;
                                                Ponto loc = new Ponto(Double.parseDouble(instrucao2[4]), Double.parseDouble(instrucao2[5]));
                                                ArrayList<Realizado> alugueres = new ArrayList<Realizado>();
                                                try {
                                                    g.registaCliente(instrucao2[2], instrucao2[0], instrucao2[2], instrucao2[3], data, 0, alugueres, loc);
                                                } catch (GestaoGeralException e) {
                                                    System.out.println("Este email já tem conta associada " + e.getMessage());
                                                }

                                            }

                                            if (instrucao[0].equals("NovoProp")) {
                                                instrucao2 = instrucao[1].split(",");
                                                Date data = new Date();
                                                ArrayList<Realizado> alugueres = new ArrayList<Realizado>();
                                                try {

                                                    g.registaProprietario(instrucao2[2], instrucao2[0], instrucao2[2], instrucao2[3], data, 0, alugueres);
                                                } catch (GestaoGeralException e) {
                                                    System.out.println("Este email já tem conta associada " + e.getMessage());
                                                }


                                            }

                                            if (instrucao[0].equals("NovoCarro")) {
                                                instrucao2 = instrucao[1].split(",");
                                                if (instrucao2[0].equals("Gasolina")) {
                                                    Ponto loc = new Ponto(Double.parseDouble(instrucao2[8]), Double.parseDouble(instrucao2[9]));
                                                    Double preco = Double.parseDouble(instrucao2[5]);
                                                    Double velocidade = Double.parseDouble(instrucao2[4]);
                                                    Double autonomia = Double.parseDouble(instrucao2[7]);
                                                    Double consumo = Double.parseDouble(instrucao2[6]);

                                                    try {
                                                        g.registaGasolinaL(instrucao2[2], loc, preco, velocidade, 0, instrucao2[1], instrucao2[3], consumo, autonomia, true);

                                                    } catch (GestaoGeralException e) {
                                                        System.out.println("Esta matricula já tem um veiculo associado " + e.getMessage());
                                                    }
                                                }
                                                if (instrucao2[0].equals("Hibrido")) {
                                                    Ponto loc = new Ponto(Double.parseDouble(instrucao2[8]), Double.parseDouble(instrucao2[9]));
                                                    Double preco = Double.parseDouble(instrucao2[5]);
                                                    Double velocidade = Double.parseDouble(instrucao2[4]);
                                                    Double autonomia = Double.parseDouble(instrucao2[7]);
                                                    Double consumo = Double.parseDouble(instrucao2[6]);

                                                    try {
                                                        g.registaHibridoL(instrucao2[2], loc, preco, velocidade, 0, instrucao2[1], instrucao2[3], consumo, autonomia, true);

                                                    } catch (GestaoGeralException e) {
                                                        System.out.println("Esta matricula já tem um veiculo associado " + e.getMessage());
                                                    }
                                                }
                                                if (instrucao2[0].equals("Electrico")) {
                                                    Ponto loc = new Ponto(Double.parseDouble(instrucao2[8]), Double.parseDouble(instrucao2[9]));
                                                    Double preco = Double.parseDouble(instrucao2[5]);
                                                    Double velocidade = Double.parseDouble(instrucao2[4]);
                                                    Double autonomia = Double.parseDouble(instrucao2[7]);
                                                    Double consumo = Double.parseDouble(instrucao2[6]);

                                                    try {
                                                        g.registaEletricoL(instrucao2[2], loc, preco, velocidade, 0, instrucao2[1], instrucao2[3], consumo, autonomia, true);

                                                    } catch (GestaoGeralException e) {
                                                        System.out.println("Esta matricula já tem um veiculo associado " + e.getMessage());
                                                    }
                                                }
                                                if (instrucao2[0].equals("Prancha")) {
                                                    // nao tem no ficheiro logs
                                                }
                                                if (instrucao2[0].equals("Bicicleta")) {
                                                    // nao tem no ficehiro logs
                                                }

                                            }
                                            if (instrucao[0].equals("Aluguer")) {
                                                instrucao2 = instrucao[1].split(",");
                                                if (instrucao2[3].equals("Gasolina")) {
                                                    if (instrucao2[4].equals("MaisPerto")) {
                                                        String emailCliente = instrucao2[0] + "@gmail.com";
                                                        Ponto destino = new Ponto(Double.parseDouble(instrucao2[1]), Double.parseDouble(instrucao2[2]));
                                                        String matricula = g.logsGasolinaMaisPerto(((Cliente) g.getAtores().get(emailCliente)).getLocalizacao(), destino);
                                                        g.logsRegistaAluguer(matricula, emailCliente, destino);

                                                    }
                                                    if (instrucao2[4].equals("MaisBarato")) {
                                                        String emailCliente = instrucao2[0] + "@gmail.com";
                                                        Ponto destino = new Ponto(Double.parseDouble(instrucao2[1]), Double.parseDouble(instrucao2[2]));
                                                        String matricula = g.logsGasolinaMaisBarato(destino);
                                                        g.logsRegistaAluguer(matricula, emailCliente, destino);

                                                    }
                                                }
                                                if (instrucao2[3].equals("Eletrico")) {
                                                    if (instrucao2[4].equals("MaisPerto")) {
                                                        String emailCliente = instrucao2[0] + "@gmail.com";
                                                        Ponto destino = new Ponto(Double.parseDouble(instrucao2[1]), Double.parseDouble(instrucao2[2]));
                                                        String matricula = g.logsEletricoMaisPerto(((Cliente) g.getAtores().get(emailCliente)).getLocalizacao(), destino);
                                                        g.logsRegistaAluguer(matricula, emailCliente, destino);

                                                    }
                                                    if (instrucao2[4].equals("MaisBarato")) {
                                                        String emailCliente = instrucao2[0] + "@gmail.com";
                                                        Ponto destino = new Ponto(Double.parseDouble(instrucao2[1]), Double.parseDouble(instrucao2[2]));
                                                        String matricula = g.logsEletricoMaisBarato(destino);
                                                        g.logsRegistaAluguer(matricula, emailCliente, destino);

                                                    }
                                                }

                                            }

                                            linha = ler.readLine();
                                        }
                                        ler.close();
                                    } catch (IOException e) {
                                        System.err.printf("Erro na abertura do ficheiro: %s. \n ", e.getMessage());
                                    }
                                    break;
                                }

                                case 0: {
                                    break;
                                }
                            }

                        }

                        while (optionAdmin != 0);
                    } catch (GestaoGeralException e){ System.out.println("Dados incorretos para administrador da app");}
                break;
                }

                case 0: {
                    break;

                }
                default: {
                    break;
                }
            }
        }
        while (optionMenu != 0);

    }
}





