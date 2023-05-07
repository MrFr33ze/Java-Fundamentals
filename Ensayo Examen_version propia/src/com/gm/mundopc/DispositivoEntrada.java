package com.gm.mundopc;

public class DispositivoEntrada {

    private String tipoEntrada;
    private String marca;

    //constructor de la clase
    public DispositivoEntrada(String marca, String tipoEntrada){
        this.marca = marca;
        this.tipoEntrada = tipoEntrada;
    }


    //metodos get y set de cada variable(propiedad)

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
