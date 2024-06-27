package org.adso.bansena;

import java.util.List;

public class CuentaBancaria {
    Double saldo;
    Integer numeroCuenta;
    Enum<Divisas> Divisas;
    private List<CuotaManejo<? extends Habilitante>> cuotasManejo;
 
    //region constructor
    public CuentaBancaria() { 
    } 

    public CuentaBancaria(Double saldo, Integer numeroCuenta, Enum<org.adso.bansena.Divisas> divisas,
            List<CuotaManejo<? extends Habilitante>> cuotasManejo) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        Divisas = divisas;
        this.cuotasManejo = cuotasManejo;
    }

    //region getter and setter
    
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Enum<Divisas> getDivisas() {
        return Divisas;
    }

    public void setDivisas(Enum<Divisas> divisas) {
        Divisas = divisas;
    }

    public List<CuotaManejo<? extends Habilitante>> getCuotasManejo() {
        return cuotasManejo;
    }

    public void setCuotasManejo(List<CuotaManejo<? extends Habilitante>> cuotasManejo) {
        this.cuotasManejo = cuotasManejo;
    }

    //region To String
    @Override
    public String toString() {
        return "CuentaBancaria [saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + ", Divisas=" + Divisas
                + ", cuotasManejo=" + cuotasManejo + ", getSaldo()=" + getSaldo() + ", getNumeroCuenta()="
                + getNumeroCuenta() + ", getDivisas()=" + getDivisas() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
