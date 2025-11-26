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
        System.out.println("\nEl asistente " + this.nombre + " ha enviado el precio ($" + precioServicio + ") del servicio " + servicio.getClass() + " al cliente " + cliente.getNombre());
        return precioServicio;
    }

    public boolean validarTransporte(){ // COMPLETAR.
        return true;
    }

    public boolean validarEncomienda(){ // COMPLETAR.
        return true;
    }
}
