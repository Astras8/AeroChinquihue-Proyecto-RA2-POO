package cl.aerochinquihue.model;

import java.util.ArrayList;

public class Vuelo {
    private static int contadorId = 1;

    private int id;
    private ArrayList<Servicio> serviciosReservados;
    private Destino destino;
    private Avion avionAsignado;
    private Fecha fechaVuelo;
    private EstadoVuelo estado = EstadoVuelo.DISPONIBLE;
    private String horarioSalida;

    public Vuelo(Destino destino, Avion avionAsignado, int diaFechaVuelo, int mesFechaVuelo, int añoFechaVuelo, String horarioSalida) {
        this.id = contadorId++;
        this.serviciosReservados = new ArrayList<>();
        this.destino = destino;
        this.avionAsignado = avionAsignado;
        this.fechaVuelo = new Fecha(diaFechaVuelo, mesFechaVuelo, añoFechaVuelo);
        this.horarioSalida = horarioSalida;
    }

    // Métodos.
    public void cancelarVuelo(){
        this.estado = EstadoVuelo.CANCELADO;
        for (Servicio servicio: serviciosReservados){
            servicio.setEstadoServicio(EstadoServicio.REASIGNANDO);
            servicio.setVueloAsignado(null);
        }
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

    public boolean puedeAgregarEncomienda(double peso){
        return (calcularPesoOcupado() + peso <= this.avionAsignado.getPesoMaximo());
    }

    @Override
    public String toString(){
        return "|| VUELO ||\n\nID: " + this.id + "\nDestino: " + destino.getNombre() + "\nAvion asignado: " + avionAsignado.getDesignacionSerie() + "\nFecha del vuelo: " + fechaVuelo.getDia() + "/" + fechaVuelo.getMes() + "/" + fechaVuelo.getAño() + "\nEstado: " + this.estado + "\nHorario de salida: " + this.horarioSalida + "\n";
    }

    // Getters.
    public int getId(){
        return id;
    }
    public Destino getDestino(){
        return destino;
    }
    public Fecha getFechaVuelo(){
        return fechaVuelo;
    }

    // Setters.
    public void setEstadoVuelo(EstadoVuelo estado){
        this.estado = estado;
    }
}