package com.ejerciciosjava.colecciones.examenes.examen_vuelos;

import java.util.Objects;

public class Localidad implements Comparable<Localidad> {
    private String nombre;
    private int numeroHabitantes;

    public Localidad(String nombre, int numeroHabitantes) {
        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Localidad localidad = (Localidad) o;
        return Objects.equals(nombre, localidad.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public int compareTo(Localidad otra) {
        return this.nombre.compareTo(otra.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
