package com.ejerciciosjava.colecciones.examenes.examen_biblioteca;

import java.time.LocalDate;

public class TestBiblioteca {
    public static void main(String[] args) {
        // Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca();
        
        // Crear algunos libros
        Libro libro1 = new Libro("978-84-376-0494-7", "El Quijote", "Miguel de Cervantes", 1605, 3);
        Libro libro2 = new Libro("978-84-9815-324-1", "1984", "George Orwell", 1949, 2);
        Libro libro3 = new Libro("978-84-450-7695-2", "Cien años de soledad", "Gabriel García Márquez", 1967, 4);
        Libro libro4 = new Libro("978-84-204-7125-8", "La sombra del viento", "Carlos Ruiz Zafón", 2001, 2);
        Libro libro5 = new Libro("978-84-376-0494-8", "Romeo y Julieta", "William Shakespeare", 1597, 3);
        
        // Crear algunos socios
        Socio socio1 = new Socio("S001", "Ana García", "Calle Mayor 1", "600123456");
        Socio socio2 = new Socio("S002", "Juan Pérez", "Calle Luna 2", "600789012");
        Socio socio3 = new Socio("S003", "María López", "Calle Sol 3", "600345678");
        
        // Añadir libros y socios (descomentar cuando implementes los métodos)
        // biblioteca.añadirLibro(libro1);
        // biblioteca.añadirLibro(libro2);
        // biblioteca.añadirLibro(libro3);
        // biblioteca.añadirLibro(libro4);
        // biblioteca.añadirLibro(libro5);
        
        // biblioteca.añadirSocio(socio1);
        // biblioteca.añadirSocio(socio2);
        // biblioteca.añadirSocio(socio3);
        
        System.out.println("Biblioteca creada. Implementa los métodos para probar el examen.");
        
        // Pruebas (descomentar cuando implementes los métodos)
        /*
        // Prestar algunos libros
        System.out.println("Préstamo de El Quijote a Ana: " + biblioteca.prestarLibro("978-84-376-0494-7", "S001"));
        System.out.println("Préstamo de 1984 a Juan: " + biblioteca.prestarLibro("978-84-9815-324-1", "S002"));
        System.out.println("Préstamo de Cien años de soledad a María: " + biblioteca.prestarLibro("978-84-450-7695-2", "S003"));
        
        // Mostrar libros disponibles
        System.out.println("\nLibros disponibles:");
        for (Libro libro : biblioteca.librosDisponibles()) {
            System.out.println("- " + libro);
        }
        
        // Mostrar libros por autor
        System.out.println("\nLibros de Miguel de Cervantes:");
        for (Libro libro : biblioteca.librosPorAutor("Miguel de Cervantes")) {
            System.out.println("- " + libro);
        }
        
        // Devolver un libro
        System.out.println("\nDevolución de El Quijote: " + biblioteca.devolverLibro("978-84-376-0494-7", "S001"));
        
        // Socio con más libros
        Socio socioMasLibros = biblioteca.socioMasLibros();
        System.out.println("\nSocio con más libros prestados: " + (socioMasLibros != null ? socioMasLibros : "Ninguno"));
        
        // Libros por género (ej: "año")
        System.out.println("\nTotal de libros que contienen 'año' en el título: " + biblioteca.totalLibrosPorGenero("año"));
        
        // Préstamos vencidos (simular fechas pasadas)
        System.out.println("\nPréstamos vencidos:");
        for (Prestamo prestamo : biblioteca.prestamosVencidos()) {
            System.out.println("- " + prestamo);
        }
        */
    }
}
