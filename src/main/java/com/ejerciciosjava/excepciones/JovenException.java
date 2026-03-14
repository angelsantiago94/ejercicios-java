package com.ejerciciosjava.excepciones;

/**
 * Excepción personalizada para representar situaciones relacionadas con personas jóvenes
 * 
 * Esta es una excepción checked (debe ser declarada con throws o capturada)
 */
public class JovenException extends Exception {
    
    /**
     * Constructor que recibe un mensaje de error
     * @param message Descripción del error
     */
    public JovenException(String message) {
        super(message);
    }
    
    /**
     * Constructor que recibe mensaje y causa
     * @param message Descripción del error
     * @param cause Causa original de la excepción
     */
    public JovenException(String message, Throwable cause) {
        super(message, cause);
    }
    
    /**
     * Constructor que recibe solo la causa
     * @param cause Causa original de la excepción
     */
    public JovenException(Throwable cause) {
        super(cause);
    }
}
