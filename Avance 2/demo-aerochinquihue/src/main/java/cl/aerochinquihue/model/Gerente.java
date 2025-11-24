package cl.aerochinquihue.model;

public class Gerente extends Usuario{
    private String Contraseña;

    public Gerente(String Contraseña, String Usuario) {
        super(Usuario);
        this.Contraseña = Contraseña;
    }

    public void revisarVentas(){

    }

    public void revisarVuelos(){

    }

    public void aplicarDescuento(Servicio servicio, double porcentaje){
        servicio.setPrecio(servicio.getPrecio()*(porcentaje/100));
    }
}
