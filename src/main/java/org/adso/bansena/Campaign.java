package org.adso.bansena;

import java.util.Date;

public class Campaign extends Habilitante{

    public Campaign() {
    }

    public Campaign(Date fechaInicio, Date fechaFin, Double monto) {
        super(fechaInicio, fechaFin, monto);
    }

    @Override
    public String toString() {  
        return "Campaign []";
    }

    public Double calcularValor() {
        long días = fechaFin.getTime() - fechaInicio.getTime();
        Double valorCuotaManejo = (double) (días / (1000 * 60 * 60 * 24));
        return valorCuotaManejo;
    }
}
