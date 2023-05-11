public class AsignacionAutorLibro {
    private Libros libros;
    private Autor autor;


    //metodo constructor de clase
    public AsignacionAutorLibro(Libros libros, Autor autor){
        //metodo constructor
        this.autor = autor;
        this.libros = libros;
    }

    //metodo toString

    @Override
    public String toString() {
        return
                "libro=" + libros +
                ", autor=" + autor
                ;
    }
}
