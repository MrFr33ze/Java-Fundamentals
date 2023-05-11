public class Autor {
    private String nombre;
    private String estado;
    private int cedula;


    public Autor(String nombre, String estado, int cedula){
        //metodo constructor de clase local
        this.nombre = nombre;
        this.estado = estado;
        this.cedula = cedula;
    }

    //metodos get y set para cada variable local

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    //metodo toString

    @Override
    public String toString() {
        return
                "  Autor='" + nombre + '\'' +
                ", estado='" + estado + '\'' +
                ", cedula=" + cedula;
    }
}
