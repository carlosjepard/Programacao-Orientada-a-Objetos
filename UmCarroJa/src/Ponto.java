import java.io.Serializable;
import java.util.Objects;

public class Ponto implements Serializable {

    // Váriaveis de instancia
    private double x;
    private double y;

    // get's e set's
    public double getX() {
        return this.x;
    }

    public void setX(double xAux) {
        this.x = xAux;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double yAux) {
        this.y = yAux;
    }

    // construtores
    public Ponto(double xAux, double yAux) {
        this.x = xAux;
        this.y = yAux;
    }

    public  Ponto(){
        this.x = 0;
        this.y =0;
    }

    public Ponto(Ponto pontoAux){
        this(pontoAux.getX(),pontoAux.getY());
    }
    // métodos: equals, toString e clone
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ponto ponto = (Ponto) o;
        return this.x == ponto.x && this.y == ponto.y;
    }

    public String toString() {
        return "Ponto{" +
                "x:" + this.x +
                ", y:" + this.y +
                '}';
    }

    // funcionalidades
    public double distanciaPonto(Ponto aux)
    {

        double dx= Math.pow((aux.getX()-this.getX()),2);
        double dy= Math.pow((aux.getY()-this.getY()),2);

        double distancia = Math.sqrt(dx+dy);

        return distancia;
    }

    public double tempoHumano(Ponto aux){

        double dist = this.distanciaPonto(aux);
        double tempo = dist/4;
        return  tempo;
    }
}
