package com.ejerciciosjava.colecciones.examenes.examen_vuelos;

public class TestExamen {
    public static void main(String[] args) {
        // Crear algunas localidades de ejemplo
        Localidad madrid = new Localidad("Madrid", 3200000);
        Localidad barcelona = new Localidad("Barcelona", 1600000);
        Localidad valencia = new Localidad("Valencia", 800000);
        Localidad sevilla = new Localidad("Sevilla", 700000);
        
        // Crear algunas líneas aéreas
        LineaAerea iberia = new LineaAerea("Iberia", 150);
        LineaAerea ryanair = new LineaAerea("Ryanair", 400);
        LineaAerea vueling = new LineaAerea("Vueling", 100);
        
        // Crear el modelo
        Modelo modelo = new Modelo();
        
        // Añadir localidades (descomentar cuando implementes el método)
        // modelo.addLocalidad(madrid);
        // modelo.addLocalidad(barcelona);
        // modelo.addLocalidad(valencia);
        // modelo.addLocalidad(sevilla);
        
        // Añadir líneas aéreas
        modelo.getLineas().add(iberia);
        modelo.getLineas().add(ryanair);
        modelo.getLineas().add(vueling);
        
        // Crear algunos vuelos de ejemplo (descomentar cuando implementes los métodos)
        // Vuelo vuelo1 = new Vuelo(barcelona, iberia);
        // Vuelo vuelo2 = new Vuelo(valencia, ryanair);
        // Vuelo vuelo3 = new Vuelo(sevilla, vueling);
        
        // Añadir vuelos a las localidades (descomentar cuando implementes el método)
        // modelo.añadirVueloALocalidad(madrid, vuelo1);
        // modelo.añadirVueloALocalidad(madrid, vuelo2);
        // modelo.añadirVueloALocalidad(barcelona, vuelo3);
        
        System.out.println("Estructura creada. Implementa los métodos para probar el examen.");
        
        // Pruebas (descomentar cuando implementes los métodos)
        /*
        System.out.println("¿Hay errores? " + modelo.hayErrores());
        System.out.println("Vuelos desde Madrid a localidades >1M: " + modelo.numVuelosALocsMillon(madrid));
        System.out.println("Líneas que vuelan a Barcelona: " + modelo.lineasHasta(barcelona));
        System.out.println("Total aviones desde Madrid: " + modelo.totalAvionesDesde(madrid));
        System.out.println("¿Hay vuelos recíprocos? " + modelo.hayVuelosReciprocos());
        */
    }
}
