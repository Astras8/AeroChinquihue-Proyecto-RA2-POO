package cl.aerochinquihue.model;

import java.util.ArrayList;

public class Registro {
    private ArrayList<Vuelo> vuelos;
    private ArrayList<Servicio> servicios;
    private int contServicioId;
    private int contVuelosId;

    public Registro(){
        this.vuelos = new ArrayList<>();
        this.servicios = new ArrayList<>();
        this.contServicioId = 1;
        this.contVuelosId = 1;
    }

    // Métodos.
    public void agregarServicio(Servicio servicio){
        servicio.setId(contServicioId);
        contServicioId++;
        servicios.add(servicio);
    }

    public double calcularVentasDiarias(){
        return 1;
    }

    public void obtenerVuelosDisponibles(){
        
    }

    public void filtrarServiciosPorEstado(EstadoServicio estado){

    }
}
