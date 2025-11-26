package cl.aerochinquihue.model;

import java.util.ArrayList;

public class Vuelo {
    private int id;
    private ArrayList<Servicio> serviciosReservados;
    private Destino destino;
    private Avion avionAsignado;
    private Fecha fechaVuelo;
    private EstadoVuelo estado = EstadoVuelo.DISPONIBLE;
    private String horarioSalida;

    public Vuelo(Destino destino, Avion avionAsignado, Fecha fechaVuelo, int AsientosRestantes, double PesoRestante, String horarioSalida) {
        this.serviciosReservados = new ArrayList<>();
        this.destino = destino;
        this.avionAsignado = avionAsignado;
        this.fechaVuelo = fechaVuelo;
        this.horarioSalida = horarioSalida;
    }

    // Métodos.
    public void cancelarVuelo(){
        this.estado = EstadoVuelo.CANCELADO;
    }

    // Transportes.
    public int calcularAsientosOcupados(){ // REFACTORIZAR
        int AsientosOcupados = 0;
        for (int i = 0; i < avionAsignado.getAsientosTotales(); i++){
            // if (avionAsignado.AsientosTotales[i].comprobarAsiento()) AsientosOcupados++;
        }
        return AsientosOcupados;
    }

    public int calcularAsientosDisponibles(){
        return avionAsignado.getAsientosTotales() - calcularAsientosOcupados();
    }

    public boolean puedeAgregarTransporte(){
        return (calcularAsientosOcupados() + 1 <= avionAsignado.getAsientosTotales()); // El uno representa el asiento que se quiere agregar. Si, tambien odiamos los números mágicos.
    }

    // Encomiendas.
    public double calcularPesoOcupado(){ // 
        double PesoOcupado = 0;
        for (Servicio servicio : serviciosReservados){
            if (servicio instanceof Encomienda){ // Filtra solo las encomiendas.
                Encomienda encomienda = (Encomienda) servicio; // Casteo de servicio a encomienda para que reconozca el getter.
                PesoOcupado += encomienda.getPeso();
            }
        }
        return PesoOcupado;
    }

    public double calcularPesoDisponible(){
        return this.avionAsignado.getPesoMaximo()-calcularPesoOcupado();
    }

    public boolean puedeAgregarEncomienda(Encomienda encomienda){
        return (calcularPesoOcupado() + encomienda.getPeso() <= this.avionAsignado.getPesoMaximo());
    }

    // Getters.
    public Destino getDestino(){
        return destino;
    }
}