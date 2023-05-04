package Pack;

public class Orden {
    private final int idOrden;
    private static int conatadorOrdenes;

    private Perifericos perifericos;
    private Perifericos[] perifericosArray;

    //constructor de clase local
    public Orden(){
        idOrden = ++conatadorOrdenes;
    }




    //insertando todos los componenetes del pc en un array
    public void AgregarPerifericosArray(String nombreDelPC, Teclado teclado1, Mouse mouse1){
        perifericosArray = new Perifericos[3];  //Array con 3 espacios
        for (int i = 0; i < perifericosArray.length; i++) {
            if(perifericosArray[i] == null){
                //se le asigana todo lo del metodo constructor Perifericos() de la clase Perifericos
                perifericosArray[i] = new Perifericos( nombreDelPC, teclado1, mouse1);
            }
        }
    }

    public void MostrarPerifericosArray(){
        for (int i = 0; i < perifericosArray.length ; i++) {
            System.out.println("---------------------------------------------------");
            System.out.println("ORDEN REALIZADA: " + perifericosArray[i]);
            System.out.println("---------------------------------------------------");
        }
    }

}
