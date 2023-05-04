import Pack.*;
 class Main {
    public static void main(String[] args) {

        System.out.println("METODO PRINCIPAL (Main)");
        System.out.println("----------------------------------------------------------------------------------");

        Teclado teclado2 = new Teclado("USB", "lOGITECH");  //datos para las variables mas profundas
        Mouse mouse2 = new Mouse("BLUETOOTH", "RAZER");

        Teclado teclado3 = new Teclado("USB-B", "CORSAIR");  //datos para las variables mas profundas
        Mouse mouse3 = new Mouse("USB-C", "CORSAIR");

        Teclado teclado4 = new Teclado("USB-C", "AJAZZ");  //datos para las variables mas profundas
        Mouse mouse4 = new Mouse("MICRO USB", "RAZER");


        //anlalogia de herencia:  "El objeto perifericos1 contiene a otros objetos (teclado2 y mouse2),
        //el objeto perifericos1 suma una funcion mas a las ya obtenidas con teclado2 y mouse2
        //Perifericos perifericos1 = new Perifericos("Oferton" ,teclado2, mouse2);

        //IMPRESION EN PANTALLA
        ///perifericos1.toString();
        ///System.out.println(perifericos1);

        //llamada al metodo AgregarPerifercosArray

        Orden orden = new Orden();
        orden.AgregarPerifericosArray("Hola mundo", teclado2, mouse2);
        orden.AgregarPerifericosArray("PC de Carlos", teclado3, mouse3);
        orden.AgregarPerifericosArray("PC del hdp de Saravia", teclado4, mouse4);

        orden.MostrarPerifericosArray();
    }
}