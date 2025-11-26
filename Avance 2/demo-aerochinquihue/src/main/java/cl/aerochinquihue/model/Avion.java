package cl.aerochinquihue.model;

import java.util.ArrayList;
public abstract class Avion {
    protected String modelo;
    protected ArrayList<Asiento> asientosTotales;
    protected double pesoMaximo;
    protected String designacionSerie;

    public Avion(String modelo, int numAsientosTotales, double pesoMaximo, String designacionSerie) {
        this.modelo = modelo;
        this.asientosTotales = new ArrayList<>(numAsientosTotales);
        this.pesoMaximo = pesoMaximo;
        this.designacionSerie = designacionSerie;
    }

    // Getters.
    public int getAsientosTotales(){
        return asientosTotales.size();
    }
    
    public double getPesoMaximo() {
        return pesoMaximo;
    }
}