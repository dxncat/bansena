package org.adso.bansena;

import java.util.List;

public class Titular {
    String nombre;
    Integer Identificacion;
    List<CuentaBancaria> cuentas;

    public Titular() {
    }

    public Titular(String nombre, Integer identificacion, List<CuentaBancaria> cuentas) {
        this.nombre = nombre;
        Identificacion = identificacion;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        Identificacion = identificacion;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", Identificacion=" + Identificacion + ", cuentas=" + cuentas + "]";
    }

    
}
