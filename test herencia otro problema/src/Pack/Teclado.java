package Pack;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;


    public Teclado(String tipoDeEntrada, String marca){          //Metodo constructor de la clase
        super(tipoDeEntrada, marca);
        idTeclado = ++contadorTeclados;
    }


    //metodos get y set para cada una de las variables locales de esta clase

    public int getIdTeclado() {
        return idTeclado;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

    public static void setContadorTeclados(int contadorTeclados) {
        Teclado.contadorTeclados = contadorTeclados;
    }


    //metodo toString para impresion de cada una de las variables de clase

    @Override
    public String toString() {
        return " Pack.Teclado{" +
                " idTeclado=" + idTeclado +
                " Tipo de entrada: " + getTipoDeEntrada() +
                " marca del teclado: " + getMarca() +
                '}';
    }
}
