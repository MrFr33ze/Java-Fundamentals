public class OperadorJava {
    public static void main(String[] args) {
        System.out.println("Operadores Aritmeticos");
        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("\nOperador Modulo (residuo):");
        System.out.println("x mod 10 = " + a % 2);

        System.out.println("\nOperador compuesto:");
        //a = a + 2; // expresion equivalente a "a +=2"
        a += 1; // sustituye el valor de la variable "a" por el valor actual de "a" + 2
        b -= 4;
        c *= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("\nOperador Incremento");
        //int a = a + 1;
        //Puede reescribirse como
        a++;
        System.out.println("a = " + a);

        //Preincremento/decremento (se incrementa antes de asignar el valor)
        c = ++a;
        //Preincremento/decremento (se incrementa despues de asignar el valor)
        //La siguiente vez que se evalua b, es cuando se incrementa
        d = b++; // si ++ esta ubicado a la derecha solo "b" incrementa, pero no se le asigna el incremento a "d"
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println("\nOperador relacional:");
        //a es menonr que b
        boolean res = a < b; //si es falso, "res" guarda false; caso contrario.
        System.out.println("res = " + res);

        System.out.println("\nOperador Ternario:");
        int min = (a < b) ? a : b; // min toma el valor de la variable menor
        System.out.println("min = " + min);

        System.out.println("\nOperador asignacion:");
        int i, j, k;
        //cadena de asignacion
        i = j = k =100; // valor de x, y and z igual a 100

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        //practica realizada
        float abc;
        float variable;

        variable = 4/5;
        abc = ((2*2)/5)+6-(7*5*(4+2))-3;
            System.out.println("el resultado de (2*2)/5+6-7*5*(4+2)-3 es:" + abc);
        System.out.println("La variable imprime" + variable);

        System.out.println(calcIva( 12.0));
        float division = (float)4/5; //al escribir 4/5 los decimales de este son tomados en cuenta
    }

    public static double calcIva(double num){
        double precio = (num * 0.13)+num; // precio del producto mas IVA
        return precio;



    }
}