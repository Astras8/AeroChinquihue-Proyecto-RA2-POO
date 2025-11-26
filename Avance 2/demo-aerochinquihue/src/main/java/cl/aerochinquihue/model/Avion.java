package cl.aerochinquihue.model;

import java.util.ArrayList;
public abstract class Avion {
    protected String modelo;
    protected ArrayList<Asiento> capacidad;
    protected double pesoMaximo;
    protected String designacionSerie;

    public Avion(String modelo, int capacidad, double pesoMaximo, String designacionSerie) {
        this.modelo = modelo;
        this.capacidad = new ArrayList<>(capacidad);
        for (int i = 0; i < capacidad; i++) {
            this.capacidad.add(new Asiento(i + 1)); 
        }
        this.pesoMaximo = pesoMaximo;
        this.designacionSerie = designacionSerie;
    }

    // Getters.
    public int getAsientosTotales(){
        return capacidad.size();
    }
    
    public double getPesoMaximo() {
        return pesoMaximo;
    }
}