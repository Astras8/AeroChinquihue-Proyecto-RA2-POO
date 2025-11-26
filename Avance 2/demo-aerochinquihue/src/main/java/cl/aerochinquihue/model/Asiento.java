package cl.aerochinquihue.model;

public class Asiento {
    private int designacion;
    private Cliente pasajero;

    public Asiento(int designacion){
        this.designacion = designacion;
    }

    // Métodos.
    public boolean comprobarAsiento(){
        return (this.pasajero != null);
    }

    @Override
    public String toString(){
        return "\n|| ASIENTO ||\n\nDesignación: " + this.designacion + "\nPasajero: " + pasajero.getNombre();
    }
}