package cl.aerochinquihue.model;

import java.util.ArrayList;

public class Registro {
    private ArrayList<Vuelo> registroVuelos;
    private ArrayList<Servicio> registroServicios;
    private int contServicioId;
    private int contVuelosId;

    public Registro(){
        this.registroVuelos = new ArrayList<>();
        this.registroServicios = new ArrayList<>();
        this.contServicioId = 1;
        this.contVuelosId = 1;
    }

    // Métodos.
    public void agregarServicio(Servicio servicio){
        servicio.setId(contServicioId);
        contServicioId++;
        registroServicios.add(servicio);
    }

    public double calcularVentasDiarias(){
        return 1;
    }

    public void obtenerVuelosDisponibles(){
        
    }

    public void filtrarServiciosPorEstado(EstadoServicio estado){

    }
}
