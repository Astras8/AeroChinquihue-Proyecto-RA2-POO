package cl.aerochinquihue.model;

import java.util.ArrayList;

public class Registro {
    private ArrayList<Vuelo> registroVuelos;
    private ArrayList<Servicio> registroServicios;
    private ArrayList<Transporte> registroTransportes;
    private ArrayList<Encomienda> registroEncomiendas;

    public Registro(){
        this.registroVuelos = new ArrayList<>();
        this.registroServicios = new ArrayList<>();
        this.registroTransportes = new ArrayList<>();
        this.registroEncomiendas = new ArrayList<>();
    }

    // Métodos.
    public void agregarVuelo(Vuelo vuelo){
        registroVuelos.add(vuelo);
        System.out.println("Se ha agregado el vuelo de ID: " + vuelo.getId() + " al registro de vuelos.\n");
    }

    public void agregarTransporte(Transporte servicio){
        registroServicios.add(servicio);
        registroTransportes.add(servicio);
        System.out.println("Se ha agregado el servicio de ID: " + servicio.getId() + " al registro de servicios y transportes.\n");
    }

    public void agregarEncomienda(Encomienda servicio){
        registroServicios.add(servicio);
        registroEncomiendas.add(servicio);
        System.out.println("Se ha agregado el servicio de ID: " + servicio.getId() + " al registro de servicios y encomiendas.\n");
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
    public ArrayList<Servicio> getRegistroServicios(){
        return registroServicios;
    }
    public Transporte getRegistroTransportesEnPosicion(int posicion){
        if (posicion >= 0 && posicion < registroTransportes.size()) return registroTransportes.get(posicion);
        else return null;
    }
    public Encomienda getRegistroEncomiendasEnPosicion(int posicion){
        if (posicion >= 0 && posicion < registroEncomiendas.size()) return registroEncomiendas.get(posicion);
        else return null;
    }
    public Vuelo getRegistroVuelosEnPosicion(int posicion){
        if (posicion >= 0 && posicion < registroVuelos.size()) return registroVuelos.get(posicion);
        else return null;
    }
    public ArrayList<Vuelo> getRegistroVuelos(){
        return registroVuelos;
    }
}
