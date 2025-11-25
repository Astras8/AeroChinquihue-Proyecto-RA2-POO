package cl.aerochinquihue.model;

import java.util.ArrayList;

public class Vuelo {
    private int ID;
    private ArrayList<Servicio> ServiciosReservados;
    private Destino Destino;
    private Avion AvionAsignado;
    private Fecha FechaVuelo;
    private EstadoVuelo Estado = EstadoVuelo.DISPONIBLE;
    private String HorarioSalida;

    public Vuelo(Destino Destino, Avion AvionAsignado, Fecha FechaVuelo, int AsientosRestantes, double PesoRestante, String HorarioSalida) {
        this.ServiciosReservados = new ArrayList<>();
        this.Destino = Destino;
        this.AvionAsignado = AvionAsignado;
        this.FechaVuelo = FechaVuelo;
        this.HorarioSalida = HorarioSalida;
    }

    // getters
    public Destino getDestino(){
        return Destino;
    }

    // Métodos.
    public void cancelarVuelo(){
        this.Estado = EstadoVuelo.CANCELADO;
    }

    // Transportes.
    public int calcularAsientosOcupados(){
        int AsientosOcupados = 0;
        for (int i = 0; i < AvionAsignado.AsientosTotales.length; i++){
            if (AvionAsignado.AsientosTotales[i].comprobarAsiento()) AsientosOcupados++;
        }
        return AsientosOcupados;
    }

    public int calcularAsientosDisponibles(){
        return AvionAsignado.getAsientosTotales() - calcularAsientosOcupados();
    }

    public boolean puedeAgregarTransporte(){
        return (calcularAsientosOcupados() + 1 <= AvionAsignado.getAsientosTotales()); // El uno representa el asiento que se quiere agregar. Si, tambien odiamos los números mágicos.
    }

    // Encomiendas.
    public double calcularPesoOcupado(){ // 
        double PesoOcupado = 0;
        for (Servicio servicio : ServiciosReservados){
            if (servicio instanceof Encomienda){ // Filtra solo las encomiendas.
                Encomienda encomienda = (Encomienda) servicio; // Casteo de servicio a encomienda para que reconozca el getter.
                PesoOcupado += encomienda.getPeso();
            }
        }
        return PesoOcupado;
    }

    public double calcularPesoDisponible(){
        return this.AvionAsignado.getPesoMaximo()-calcularPesoOcupado();
    }

    public boolean puedeAgregarEncomienda(Encomienda encomienda){
        return (calcularPesoOcupado() + encomienda.getPeso() <= this.AvionAsignado.getPesoMaximo());
    }
}