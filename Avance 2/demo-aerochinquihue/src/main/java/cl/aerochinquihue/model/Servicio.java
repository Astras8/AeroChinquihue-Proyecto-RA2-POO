package cl.aerochinquihue.model;

public abstract class Servicio {
    protected int id = 1;
    protected Vuelo vueloAsignado;
    protected double precio;
    protected MedioPago pagoElegido = MedioPago.NO_ELEGIDO;
    protected Fecha fechaReserva;
    protected EstadoServicio estado = EstadoServicio.EN_PROCESO;

    public Servicio(Fecha fechaReserva){
        this.fechaReserva = fechaReserva;
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
    public int getId(){
        return this.id;
    }
    public double getPrecio() {
        return this.precio;
    }

    // Setters.
    public void setId(int id){
        this.id = id;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}