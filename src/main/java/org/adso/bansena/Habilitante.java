package org.adso.bansena;

import java.util.Date;

public abstract class Habilitante {
    public Date fechaInicio;
    public Date fechaFin;
    public Double monto;

    public abstract Double calcularValor();

    public Habilitante() {
    }

    public Habilitante(Date fechaInicio, Date fechaFin, Double monto) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    
}
