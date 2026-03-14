package com.ejerciciosjava.excepciones;

/**
 * Excepción personalizada para representar edades inválidas
 * 
 * Esta es una excepción unchecked (no requiere ser declarada con throws)
 */
public class EdadInvalidaException extends RuntimeException {
    
    /**
     * Constructor que recibe un mensaje de error
     * @param message Descripción del error
     */
    public EdadInvalidaException(String message) {
        super(message);
    }
    
    /**
     * Constructor que recibe mensaje y causa
     * @param message Descripción del error
     * @param cause Causa original de la excepción
     */
    public EdadInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }
    
    /**
     * Constructor que recibe solo la causa
     * @param cause Causa original de la excepción
     */
    public EdadInvalidaException(Throwable cause) {
        super(cause);
    }
}
