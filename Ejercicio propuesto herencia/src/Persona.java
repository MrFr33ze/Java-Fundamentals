public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    //Metodo constructor, inicializa los valores de las variables
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void MostrarInformacion(){
        System.out.println("Nombre: "  + nombre + "  Apellido: " + apellido + " Edad: "+ edad);
    }


}
