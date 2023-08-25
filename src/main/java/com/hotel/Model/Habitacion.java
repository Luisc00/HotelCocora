package com.hotel.Model;
public class Habitacion {
    private int numHabitaciones;

    private TipoHabitacion tipoHabitacion;

    private Estado estado;

    private boolean Disponibilidad;

    public Habitacion(int numHabitaciones, TipoHabitacion tipoHabitacion, Estado estado, boolean disponibilidad) {
        this.numHabitaciones = numHabitaciones;
        this.tipoHabitacion = tipoHabitacion;
        this.estado = estado;
        Disponibilidad = disponibilidad;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        Disponibilidad = disponibilidad;
    }
}
