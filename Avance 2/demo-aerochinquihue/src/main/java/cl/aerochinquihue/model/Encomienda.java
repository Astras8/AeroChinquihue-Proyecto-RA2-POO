package cl.aerochinquihue.model;

public class Encomienda extends Servicio{
    private double Peso;
    private Cliente Emisor;
    private String Remitente;
    private boolean EntregaInicial = false;

    public Encomienda(double Peso, Cliente Emisor, String Remitente, int ID, Vuelo VueloAsignado, String MedioPago, Fecha FechaReserva) {
        super(ID, VueloAsignado, MedioPago, FechaReserva);
        this.Peso = Peso;
        this.Emisor = Emisor;
        this.Remitente = Remitente;
    }

    public void confirmarEntrega(){
        this.EntregaInicial = true;
    }

    @Override
    public double calcularPrecio(){
        return this.Peso*VueloAsignado.getDestino().getPrecioEncomiendaKg();
    }
}
