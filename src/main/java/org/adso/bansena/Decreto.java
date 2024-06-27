package org.adso.bansena;

import java.util.Date;

public class Decreto extends Habilitante{

    public Decreto() {
    }

    public Decreto(Date fechaInicio, Date fechaFin, Double monto) {
        super(fechaInicio, fechaFin, monto);
    }

    @Override
    public String toString() {  
        return "ReglaNegocio []";
    }

    public Double calcularValor() {
        int valorFijo = 1000;
        Double valorCuotaManejo = (double) (valorFijo);
        return valorCuotaManejo;
    }
}
