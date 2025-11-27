package cl.aerochinquihue.model;

public class Asistente extends Usuario {
    private String contraseña;
    private double descuentoClientesFrecuentes = 0.90;

    public Asistente(String contraseña, String usuario, String nombre) {
        super(usuario, nombre);
        this.contraseña = contraseña;
    }

    // Métodos.
    public double calcularYEnviarPrecio(Servicio servicio, Cliente cliente){
        double precioServicio = servicio.calcularPrecio();
        servicio.validarYAplicarDescuento(cliente);
        System.out.println("El asistente " + this.nombre + " ha enviado el precio ($" + precioServicio + ") del servicio " + servicio.getClass() + " al cliente " + cliente.getNombre() + "\n");
        return precioServicio;
    }

    public boolean validarTransporte(Transporte transporte){
        if (transporte.validarServicio()){
            transporte.setEstadoServicio(EstadoServicio.APROBADO);
            return true;
        }
        else{
            transporte.setEstadoServicio(EstadoServicio.RECHAZADO);
            return false;
        }
    }

    public boolean validarEncomienda(Encomienda encomienda){
        if (encomienda.validarServicio()){
            encomienda.setEstadoServicio(EstadoServicio.APROBADO);
            return true;
        }
        else{
            encomienda.setEstadoServicio(EstadoServicio.RECHAZADO);
            return false;
        }
    }

    public void registrarCliente(){
        
    }
}
