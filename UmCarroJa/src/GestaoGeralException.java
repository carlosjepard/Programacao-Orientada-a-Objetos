import java.util.*;
import java.io.*;

public class GestaoGeralException extends Exception implements Serializable
{
    public GestaoGeralException(){
        super();
    }

    //construtor para dar mensagem de erro
    public GestaoGeralException(String s){
        super(s);
    }

}
