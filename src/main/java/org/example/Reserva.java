package org.example;

public class Reserva {

    int codigoReserva;
    int FechaSolicitud;
    int FechaVencimiento;

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public int getFechaSolicitud() {
        return FechaSolicitud;
    }

    public void setFechaSolicitud(int fechaSolicitud) {
        FechaSolicitud = fechaSolicitud;
    }

    public int getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        FechaVencimiento = fechaVencimiento;
    }
}
