public class Empleado extends Persona {
    private String puesto;

    public Empleado(String nombre, String apellido, int edad, String puesto){
        super(nombre, apellido, edad); //heredando de la clase Personas
        this.puesto = puesto;
    }

    public void MostrarInformacion(){
        super.MostrarInformacion(); //heredando el metodo MostrarInformacion de la clase Personas
        System.out.println(" Puesto: " + puesto);
    }
}
