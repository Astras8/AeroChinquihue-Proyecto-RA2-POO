package cl.aerochinquihue.model;

public class Asistente extends Usuario {
    private String contraseña;
    private double descuentoClientesFrecuentes = 0.90;

    public Asistente(String contraseña, String usuario) {
        super(usuario);
        this.contraseña = contraseña;
    }

    // Métodos.
    public double calcularYEnviarPrecio(Servicio servicio, Cliente cliente){
        double precioServicio = servicio.calcularPrecio();
        servicio.validarYAplicarDescuento(cliente);
        return precioServicio;
    }

    public boolean validarTransporte(){ // COMPLETAR.
        return true;
    }

    public boolean validarEncomienda(){ // COMPLETAR.
        return true;
    }
}
