package com.ejerciciosjava.colecciones.examenes.examen_vuelos;

import java.util.Objects;

public class LineaAerea implements Comparable<LineaAerea> {
    private String nombre;
    private int cantidadAviones;

    public LineaAerea(String nombre, int cantidadAviones) {
        this.nombre = nombre;
        this.cantidadAviones = cantidadAviones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadAviones() {
        return cantidadAviones;
    }

    public void setCantidadAviones(int cantidadAviones) {
        this.cantidadAviones = cantidadAviones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineaAerea that = (LineaAerea) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public int compareTo(LineaAerea otra) {
        return this.nombre.compareTo(otra.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
