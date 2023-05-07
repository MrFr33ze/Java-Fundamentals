import com.gm.mundopc.*;
public class Main {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("Aon", 24);                  //computador 1
        Teclado teclado1 = new Teclado("Ajazz", "USB");
        Raton raton1 = new Raton("Argom", "USB");


        Monitor monitor2 = new Monitor("AON", 32);                  //computador 2
        Teclado teclado2 = new Teclado("Logitech", "USB");
        Raton raton2 = new Raton("eTouch", "USB");


        Monitor monitor3 = new Monitor("aoc", 19);                  //computador 3
        Teclado teclado3 = new Teclado("ReDragon", "USB-c");
        Raton raton3 = new Raton("Razer", "Bluetooth");


        Orden orden = new Orden();
        orden.AgregarComutadora("PC1", monitor1, teclado1, raton1);
        orden.AgregarComutadora("PC1", monitor2, teclado2, raton2);
        orden.AgregarComutadora("PC1", monitor3, teclado3, raton3);

        orden.MostrarOrden();
    }
}