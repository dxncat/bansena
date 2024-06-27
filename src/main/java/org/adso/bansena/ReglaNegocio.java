package org.adso.bansena;

import java.util.Date;

public class ReglaNegocio extends Habilitante{

    public ReglaNegocio() {
    }

    public ReglaNegocio(Date fechaInicio, Date fechaFin, Double monto) {
        super(fechaInicio, fechaFin, monto);
    }

    @Override
    public String toString() {  
        return "ReglaNegocio []";
    }

    public Double calcularValor() {
        long días = fechaFin.getTime() - fechaInicio.getTime();
        Double valorCuotaManejo = (double) (días / (1000 * 60 * 60 * 24) * 0.05 );
        return valorCuotaManejo;
    }
}
