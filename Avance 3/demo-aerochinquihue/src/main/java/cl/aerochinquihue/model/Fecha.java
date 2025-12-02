package cl.aerochinquihue.model;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Validaciones.
    public boolean validarFecha(){
        return (this.validarDia() && this.validarMes() && this.validarAño());
    }
    public boolean validarDia(){
        return (dia >= 1 && dia <= 31);
    }
    public boolean validarMes(){
        return (mes >= 1 && mes <= 12);
    }
    public boolean validarAño(){
        return (año == 2025 || año == 2026);
    }

    // Getters.
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }

    // Setters.
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAño(int año) {
        this.año = año;
    }
}