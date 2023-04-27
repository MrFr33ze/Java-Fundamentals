public class CuentaBancaria {

    private double saldo;
    private int numeroCuenta;
public CuentaBancaria(double saldo, int numeroCuenta){
    this.saldo = saldo;
    this.numeroCuenta = numeroCuenta;
}

    public void Depositar(double cantidad){

        if(cantidad > 0){
            saldo = saldo + cantidad;
        }
        else{
            System.out.println("ERROR: no es posible adicionar cantidades negativas");
        }
    }//fin del metodo Depositar

    public void Retirar(double cantidadRetiro){
        saldo = saldo - cantidadRetiro;
        if(saldo < 0){
            System.out.println("Usted tiene un saldo pendiente a pagar de " + -(saldo));
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
