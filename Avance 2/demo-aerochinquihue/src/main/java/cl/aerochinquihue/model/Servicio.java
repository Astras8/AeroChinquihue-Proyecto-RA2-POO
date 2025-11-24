package cl.aerochinquihue.model;

public abstract class Servicio {
    protected int ID;
    protected Vuelo VueloAsignado;
    protected double Precio;
    protected String MedioPago;
    protected Fecha FechaReserva;
    protected EstadoServicio Estado = EstadoServicio.EN_PROCESO;

    public Servicio(int ID, Vuelo VueloAsignado, String MedioPago, Fecha FechaReserva) {
        this.ID = ID;
        this.VueloAsignado = VueloAsignado;
        this.MedioPago = MedioPago;
        this.FechaReserva = FechaReserva;
    }

    abstract public double calcularPrecio();

    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
}