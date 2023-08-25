package com.hotel.Model;

import java.time.LocalDate;

public class Servicio {
    private TipoServicio tipoServicio;

    private LocalDate fechaInicio;

    private LocalDate fechaFinal;

    private Cliente cliente;

    private Habitacion habitacion;

    public Servicio(TipoServicio tipoServicio, LocalDate fechaInicio, LocalDate fechaFinal, Cliente cliente, Habitacion habitacion) {
        this.tipoServicio = tipoServicio;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
