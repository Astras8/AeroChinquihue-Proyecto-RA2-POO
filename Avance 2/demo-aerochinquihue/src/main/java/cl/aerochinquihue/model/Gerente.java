package cl.aerochinquihue.model;

public class Gerente extends Usuario{
    private String contraseña;

    public Gerente(String contraseña, String usuario) {
        super(usuario);
        this.contraseña = contraseña;
    }

    // Métodos.
    public void revisarVentas(){

    }

    public void revisarVuelos(){

    }

    public void aplicarDescuento(Servicio servicio, double porcentaje){
        servicio.setPrecio(servicio.getPrecio()*(porcentaje/100));
    }

    public void crearVueloExtraordinario(){
        
    }
}
