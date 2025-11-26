package cl.aerochinquihue.model;

import java.util.ArrayList;

public class Cliente extends Usuario {
    private ArrayList<Servicio> serviciosContratados;
    private boolean esPersonalEmergencias = false;

    public Cliente(String usuario, String nombre) {
        super(usuario, nombre);
        this.serviciosContratados = new ArrayList<>();
    }

    // Métodos.
    public boolean validarDescuento(){
        return (0 >= 10);
    }

    public void solicitarPasaje(int numeroAsiento, int diaReserva, int mesReserva, int añoReserva, Vuelo vueloAsignado, Registro registro){
        System.out.println("Intentando crear transporte.\n");
        if (vueloAsignado.puedeAgregarTransporte()){
            Servicio pasaje = new Transporte(numeroAsiento, this, diaReserva, mesReserva, añoReserva, vueloAsignado);
            registro.agregarServicio(pasaje);
            System.out.println("Se ha enviado una solicitud de pasaje pendiente para aprobacion.\n");
            serviciosContratados.add(pasaje);
            System.out.println("Se agrego un servicio a la lista de servicios contratados del cliente: " + this.nombre + "\n");
        }
        else System.out.println("lol\n");
    }   

    public void solicitarEncomienda(double peso, String remitente, Vuelo vueloAsignado, int diaReserva, int mesReserva, int añoReserva, Registro registro){
        if (vueloAsignado.puedeAgregarEncomienda(peso)){
            Servicio encomienda = new Encomienda(peso, this, remitente, vueloAsignado, diaReserva, mesReserva, añoReserva);
            registro.agregarServicio(encomienda);
            serviciosContratados.add(encomienda);
            System.out.println("Se ha enviado una solicitud de encomienda pendiente para aprobacion.\n");
        }
        else System.out.println("lol\n");
    }

    public void finalizarCompra(Servicio servicio, MedioPago medioPago){
        servicio.validarPago(medioPago);
        System.out.println("Se ha finalizado la compra del servicio de ID: " + servicio.getId() + " del cliente: " + this.nombre + "\n");
    }

    // Getters
    public String getNombre(){
        return this.nombre;
    }
}
