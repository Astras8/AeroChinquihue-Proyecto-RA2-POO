package cl.aerochinquihue.model;

public class Transporte extends Servicio {
    private Asiento AsientoElegido;
    private Cliente Pasajero;

    public Transporte(Asiento AsientoElegido, Cliente Pasajero, int ID, Vuelo VueloAsignado, String MedioPago, Fecha FechaReserva) {
        super(ID, VueloAsignado, MedioPago, FechaReserva);
        this.AsientoElegido = AsientoElegido;
        this.Pasajero = Pasajero;
    }

    @Override
    public double calcularPrecio(){
        return VueloAsignado.getDestino().getPrecioTransporte();
    }
}