public class Orden {
    private AsignacionAutorLibro[] asignacionAutorLibros;
    private int totalPagar;
    private int MAX_LIBROS = 3;
    private int contador = 0;
    private String[] titulosDisponibles;

    //metodo constructor de clase
    public Orden(){
        this.asignacionAutorLibros = new AsignacionAutorLibro[MAX_LIBROS];
        this.titulosDisponibles = new String[MAX_LIBROS];

    }

    //Metodo agrega Libros libros y Autor autor en un solo elemento de array
    public void AgregarLibro(Autor autor, Libros libros){

        this.asignacionAutorLibros[this.contador] = new AsignacionAutorLibro(libros, autor);

        this.totalPagar = libros.getPrecio() + this.totalPagar;    //precio de libros
        this.titulosDisponibles[this.contador] = new String(libros.getNombre()); //nombre de libros
        this.contador++;
    }

    //metodo imprime en consola el recorrido del array
    public void MostrarLibros(){
        for (int i = 0; i < this.asignacionAutorLibros.length; i++){
            System.out.println("---------------------------------------------------------------------------");
            System.out.println(this.asignacionAutorLibros[i]);
            System.out.println("---------------------------------------------------------------------------");
        }
    }

    //metodo realiza la busque da un titulo digitado directamente  en el codigo
    public void BuscarLibro(String titulo){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Buscando: " + titulo);
        int contError = 0;  //bandera

        for (int i = 0; i < this.asignacionAutorLibros.length; i++) {
            String tituloTest;
            String tituloOriginal;

            tituloTest = titulosDisponibles[i].toLowerCase();
            tituloOriginal = titulosDisponibles[i];

            if(tituloTest.equals(titulo.toLowerCase())){
                System.out.println("Titulo: " + tituloOriginal + "      Estado: DISPONIBLE EN STOCK");
                contError++;
            }
            else if(i == this.asignacionAutorLibros.length - 1 && contError == 0 ){
                System.out.println("Titulo: " + titulo + "       Estado: SIN EXISTENCIAS");
            }
        }


    }

    //metodo imprime el total a apagar por el cliente; suma de precio de todos los libros
    public void CostoTotal(){
        System.out.println("TOTAL A PAGAR: " + this.totalPagar + ".00 $");
        System.out.println("---------------------------------------------------------------------------");
    }
}