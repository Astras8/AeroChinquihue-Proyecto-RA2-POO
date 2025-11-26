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

    public void solicitarPasaje(int numeroAsiento, int diaReserva, int mesReserva, int añoReserva, Registro registro){
        Servicio pasaje = new Transporte(numeroAsiento, this, diaReserva, mesReserva, añoReserva);
        registro.agregarServicio(pasaje);
        System.out.println("\nSe ha enviado una solicitud de pasaje pendiente para aprobacion.\n");
        serviciosContratados.add(pasaje);
        System.out.println("\nSe agrego un servicio a la lista de servicios contratados del cliente: " + this.nombre + "\n");
    }   

    public void solicitarEncomienda(double peso, String remitente, int diaReserva, int mesReserva, int añoReserva, Registro registro){
        Servicio encomienda = new Encomienda(peso, this, remitente, diaReserva, mesReserva, añoReserva);
        registro.agregarServicio(encomienda);
        serviciosContratados.add(encomienda);
        System.out.println("\nSe ha enviado una solicitud de encomienda pendiente para aprobación.\n");
    }

    // Getters
    public String getNombre(){
        return this.nombre;
    }
}
