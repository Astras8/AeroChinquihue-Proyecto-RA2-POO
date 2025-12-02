package cl.aerochinquihue.controller;


//Intento de ""Base de datos"" recalco "intento"
import cl.aerochinquihue.model.Usuario;

public class Contexto { //nombre temporal
    private static Usuario[] usuarioSistema;
    
    private static Usuario usuarioActual;

    //se supone que esto debe recibir los datos del arreglo
    public static void setUsuariosSistema(Usuario[] usuarios){
        usuarioSistema = usuarios;
    }
    //esto de abajo porque losdatos son privados
    public static Usuario[] getUsuarioSistema(){
        return usuarioSistema;
    }
    public static void setUsuarioActual(Usuario u){
        usuarioActual = u; 
    }
    public static Usuario getUsuarioActual(){
        return usuarioActual; 
    }
    //faltaria implementar lo mismo para el registro y comprobar si esto funciona
}
