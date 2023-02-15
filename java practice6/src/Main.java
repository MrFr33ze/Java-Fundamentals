import java.util.Scanner; // importando la clase Scanner del paquete java.util
public class Main {
    public static void main(String[] args) {
        double renta10 = 0.10;          // renta del 10%, salarios mayores a $472.00
        double renta20 = 0.20;          // renta del 20%, salarios mayores a $895.24
        double renta30 = 0.30;          // renta del 30%, salarios mayores a $2038.10
        double iSSS3 = 0.03;            // cobro de ISSS del 3%
        double aFP = 0.0725;            //cobro por AFP del 7.25%

        double SalarioNeto;
        double DescuentoSalarial;
        double SalarioBruto;
        double DescuentoRenta, DescuentoAFP, DescuentoSeguro;

        Scanner Salario = new Scanner(System.in);   // declarando variable para toma de lectura en teclado

        System.out.println("Calculadora salarial general");
        System.out.println("Ingrese el salario");

        SalarioBruto = Salario.nextDouble();     // leyendo teclado

        if(SalarioBruto <= 472.00){  // condicional para menores $472.00, no hay cobro por renta
            /*program si*/
            DescuentoSalarial = SalarioBruto*iSSS3 + SalarioBruto*aFP;
            SalarioNeto = SalarioBruto - DescuentoSalarial;

            System.out.printf(" Salario Bruto: %f\n Salario Neto: %f\n Descuento Salarial: %f\n\n", SalarioBruto, SalarioNeto, DescuentoSalarial);
            System.out.println(" Renta 0.00%\n ISSS 3%\n AFP 7.25%");
        }
        else{
            if(SalarioBruto <= 895.24){
                DescuentoSeguro = SalarioBruto*iSSS3;
                DescuentoAFP = SalarioBruto*aFP;
                DescuentoRenta = (SalarioBruto - 472 - SalarioBruto*iSSS3 - SalarioBruto*aFP)*renta10 + 17.67;
                DescuentoSalarial = DescuentoSeguro + DescuentoAFP + DescuentoRenta;
                SalarioNeto = SalarioBruto - DescuentoSalarial;

                System.out.printf(" Salario Bruto: %f\n Salario Neto: %f\n Descuento Salarial: %f\n\n", SalarioBruto, SalarioNeto, DescuentoSalarial);
                System.out.printf(" Renta 10 per ====> %f\n ISSS 3 per ====> %f\n AFP 7.25 per ====> %f", DescuentoRenta, DescuentoSeguro, DescuentoAFP);
            }
            else {
                if(SalarioBruto <= 2038.10){
                    if(SalarioBruto >= 1000){
                        DescuentoSeguro = 30;
                        DescuentoAFP = SalarioBruto*aFP;
                        DescuentoRenta = (SalarioBruto - 895.24 - 30 - DescuentoAFP)*renta20 + 60.00;
                        DescuentoSalarial = DescuentoSeguro + DescuentoAFP + DescuentoRenta;
                        SalarioNeto = SalarioBruto - DescuentoSalarial;

                        System.out.printf(" Salario Bruto: %f\n Salario Neto: %f\n Descuento Salarial: %f\n\n", SalarioBruto, SalarioNeto, DescuentoSalarial);
                        System.out.printf(" Renta 20 per ====> %f\n ISSS 3 per ====> %f\n AFP 7.25 per ====> %f", DescuentoRenta, DescuentoSeguro, DescuentoAFP);
                    }
                    else {
                        DescuentoSeguro = SalarioBruto*iSSS3;
                        DescuentoAFP = SalarioBruto*aFP;
                        DescuentoRenta = (SalarioBruto - 895.24 - DescuentoSeguro - DescuentoAFP)*renta20 + 60.00;
                        DescuentoSalarial = DescuentoSeguro + DescuentoAFP + DescuentoRenta;
                        SalarioNeto = SalarioBruto - DescuentoSalarial;

                        System.out.printf(" Salario Bruto: %f\n Salario Neto: %f\n Descuento Salarial: %f\n\n", SalarioBruto, SalarioNeto, DescuentoSalarial);
                        System.out.printf(" Renta 20 per ====> %f\n ISSS 3 per ====> %f\n AFP 7.25 per ====> %f", DescuentoRenta, DescuentoSeguro, DescuentoAFP);
                    }
                }
                else {
                    DescuentoSeguro = 30;
                    DescuentoAFP = SalarioBruto*aFP;
                    DescuentoRenta = (SalarioBruto - 2038.10 - 30 - DescuentoAFP)*renta30 + 288.57;
                    DescuentoSalarial = DescuentoSeguro + DescuentoAFP + DescuentoRenta;
                    SalarioNeto = SalarioBruto - DescuentoSalarial;

                    System.out.printf(" Salario Bruto: %f\n Salario Neto: %f\n Descuento Salarial: %f\n\n", SalarioBruto, SalarioNeto, DescuentoSalarial);
                    System.out.printf(" Renta 30 per ====> %f\n ISSS 3 per ====> %f\n AFP 7.25 per ====> %f", DescuentoRenta, DescuentoSeguro, DescuentoAFP);
                }
            }
        }
    }
}