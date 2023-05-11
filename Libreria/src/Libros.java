public class Libros {
    private String nombre;
    private String isbn;
    private int precio;

    //metodo constructor de clase
    public Libros(String nombre, String isbn, int precio){
        this.nombre = nombre;
        this.isbn = isbn;
        this.precio = precio;
    }

    //metodo get y set para cada variable local

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    //metodo toString

    @Override
    public String toString() {
        return
                "  Titulo='" + nombre + '\'' +
                ", isbn='" + isbn + '\'' +
                ", precio=" + precio + '\n';
    }
}
