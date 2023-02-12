package sentenciascontrol;
import java.lang.String;
public class Ejemploif {

    public static void main(String[] args){
        int x = 30;

        String a = "Es menor";
        String b = "Es mayor";
        String y = (x < 20) ? a:b;
        System.out.println("  Resultado:" + y);
    }

}
