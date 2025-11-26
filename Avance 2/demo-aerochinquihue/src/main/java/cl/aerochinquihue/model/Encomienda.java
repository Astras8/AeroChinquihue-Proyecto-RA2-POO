package cl.aerochinquihue.model;

public class Encomienda extends Servicio{
    private double peso;
    private Cliente emisor;
    private String remitente;
    private boolean entregaInicial = false;

    public Encomienda(double peso, Cliente emisor, String remitente, int diaReserva, int mesReserva, int añoReserva) {
        super(diaReserva, mesReserva, añoReserva);
        this.peso = peso;
        this.emisor = emisor;
        this.remitente = remitente;
    }

    // Métodos.
    public void confirmarEntrega(){
        this.entregaInicial = true;
    }

    @Override
    public double calcularPrecio(){
        return this.peso*vueloAsignado.getDestino().getPrecioEncomiendaKg();
    }

    // Getters
    public double getPeso() {
        return peso;
    }
}
