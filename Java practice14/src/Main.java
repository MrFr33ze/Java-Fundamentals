import Animales.Leon;
import Animales.Mapache;
import Animales.Pinguino;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al Zoo\n");

        //Presentacion en consola
        System.out.println("MAPACHE");
        //Creando objetos
        Mapache elMapacheDelZoo = new Mapache();
        Pinguino elPinguinoDelZoo = new Pinguino();
        Leon elLeonDelZoo = new Leon();

        //Llamando al metodo Come de la clase Mapache en sintaxis de objeto elMapacheDelZoo.MapacheCome()
        System.out.println(elMapacheDelZoo.MapacheCome());

        System.out.println(elMapacheDelZoo.MapacheDuerme());
        System.out.println(elMapacheDelZoo.MapacheRoba());
        System.out.println(elMapacheDelZoo.MapacheCaga() + "\n");

        System.out.println("PINGUINO");
        System.out.println(elPinguinoDelZoo.Desliza());
        System.out.println(elPinguinoDelZoo.Come());
        System.out.println(elPinguinoDelZoo.Nada() + "\n");

        System.out.println("LEON");
        System.out.println(elLeonDelZoo.Bebe());
        System.out.println(elLeonDelZoo.Come());
        System.out.println(elLeonDelZoo.Duerme());

    } // Fin del metodo Main
} // Fin de la clase Main