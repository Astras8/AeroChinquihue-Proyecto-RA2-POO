package cl.aerochinquihue.model;

public abstract class Avion {
    protected String Modelo;
    protected Asiento[] AsientosTotales;
    protected double PesoMaximo;
    protected String DesignacionSerie;

    public Avion(String Modelo, int NumAsientosTotales, double PesoMaximo, String DesignacionSerie) {
        this.Modelo = Modelo;
        this.AsientosTotales = new Asiento[NumAsientosTotales];
        for (int i = 0; i < AsientosTotales.length; i++){
            AsientosTotales[i] = new Asiento(i + 1);
        }
        this.PesoMaximo = PesoMaximo;
        this.DesignacionSerie = DesignacionSerie;
    }
}