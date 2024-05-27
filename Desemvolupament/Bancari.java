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
public void depositar(double cantidad) {

    if (cantidad > 0) {

        saldo += cantidad;

    }

}


public boolean retirar(double cantidad) {

    if (cantidad > 0 && saldo >= cantidad) {

        saldo -= cantidad;

        return true;

    } else {

        return false;

    }

}

}
