import java.io.Serializable;
import  java.util.*;

public class ComparadorKmPercorridos implements Comparator<Cliente>, Serializable {

    public int compare(Cliente c1,Cliente c2){
        if (c1.getAlugueres().size()> c2.getAlugueres().size()) return -1;
        else return 1;
    }
}
