import javax.sql.RowSetWriter;
import java.io.Serializable;
import  java.util.*;

public class ComparadorNrVezes implements Comparator<Cliente>, Serializable {

    public int compare(Cliente c1, Cliente c2){
        double km1 = 0;
        double km2 = 0;
        for(Realizado r: c1.getAlugueres())
            km1 =+ r.getTamanhoViagem();
        for(Realizado r: c2.getAlugueres())
            km2 =+ r.getTamanhoViagem();

        if (km1<km2) return  -1;
        else return 1;
    }
}
