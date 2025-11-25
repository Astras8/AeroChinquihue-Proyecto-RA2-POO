package cl.aerochinquihue.model;

public class Cliente extends Usuario {
    private int CantidadVuelos = 0;
    private Servicio[] ServiciosContratados;
    private boolean EsPersonalEmergencias = false;

    public Cliente(Servicio[] ServiciosContratados, String Usuario) {
        super(Usuario);
        this.ServiciosContratados = ServiciosContratados;
    }

    public boolean validarDescuento(){
        return this.CantidadVuelos >= 10;
    }

    public void reservarPasaje(){
        
    }

    public void solicitarEncomienda(){

    }
}
