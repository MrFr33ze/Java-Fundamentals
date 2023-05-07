package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclado;

    //constructor de la clase, hereda las variables de la clase DispositivoEntrada e inicia el conteo
    public Teclado(String marca, String tipoEntrada){
        super(marca, tipoEntrada);
        idTeclado = ++contadorTeclado;
    }

    //metodo de impresion toString generado automaticamente

    @Override
    public String toString() {
        return "TECLADO{" +
                "idTeclado=" + idTeclado + "\n" +
                " contadorTeclado=" + contadorTeclado + "\n" +
                " marca = " + getMarca() +  "\n" +
                " tipoEntrada = " + getTipoEntrada() + "\n" +
                '}' + "\n" ;
    }
}
