package cl.aerochinquihue.model;

public class Transporte extends Servicio {
    private int asientoElegido;
    private Cliente pasajero;

    public Transporte(int asientoElegido, Cliente pasajero, int diaReserva, int mesReserva, int añoReserva) {
        super(diaReserva, mesReserva, añoReserva);
        this.asientoElegido = asientoElegido;
        this.pasajero = pasajero;
    }

    // Métodos.
    @Override
    public double calcularPrecio(){
        return vueloAsignado.getDestino().getPrecioTransporte();
    }
}