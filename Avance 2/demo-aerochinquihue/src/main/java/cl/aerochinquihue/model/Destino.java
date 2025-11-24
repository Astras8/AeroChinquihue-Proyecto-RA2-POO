package cl.aerochinquihue.model;

public class Destino {
    private String Nombre;
    private double PrecioTransporte;
    private double PrecioEncomiendaKg;

    public Destino(String Nombre, double PrecioTransporte, double PrecioEncomiendaKg) {
        this.Nombre = Nombre;
        this.PrecioTransporte = PrecioTransporte;
        this.PrecioEncomiendaKg = PrecioEncomiendaKg;
    }

    // getters
    public double getPrecioTransporte() {
        return PrecioTransporte;
    }
    public double getPrecioEncomiendaKg() {
        return PrecioEncomiendaKg;
    }
}