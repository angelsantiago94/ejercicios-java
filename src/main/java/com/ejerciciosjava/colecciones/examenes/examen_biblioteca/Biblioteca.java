package com.ejerciciosjava.colecciones.examenes.examen_biblioteca;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;

public class Biblioteca {
    private TreeMap<String, Libro> catalogo; // ISBN -> Libro
    private TreeMap<String, Socio> socios; // Número socio -> Socio
    private ArrayList<Prestamo> prestamos;
    private HashMap<String, TreeSet<Libro>> librosPorAutor; // Autor -> TreeSet<Libro>

    public Biblioteca() {
        this.catalogo = new TreeMap<>();
        this.socios = new TreeMap<>();
        this.prestamos = new ArrayList<>();
        this.librosPorAutor = new HashMap<>();
    }

    public TreeMap<String, Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(TreeMap<String, Libro> catalogo) {
        this.catalogo = catalogo;
    }

    public TreeMap<String, Socio> getSocios() {
        return socios;
    }

    public void setSocios(TreeMap<String, Socio> socios) {
        this.socios = socios;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public HashMap<String, TreeSet<Libro>> getLibrosPorAutor() {
        return librosPorAutor;
    }

    public void setLibrosPorAutor(HashMap<String, TreeSet<Libro>> librosPorAutor) {
        this.librosPorAutor = librosPorAutor;
    }

    // MÉTODOS A IMPLEMENTAR POR EL ALUMNO
    
    public void añadirLibro(Libro libro) {
        // añade el libro al catálogo y también lo añade al mapa de libros por autor
        // si el autor no existe, crea un nuevo TreeSet para ese autor
        // TODO: Implementar este método
    }

    public void añadirSocio(Socio socio) {
        // añade el socio al mapa de socios usando su número de socio como clave
        // TODO: Implementar este método
    }

    public boolean prestarLibro(String isbn, String numeroSocio) {
        // presta un libro si está disponible y el socio existe
        // debe crear un préstamo con fecha actual y fecha de devolución en 15 días
        // actualiza el contador de libros prestados del socio
        // devuelve true si se pudo prestar, false en caso contrario
        // TODO: Implementar este método
        return false;
    }

    public boolean devolverLibro(String isbn, String numeroSocio) {
        // devuelve un libro prestado, marcando el préstamo como devuelto
        // actualiza el contador de libros prestados del socio
        // devuelve true si se pudo devolver, false si no encuentra el préstamo
        // TODO: Implementar este método
        return false;
    }

    public ArrayList<Libro> librosDisponibles() {
        // devuelve un ArrayList con todos los libros que tienen ejemplares disponibles
        // es decir, número de ejemplares > número de préstamos activos
        // TODO: Implementar este método
        return new ArrayList<>();
    }

    public TreeSet<Libro> librosPorAutor(String autor) {
        // devuelve el TreeSet de libros del autor solicitado
        // si el autor no existe, devuelve un TreeSet vacío
        // TODO: Implementar este método
        return new TreeSet<>();
    }

    public ArrayList<Prestamo> prestamosVencidos() {
        // devuelve un ArrayList con todos los préstamos que no han sido devueltos
        // y cuya fecha de devolución es anterior a la fecha actual
        // TODO: Implementar este método
        return new ArrayList<>();
    }

    public Socio socioMasLibros() {
        // devuelve el socio que tiene más libros prestados actualmente
        // si no hay socios con préstamos, devuelve null
        // TODO: Implementar este método
        return null;
    }

    public int totalLibrosPorGenero(String genero) {
        // devuelve el número total de libros que contienen el género especificado
        // en su título (asumiendo que el género puede estar en el título)
        // búsqueda case-insensitive
        // TODO: Implementar este método
        return 0;
    }
}
