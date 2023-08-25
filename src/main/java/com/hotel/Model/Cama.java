package com.hotel.Model;
public class Cama {
    private int numHabitacion;
    private TipoServicio tipo;
    private Estado estado;
    private boolean disponible;
    public Cama(int numHabitacion, TipoServicio tipo, Estado estado, boolean disponible) {
        this.numHabitacion = numHabitacion;
        this.tipo = tipo;
        this.estado = estado;
        this.disponible = disponible;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public TipoServicio getTipo() {
        return tipo;
    }

    public void setTipo(TipoServicio tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
