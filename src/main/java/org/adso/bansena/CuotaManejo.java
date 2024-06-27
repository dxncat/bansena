package org.adso.bansena;

import java.util.Date;

public class CuotaManejo<E extends Habilitante>  {
    
    Date fechaInicio;
    Date fechaFin;
    Double monto;
    E habilitante;

    public CuotaManejo() {
    }

    public CuotaManejo(E habilitante) {
        this.habilitante = habilitante;
        this.fechaInicio = habilitante.getFechaInicio();
        this.fechaFin = habilitante.getFechaFin();
        this.monto = habilitante.calcularValor();
    }

    @Override
    public String toString() {
        return "CuotaManejo [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", monto=" + monto
                + ", habilitante=" + habilitante + "]";
    }

    
    
}