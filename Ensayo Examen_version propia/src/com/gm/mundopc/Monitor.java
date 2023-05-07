package com.gm.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca; //no hereda de ninguna clase
    private double tamano; //no hereda de ninguna clase
    private static int contadorMonitores;

    //constructor de la clase PARA inicializar valores de las variables desde otra clase e inicia conteo
    public Monitor(String marca, double tamano){
        this.marca = marca;
        this.tamano = tamano;

        //iniando conteo cada vez que se invoque este metodo
        idMonitor = ++contadorMonitores;
    }

    //metodo toString generado automaticamente

    @Override
    public String toString() {
        return "MONITOR{" +
                "idMonitor=" + idMonitor + "\n" +
                " marca='" + marca + "\n"  +
                " tamano=" + tamano + "\n" +
                '}' + "\n" ;
    }
}
