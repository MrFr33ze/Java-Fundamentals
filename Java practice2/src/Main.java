import java.util.Scanner; // importando la clase Scanner del paquete java.util, utilzada para leer el teclado
public class Main { // declarando la clase Main
    public static void main(String[] args) { // declarando el metodo main de manera void

        Scanner entrada = new Scanner(System.in); // declarando el objeto a utilizar para leer datos del telclado
        System.out.println("Hello world!");

        int numero1; // declaracion de las variables de tipo entero
        int numero2;
        int suma;

        System.out.println("Introduzca un numero entero");
        numero1 = entrada.nextInt(); // leeyendo y asignando el valor a la variable nuemro1
        System.out.println("Introduzca otro numero entero");
        numero2 = entrada.nextInt(); // leeyendo y asignando el valor a la variable nuemro2

        suma = numero1 + numero2; // asignando la suma de las variables a la variable suma

        System.out.printf("El resusultado de la suma es:\n %d\n", suma); // impresion de el resutado con el metodo printf
    } // fin del metodo main
} // fin de la clase Main