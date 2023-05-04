package Pack;

public class DispositivoEntrada {
    private String tipoDeEntrada;
    private String marca;

    public DispositivoEntrada(String tipoDeEntrada, String marca){ //constructor de la clase
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    //metodos get y set para cada variable local de clase

    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //metodo de impresion toString

    @Override
    public String toString() {
        return "Pack.DispositivoEntrada{" +
                "tipoDeEntrada='" + tipoDeEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
