import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tituloLibroBuscar;

        System.out.println("----------------------------------BOOK MANAGER----------------------------------");

        Orden orden = new Orden();

        Autor autor1 = new Autor("George Orwell", "muerto", 123124);        //Libro1
        Libros libro1 = new Libros("1984", "abc12344", 22);
       AsignacionAutorLibro libro1984 = new AsignacionAutorLibro(libro1, autor1);

        Autor autor2 = new Autor("Saifadean Ammous", "vivo", 1454222243);       //Libro2
        Libros libro2 = new Libros("El Patron Bitcoin", "omn84389", 17);
       AsignacionAutorLibro libroElPatronBitcoin = new AsignacionAutorLibro(libro2, autor2);

        Autor autor3 = new Autor("Dmitry Glukhovsky", "vivo", 5489685);       //Libro2
        Libros libro3 = new Libros("Metro 2033", "1010123", 10);

        //Para agregar mas libros se debe de incrementar la constante MAX_LIBROS en la clase Orden
        orden.AgregarLibro(autor1, libro1);
        orden.AgregarLibro(autor2, libro2);
        orden.AgregarLibro(autor3, libro3);




        orden.MostrarLibros();
        orden.CostoTotal();

        tituloLibroBuscar = LeerDato("Titulo a buscar");
        orden.BuscarLibro(tituloLibroBuscar);
    }

    //Metodo muestra mensaje en consola y procede a realizar lectura de dato por teclado, rotarna el dato en tipo String
    static String LeerDato(String mensaje){
        String dato;
        Scanner entrada = new Scanner(System.in);  //variable de tipo Scanner, realiza lectura, variable de proceso

        System.out.println(mensaje);
        dato = entrada.nextLine();
        //dato.toLowerCase();

        return dato;
    }

}