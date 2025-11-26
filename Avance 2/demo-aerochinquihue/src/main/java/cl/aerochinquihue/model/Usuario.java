package cl.aerochinquihue.model;

public abstract class Usuario {
    protected String usuario;
    protected String nombre;

    public Usuario(String usuario, String nombre) {
        this.usuario = usuario;
        this.nombre = nombre;
    }
}