public class Main {
    public static void main(String[] args) {

        System.out.println("This program show some one example of the control structure Switch");

        int mes = 1; //mes del año
        String estacion;
        //Use the structure Switch only if your decisions are more than 3 or more statements
        switch (mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes incorrecto";
        }
        System.out.println("The season for month " + mes + "is: " + estacion);
    } // End metod main
} // End class Main