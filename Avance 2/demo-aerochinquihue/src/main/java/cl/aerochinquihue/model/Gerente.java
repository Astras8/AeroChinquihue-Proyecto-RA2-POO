package cl.aerochinquihue.model;

import java.util.ArrayList;

public class Gerente extends Usuario{
    private String contraseña;

    public Gerente(String contraseña, String usuario, String nombre) {
        super(usuario, nombre);
        this.contraseña = contraseña;
    }

    // Métodos.
    public double revisarVentasTotales(Registro registro){
        double ventasTotales = 0;
        for (Servicio servicio: registro.getRegistroServicios()){
            ventasTotales += servicio.getPrecio();
        }
        return ventasTotales;
    }

    public double revisarVentasDiarias(Registro registro, Fecha fechaIngresada){
        double ventasDiarias = 0;
        for (Servicio servicio: registro.getRegistroServicios()){
            if (servicio.getVueloAsignado().getFechaVuelo() == fechaIngresada){
                ventasDiarias += servicio.getPrecio();
            }
        }
        return ventasDiarias;
    }

    public ArrayList<Vuelo> revisarVuelos(Registro registro){
        return registro.getRegistroVuelos();
    }

    public void aplicarDescuento(Servicio servicio, double porcentaje){
        servicio.setPrecio(servicio.getPrecio()*(porcentaje/100));
        System.out.println("\nSe ha aplicado un descuento del " + porcentaje + "% al servicio con ID:" + servicio.id + "\n");
    }

    public void crearVueloExtraordinario(Destino destinoIngresado, Avion avionIngresado, int diaIngresado, int mesIngresado, int añoIngresado, String horarioSalidaIngresado, Registro registro){
        Vuelo vueloExtraordinario = new Vuelo(destinoIngresado, avionIngresado, diaIngresado, mesIngresado, añoIngresado, horarioSalidaIngresado);
        registro.agregarVuelo(vueloExtraordinario);
        System.out.println("El gerente ha creado un vuelo extraordinario, asignado al registro de vuelos.");
    }
}
