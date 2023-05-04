package Pack;

public class Perifericos {

    private final int idPerifericos;
    private static int contadorPerifericos;
    private Teclado teclado1;
    private Mouse mouse1;
    private String nombreDelPC;
    //private Perifericos[] perifericosArray;

    public Perifericos(String nombreDelPC, Teclado teclado1, Mouse mouse1){    //constructorm inicializa las variables que contienen clases
        this.nombreDelPC = nombreDelPC;
        this.teclado1 = teclado1; // teclado1 ===>  tipoDeEntrada:"  ",  marca: "  "
        this.mouse1 = mouse1;       // mouse1 ===>  tipoDeEntrada:"  ",  marca: "  "

        idPerifericos = ++contadorPerifericos - 6;
    }



    //METODO toString para cada variable de este metodo

    @Override
    public String toString() {
        return "Perifericos{" +
                "idPerifericos=" + idPerifericos +
                ", teclado1=" + teclado1 +
                ", mouse1=" + mouse1 +
                '}';
    }
}
