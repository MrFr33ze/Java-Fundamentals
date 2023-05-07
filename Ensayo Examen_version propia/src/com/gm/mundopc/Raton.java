package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;

    //constructor de la clase, hereda variables de la clase DispositivoEntrada e inicia el conteo
    public Raton(String marca, String tipoEntrada ){
        super(marca, tipoEntrada);
        idRaton = ++contadorRatones;
    }

    //metodo toString generado automaticamente


    @Override
    public String toString() {
        return "RATON{" +
                "idRaton=" + idRaton +
                ", contadorRatones=" + contadorRatones + "\n" +
                " marca = " + getMarca() + "\n" +
                " tipoEntrada = " + getTipoEntrada() + "\n" +
                '}' + "\n" ;
    }
}
