package cl.aerochinquihue.model;

public class Transporte extends Servicio {
    private Asiento AsientoElegido;
    private Cliente Pasajero;

    public Transporte(Asiento AsientoElegido, Cliente Pasajero, Fecha FechaReserva) {
        super(FechaReserva);
        this.AsientoElegido = AsientoElegido;
        this.Pasajero = Pasajero;
    }

    @Override
    public double calcularPrecio(){
        return VueloAsignado.getDestino().getPrecioTransporte();
    }
}