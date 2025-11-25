package cl.aerochinquihue.model;

public class Asiento {
    private int Designacion;
    private boolean Ocupado = false;
    private Cliente Pasajero;

    public Asiento(int Designacion){
        this.Designacion = Designacion;
    }

    public boolean comprobarAsiento(){
        return (this.Pasajero != null);
    }
}