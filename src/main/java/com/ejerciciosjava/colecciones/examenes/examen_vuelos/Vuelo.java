package com.ejerciciosjava.colecciones.examenes.examen_vuelos;

import java.util.Objects;

public class Vuelo {
    private Localidad destino;
    private LineaAerea lineaAerea;

    public Vuelo(Localidad destino, LineaAerea lineaAerea) {
        this.destino = destino;
        this.lineaAerea = lineaAerea;
    }

    public Localidad getDestino() {
        return destino;
    }

    public void setDestino(Localidad destino) {
        this.destino = destino;
    }

    public LineaAerea getLineaAerea() {
        return lineaAerea;
    }

    public void setLineaAerea(LineaAerea lineaAerea) {
        this.lineaAerea = lineaAerea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(destino, vuelo.destino) && Objects.equals(lineaAerea, vuelo.lineaAerea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destino, lineaAerea);
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "destino=" + destino +
                ", lineaAerea=" + lineaAerea +
                '}';
    }
}
