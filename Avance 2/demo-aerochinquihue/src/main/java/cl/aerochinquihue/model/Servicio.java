package cl.aerochinquihue.model;

public abstract class Servicio {
    protected int ID;
    protected Vuelo VueloAsignado;
    protected double Precio;
    protected MedioPago PagoElegido = MedioPago.NO_ELEGIDO;
    protected Fecha FechaReserva;
    protected EstadoServicio Estado = EstadoServicio.EN_PROCESO;

    public Servicio(Fecha FechaReserva){
        this.FechaReserva = FechaReserva;
    }

    abstract public double calcularPrecio();

    public void aplicarDescuento(Cliente cliente){
        if (cliente.validarDescuento() == true) this.Precio = this.Precio*0.10;
    }

    public void validarPago(MedioPago medioElegido){
        if (this.PagoElegido == MedioPago.NO_ELEGIDO) this.PagoElegido = medioElegido;
    }

    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
}