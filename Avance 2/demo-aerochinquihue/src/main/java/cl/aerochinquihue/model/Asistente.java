package cl.aerochinquihue.model;

public class Asistente extends Usuario {
    private String Contraseña;

    public Asistente(String Contraseña, String Usuario) {
        super(Usuario);
        this.Contraseña = Contraseña;
    }

    public void calcularYEnviarPrecio(Servicio servicio){
        
    }
}
