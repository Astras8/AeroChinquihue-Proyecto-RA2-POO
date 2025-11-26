package cl.aerochinquihue.model;

public abstract class Servicio {
    private static int contadorId = 1;

    protected int id;
    protected Cliente cliente;
    protected Vuelo vueloAsignado;
    protected double precio;
    protected MedioPago pagoElegido = MedioPago.NO_ELEGIDO;
    protected Fecha fechaReserva;
    protected EstadoServicio estadoServicio = EstadoServicio.EN_PROCESO;

    public Servicio(Cliente cliente, Fecha fechaReserva){
        this.id = contadorId++;
        this.cliente = cliente;
        this.fechaReserva = fechaReserva;
    }

    // Métodos.
    public abstract double calcularPrecio();

    public void validarYAplicarDescuento(Cliente cliente){
        if (cliente.validarDescuento()){
            this.precio = this.precio*0.90;
            System.out.println("Se ha validado y aplicado el descuento de 10% al cliente: " + cliente.getNombre() + "\n");
        }
        else System.out.println("Se ha validado y no se ha aplicado el descuento de 10% al cliente: " + cliente.getNombre() + "\n");
    }

    public void validarPago(MedioPago medioElegido){
        if (this.pagoElegido == MedioPago.NO_ELEGIDO) this.pagoElegido = medioElegido;
    }

    // Getters.
    public int getId(){
        return this.id;
    }
    public Cliente getCliente(){
        return this.cliente;
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
    public void setEstadoServicio(EstadoServicio estado) {
        this.estadoServicio = estado;
    }
}