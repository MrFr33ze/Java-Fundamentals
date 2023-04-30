public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio de Herencia propuesto por ChatGPT");

        Persona persona = new Persona("Juan", "Perez", 32); //instanciando atravez de objetos
        Empleado empleado = new Empleado("Serj", "Tanquian", 34, "Vocalista");

        //llamando metodos de impresion en pantalla de cada clase instancida
        persona.MostrarInformacion();
        empleado.MostrarInformacion();


    }

}