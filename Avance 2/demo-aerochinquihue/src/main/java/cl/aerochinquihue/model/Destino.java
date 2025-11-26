package cl.aerochinquihue.model;

public class Destino {
    private String nombre;
    private double precioTransporte;
    private double precioEncomiendaKg;

    public Destino(String nombre, double precioTransporte, double precioEncomiendaKg) {
        this.nombre = nombre;
        this.precioTransporte = precioTransporte;
        this.precioEncomiendaKg = precioEncomiendaKg;
    }

    // Getters.
    public double getPrecioTransporte() {
        return precioTransporte;
    }
    public double getPrecioEncomiendaKg() {
        return precioEncomiendaKg;
    }
}