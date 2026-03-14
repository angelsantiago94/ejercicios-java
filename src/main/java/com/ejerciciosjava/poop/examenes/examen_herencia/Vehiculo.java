package com.ejerciciosjava.poop.examenes.examen_herencia;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected double velocidadActual;

    public Vehiculo() {
        this.marca = "";
        this.modelo = "";
        this.año = 0;
        this.velocidadActual = 0.0;
    }

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadActual = 0.0;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    // Métodos abstractos
    public abstract void acelerar(double cantidad);
    public abstract void frenar(double cantidad);
    public abstract double calcularConsumo(double distancia);

    // Métodos concretos
    public void detener() {
        this.velocidadActual = 0.0;
    }

    public String getInfo() {
        return marca + " " + modelo + " (" + año + ") - Velocidad: " + 
               String.format("%.1f", velocidadActual) + " km/h";
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
