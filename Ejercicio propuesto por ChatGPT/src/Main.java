public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio propuesto por ChatGPT \n instanciacion, uso de metodos getter y setter");

        CuentaBancaria cuentaBancaria = new CuentaBancaria(1000, 123233);

        //cuentaBancaria.setSaldo(1000); //alernativa si no se crea un constructor de la clase CuentaBancaria
        cuentaBancaria.Depositar(500);
        cuentaBancaria.Retirar(200);
        System.out.println(cuentaBancaria.getSaldo());
    }
}