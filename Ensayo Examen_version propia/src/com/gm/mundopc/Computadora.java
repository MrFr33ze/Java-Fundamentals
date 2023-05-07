package com.gm.mundopc;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    //constructor de la clase para inicializar los valores de las variables dede otra clase
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){

        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;

        //iniciando conteo cada vez que este metodo es invocado
        idComputadora = ++contadorComputadoras - 6;
    }

    //metodos get y set de cada variable aqui declarad en la clase

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static void setContadorComputadoras(int contadorComputadoras) {
        Computadora.contadorComputadoras = contadorComputadoras;
    }


    //metodo toString generado automaticamente para cada variable aqui declaradad en la clase

    @Override
    public String toString() {
        return "COMPUTADORA{" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +  "\n" +  "\n" +
                ", monitor=" + monitor +
                ", teclado=" + teclado +
                ", raton=" + raton +
                '}';
    }
}
