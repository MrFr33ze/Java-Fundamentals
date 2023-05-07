package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora[] computadoras;
    private int contadorComputadoras;
    private int contadorOrdenes;
    private int MAX_COMPUTADORAS = 3;

    //metodo constructor de la clase, inicia conteo
    public Orden(){
        idOrden = ++contadorOrdenes;
    }



    //metodo AgregarComutadora tipo void (no retorna valor)
    public void AgregarComutadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        computadoras = new Computadora[MAX_COMPUTADORAS];
        //arrayComputadoras = new Computadora[MAX_COMPUTADORAS];
        //this.computadoras = new Computadora[MAX_COMPUTADORAS];
        for (int i = 0; i < MAX_COMPUTADORAS ; i++) {
            if (computadoras[i] == null) {
                computadoras[i] = new Computadora(nombre, monitor, teclado, raton);
                }
            //arrayComputadoras[i] = new Computadora(nombre, monitor, teclado, raton);
        }
    }

    public void MostrarOrden(){
        for (int i = 0; i < MAX_COMPUTADORAS; i++) { //Recorriendo array computadoras
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("Computadora numero: " + (i+1) + "\n" + computadoras[i]);
            System.out.println("--------------------------------------------------------------------------------------");
        }

    }
}
