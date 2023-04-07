public class Main {
    public static void main(String[] args) {

        System.out.println("Sintaxis de un Array");

        int array[]; //declaracion del array

        array = new int[10]; //crea 10 espacios en el array

        System.out.printf("%s%8s\n", "Indice","Valor");

        //Recorriendo el Array, combinacion de ciclo for y array: foreach
        for (int cont = 0; cont < array.length; cont++)
        {
            System.out.printf("%5d%8d\n", cont, array[cont]);
        }
    }
}