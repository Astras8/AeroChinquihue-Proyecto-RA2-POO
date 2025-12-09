package cl.aerochinquihue.controller;


import cl.aerochinquihue.model.Destino;
import cl.aerochinquihue.model.Registro;
//Intento de ""Base de datos"" recalco "intento"
import cl.aerochinquihue.model.Usuario;

public class Contexto { //nombre temporal
    private static Usuario[] usuarioSistema;
    
    private static Usuario usuarioActual;

    private static Registro registro;

    private static Destino destinoElegido;

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

    public static void setRegistro(Registro r){
        registro = r;
    }
    public static Registro getRegistro(){
        return registro;
    }

    public static void setDestinoElegido(Destino destino){
        destinoElegido = destino;
    }

    public static Destino getDestinoElegido(){
        return destinoElegido;
    }
}
