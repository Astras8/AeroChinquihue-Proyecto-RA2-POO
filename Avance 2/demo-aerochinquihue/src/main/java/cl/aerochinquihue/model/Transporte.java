package cl.aerochinquihue.model;

public class Transporte extends Servicio {
    private int asientoElegido;

    public Transporte(int asientoElegido, Cliente cliente, int diaReserva, int mesReserva, int añoReserva, Vuelo vueloAsignado) {
        super(cliente, new Fecha(diaReserva, mesReserva, añoReserva));
        this.asientoElegido = asientoElegido;
        this.vueloAsignado = vueloAsignado;
    }

    // Métodos.
    @Override
    public double calcularPrecio(){
        this.precio = vueloAsignado.getDestino().getPrecioTransporte();
        return this.precio;
    }

    @Override
    public String toString(){
        return "|| SERVICIO: TRANSPORTE ||\n\nID: " + this.id + "\nID del vuelo asignado: " + this.vueloAsignado.getId() + "\nPrecio: $" + this.precio + "\nMedio de pago: " + this.pagoElegido + "\nFecha: " + fechaReserva.getDia() + "/" + fechaReserva.getMes() + "/" + fechaReserva.getAño() + "\nEstado: " + this.estadoServicio + "\nAsiento elegido: " + this.asientoElegido + "\n";
    }
}