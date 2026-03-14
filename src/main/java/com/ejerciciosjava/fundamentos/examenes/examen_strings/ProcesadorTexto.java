package com.ejerciciosjava.fundamentos.examenes.examen_strings;

public class ProcesadorTexto {
    private String texto;

    public ProcesadorTexto() {
        this.texto = "";
    }

    public ProcesadorTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    // MÉTODOS A IMPLEMENTAR POR EL ALUMNO
    
    public int contarPalabras() {
        // cuenta el número de palabras en el texto
        // una palabra es una secuencia de caracteres separada por espacios
        // ignora múltiples espacios consecutivos
        // si el texto está vacío o solo tiene espacios, devuelve 0
        // TODO: Implementar este método
        return 0;
    }

    public int contarVocales() {
        // cuenta el número total de vocales (a, e, i, o, u) en el texto
        // cuenta tanto mayúsculas como minúsculas
        // ignora acentos y caracteres especiales
        // TODO: Implementar este método
        return 0;
    }

    public String invertirTexto() {
        // devuelve el texto invertido carácter por carácter
        // si el texto es null, devuelve ""
        // TODO: Implementar este método
        return "";
    }

    public String textoMayusculas() {
        // devuelve el texto en mayúsculas
        // si el texto es null, devuelve ""
        // TODO: Implementar este método
        return "";
    }

    public boolean esPalindromo() {
        // devuelve true si el texto es un palíndromo
        // ignora mayúsculas/minúsculas, espacios y signos de puntuación
        // solo considera letras y números
        // TODO: Implementar este método
        return false;
    }

    public String[] dividirPorVocales() {
        // divide el texto en partes usando las vocales como separadores
        // devuelve un array con las partes resultantes
        // si no hay vocales, devuelve array con el texto completo
        // TODO: Implementar este método
        return new String[0];
    }

    public String reemplazarVocales(char caracter) {
        // reemplaza todas las vocales del texto por el carácter especificado
        // mantiene las mayúsculas/minúsculas originales
        // si el texto es null, devuelve ""
        // TODO: Implementar este método
        return "";
    }

    public String eliminarEspaciosExtra() {
        // elimina espacios múltiples consecutivos dejando solo uno
        // también elimina espacios al inicio y final
        // si el texto es null, devuelve ""
        // TODO: Implementar este método
        return "";
    }

    public int contarPalabrasLongitudPar() {
        // cuenta cuántas palabras tienen longitud par
        // ignora signos de puntuación al final de las palabras
        // TODO: Implementar este método
        return 0;
    }

    public String palabraMasLarga() {
        // devuelve la palabra más larga del texto
        // si hay varias con la misma longitud, devuelve la primera
        // si no hay palabras, devuelve ""
        // TODO: Implementar este método
        return "";
    }
}
