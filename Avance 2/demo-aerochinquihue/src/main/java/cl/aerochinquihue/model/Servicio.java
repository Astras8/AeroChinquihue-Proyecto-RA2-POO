package cl.aerochinquihue.model;

public abstract class Servicio {
    protected int id;
    protected Vuelo vueloAsignado;
    protected double precio;
    protected MedioPago pagoElegido = MedioPago.NO_ELEGIDO;
    protected Fecha fechaReserva;
    protected EstadoServicio estado = EstadoServicio.EN_PROCESO;

    public Servicio(int diaReserva, int mesReserva, int añoReserva){
        this.fechaReserva.setDia(diaReserva);
        this.fechaReserva.setMes(mesReserva);
        this.fechaReserva.setAño(añoReserva);
    }

    // Métodos.
    abstract public double calcularPrecio();

    public void validarYAplicarDescuento(Cliente cliente){
        if (cliente.validarDescuento()) this.precio = this.precio*0.90;
    }

    public void validarPago(MedioPago medioElegido){
        if (this.pagoElegido == MedioPago.NO_ELEGIDO) this.pagoElegido = medioElegido;
    }

    // Getters.
    public double getPrecio() {
        return precio;
    }

    // Setters.
    public void setId(int id){
        this.id = id;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}