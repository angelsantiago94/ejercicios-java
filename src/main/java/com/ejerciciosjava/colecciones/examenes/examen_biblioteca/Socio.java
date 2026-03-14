package com.ejerciciosjava.colecciones.examenes.examen_biblioteca;

import java.util.Objects;

public class Socio implements Comparable<Socio> {
    private String numeroSocio;
    private String nombre;
    private String direccion;
    private String telefono;
    private int librosPrestados;

    public Socio(String numeroSocio, String nombre, String direccion, String telefono) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.librosPrestados = 0;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(numeroSocio, socio.numeroSocio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroSocio);
    }

    @Override
    public int compareTo(Socio otro) {
        return this.numeroSocio.compareTo(otro.numeroSocio);
    }

    @Override
    public String toString() {
        return nombre + " (" + numeroSocio + ")";
    }
}
