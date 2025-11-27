package cl.aerochinquihue.model;

public class Encomienda extends Servicio{
    private double peso;
    private String remitente;
    private boolean entregaInicial = false;

    public Encomienda(double peso, Cliente cliente, String remitente, Vuelo vueloAsignado, int diaReserva, int mesReserva, int añoReserva) {
        super(cliente, new Fecha(diaReserva, mesReserva, añoReserva));
        this.peso = peso;
        this.remitente = remitente;
        this.vueloAsignado = vueloAsignado;
    }

    // Métodos.
    public void confirmarEntrega(){
        this.entregaInicial = true;
        System.out.println("\nSe ha confirmado la entrega de la encomienda al aerodromo.\n");
    }

    @Override
    public double calcularPrecio(){
        this.precio = this.peso*vueloAsignado.getDestino().getPrecioEncomiendaKg();
        return this.precio;
    }

    @Override
    public String toString(){
        return "|| SERVICIO: ENCOMIENDA ||\n\nID: " + this.id + "\nID del vuelo asignado: " + this.vueloAsignado.getId() + "\nEmisor: " + this.cliente.getNombre() + "\nPrecio: $" + this.precio + "\nMedio de pago: " + this.pagoElegido + "\nFecha: " + fechaReserva.getDia() + "/" + fechaReserva.getMes() + "/" + fechaReserva.getAño() + "\nEstado: " + this.estadoServicio + "\nPeso: " + this.peso + "Kg.\nRemitente: " + this.remitente + "\n" + "Se entrego en el aerodromo: " + this.entregaInicial + "\n";
    }

    // Getters.
    public double getPeso() {
        return peso;
    }
}
