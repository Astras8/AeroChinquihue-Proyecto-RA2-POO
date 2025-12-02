package cl.aerochinquihue.model;

public class Gerente extends Usuario{
    private String contraseña;

    public Gerente(String contraseña, String usuario, String nombre) {
        super(usuario, nombre);
        this.contraseña = contraseña;
    }

    // Métodos.
    public void revisarVentas(){

    }

    public void revisarVuelos(){

    }

    public void aplicarDescuento(Servicio servicio, double porcentaje){
        servicio.setPrecio(servicio.getPrecio()*(porcentaje/100));
        System.out.println("\nSe ha aplicado un descuento del " + porcentaje + "% al servicio con ID:" + servicio.id + "\n");
    }

    public void crearVueloExtraordinario(){
        
    }
}
