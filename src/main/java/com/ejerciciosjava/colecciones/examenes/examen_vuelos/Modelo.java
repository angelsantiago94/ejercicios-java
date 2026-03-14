package com.ejerciciosjava.colecciones.examenes.examen_vuelos;

import java.util.TreeMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Modelo {
    private TreeMap<Localidad,HashSet<Vuelo>> conexiones;
    private TreeSet<LineaAerea> lineas;

    public Modelo() {
        this.conexiones = new TreeMap<>();
        this.lineas = new TreeSet<>();
    }

    public TreeMap<Localidad, HashSet<Vuelo>> getConexiones() {
        return conexiones;
    }

    public void setConexiones(TreeMap<Localidad, HashSet<Vuelo>> conexiones) {
        this.conexiones = conexiones;
    }

    public TreeSet<LineaAerea> getLineas() {
        return lineas;
    }

    public void setLineas(TreeSet<LineaAerea> lineas) {
        this.lineas = lineas;
    }

    // MÉTODOS A IMPLEMENTAR POR EL ALUMNO
    
    public void addLocalidad(Localidad localidad) {
        // añade al mapa de conexiones una nueva pareja con la localidad
        // pasada como parámetro y un nuevo conjunto de vuelos vacío.
        // TODO: Implementar este método
    }

    public void añadirVueloALocalidad(Localidad localidad, Vuelo vuelo) {
        // añade el vuelo pasado como parámetro al conjunto de vuelos asociado a
        // la localidad pasada como parámetro.
        // TODO: Implementar este método
    }

    public boolean hayErrores() {
        // devuelve un boolean indicando si hay errores en los datos, es decir,
        // si hay algún vuelo con la misma localidad de origen que de destino.
        // TODO: Implementar este método
        return false;
    }

    public int numVuelosALocsMillon(Localidad loc) {
        // devuelve un entero con el número de vuelos que parten de la localidad
        // pasada como parámetro y llegan a localidades con más de 1.000.000 habs.
        // TODO: Implementar este método
        return 0;
    }

    public TreeSet<LineaAerea> lineasHasta(Localidad localidad) {
        // devuelve un TreeSet con todas las líneas aéreas que tienen vuelos hacia
        // la localidad pasada como parámetro.
        // TODO: Implementar este método
        return new TreeSet<>();
    }

    public int totalAvionesDesde(Localidad localidad) {
        // devuelve un entero con la suma de todos los aviones que tienen las líneas
        // que hacen vuelos desde la localidad pasada como parámetro.
        // TODO: Implementar este método
        return 0;
    }

    public boolean hayVuelosReciprocos() {
        // devuelve un boolean indicando si existen dos ciudades entre las que hay
        // vuelos en los dos sentidos.
        // TODO: Implementar este método
        return false;
    }
}
