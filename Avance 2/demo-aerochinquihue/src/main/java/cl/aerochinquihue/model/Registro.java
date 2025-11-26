package cl.aerochinquihue.model;

import java.util.ArrayList;

public class Registro {
    private ArrayList<Vuelo> registroVuelos;
    private ArrayList<Servicio> registroServicios;

    public Registro(){
        this.registroVuelos = new ArrayList<>();
        this.registroServicios = new ArrayList<>();
    }

    // Métodos.
    public void agregarServicio(Servicio servicio){
        registroServicios.add(servicio);

        System.out.println("Se ha agregado el servicio de ID: " + servicio.getId() + " al registro.\n");
    }

    public double calcularVentasDiarias(){
        return 1;
    }

    public void obtenerVuelosDisponibles(){
        
    }

    public void filtrarServiciosPorEstado(EstadoServicio estado){

    }

    // Getters.
    public Servicio getRegistroServicioEnPosicion(int posicion){
        if (posicion >= 0 && posicion < registroServicios.size()) return registroServicios.get(posicion);
        else return null;
    }
}
