package Desemvolupament;

public class Bancari {

    private String numeroDeCuenta;

    private double saldo;


    public Bancari(String numeroDeCuenta, double saldo) {

        this.numeroDeCuenta = numeroDeCuenta;

        this.saldo = saldo;
    }

public String getNumeroDeCuenta() {

    return numeroDeCuenta;

}


public void setNumeroDeCuenta(String numeroDeCuenta) {

    this.numeroDeCuenta = numeroDeCuenta;

}


public double getSaldo() {

    return saldo;

}


public void setSaldo(double saldo) {

    this.saldo = saldo;
}
}