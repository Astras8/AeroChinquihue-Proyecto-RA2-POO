package cl.aerochinquihue.model;

public class Vuelo {
    private int ID;
    private Servicio ServiciosReservados[];
    private Destino Destino;
    private Avion AvionAsignado;
    private Fecha FechaVuelo;
    private int AsientosRestantes;
    private double PesoRestante;
    private String HorarioSalida;
    private EstadoVuelo Estado = EstadoVuelo.DISPONIBLE;

    // getters
    public Destino getDestino(){
        return Destino;
    }

    // metodos
    public void cancelarVuelo(){
        this.Estado = EstadoVuelo.CANCELADO;
    }
    public void calcularPesoOcupado(){
        
    }
}