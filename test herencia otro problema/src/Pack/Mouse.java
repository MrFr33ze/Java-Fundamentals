package Pack;

public class Mouse extends DispositivoEntrada{
    private final int idMouse;
    private static int contadorMouses;

    public Mouse(String tipoDeEntrada, String marca){       //constructor de la clase, hereda variables de DispositvoEntrdad
        super(tipoDeEntrada, marca);
        idMouse = ++contadorMouses;
    }

    //metodos get y set de cada variable local de clase

    public int getIdMouse() {
        return idMouse;
    }

    public static int getContadorMouses() {
        return contadorMouses;
    }

    public static void setContadorMouses(int contadorMouses) {
        Mouse.contadorMouses = contadorMouses;
    }

    //metodo toString para impresion de cada una de las variables locales

    @Override
    public String toString() {
        return " Pack.Mouse{" +
                " idMouse=" + idMouse +
                " Tipo de entrada del maouse: " + getTipoDeEntrada() +
                " marca del mouse: " + getMarca() +
                '}';
    }
}
