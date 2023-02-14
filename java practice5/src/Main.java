import java.util.Scanner; // importando la clase Scanner del paquete java.util
public class Main { // declaracion de la clase Main
    public static void main(String[] args) { // declaracion del metodo principal main

        System.out.println(" ██████╗ █████╗ ██╗      ██████╗██╗   ██╗██╗      █████╗ ██████╗  ██████╗ ██████╗  █████╗     ███████╗ █████╗ ██╗      █████╗ ██████╗ ██╗ █████╗ ██╗     \n" +
                "██╔════╝██╔══██╗██║     ██╔════╝██║   ██║██║     ██╔══██╗██╔══██╗██╔═══██╗██╔══██╗██╔══██╗    ██╔════╝██╔══██╗██║     ██╔══██╗██╔══██╗██║██╔══██╗██║     \n" +
                "██║     ███████║██║     ██║     ██║   ██║██║     ███████║██║  ██║██║   ██║██████╔╝███████║    ███████╗███████║██║     ███████║██████╔╝██║███████║██║     \n" +
                "██║     ██╔══██║██║     ██║     ██║   ██║██║     ██╔══██║██║  ██║██║   ██║██╔══██╗██╔══██║    ╚════██║██╔══██║██║     ██╔══██║██╔══██╗██║██╔══██║██║     \n" +
                "╚██████╗██║  ██║███████╗╚██████╗╚██████╔╝███████╗██║  ██║██████╔╝╚██████╔╝██║  ██║██║  ██║    ███████║██║  ██║███████╗██║  ██║██║  ██║██║██║  ██║███████╗\n" +
                " ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝    ╚══════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚══════╝\n" +
                "                                                                                                                                                         ");
        Scanner Lectura = new Scanner(System.in); // declarando objeto de entrada para lectura de teclado fisico
        double Salario, salarioNeto,totalDescontado;

        //Declaracion de constantes
        double seguroSocial;
        double fondoDePension;

        System.out.println("Introduzca el salario bruto del empleado");
        Salario = Lectura.nextDouble(); // Asignacion de valor leido en telcado a la variable "Salario"

        totalDescontado = Salario*(0.0725) + Salario*(0.03);
        salarioNeto = Salario - totalDescontado;

        seguroSocial = Salario*0.03;
        fondoDePension = Salario*0.0725;

        System.out.println("El salario neto persivido es: " + salarioNeto);
        System.out.printf("Cobro por ISSS: %f\n Cobro por AFP: %f\n", seguroSocial, fondoDePension);
        System.out.println("Total descontado por prestaciones:" + totalDescontado);
    }
}