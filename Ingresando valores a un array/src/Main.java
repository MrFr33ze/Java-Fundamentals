import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Recepcion de numero e impresion(foreach)");

        int numero;

        //Declarando objeto 'entrada', e inicializando con parametro de entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el numero total de elementos: ");

        //Leyendo teclado con el metodo 'nextInt()' del objeto entrada
        numero = entrada.nextInt();

        int[] array = new int[numero]; //Declarando array de tipo objeto
        System.out.println("Digite los valores de cada elemento");
        for (int i = 0; i < numero; i++)
        {
            array[i] = entrada.nextInt(); //Leyendo numeros por teclado
        }

        System.out.println("Los elementos introducidos en el array son: ");
        for (int i = 0; i < numero; i++)
        {
            System.out.println(array[i]);
        }

    }
}