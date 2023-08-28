package org.example;

public class Prestamo {

    int codigo;
    int fechaInicio;
    int Fecha;
    int Devolucion;
    String Estado;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int fecha) {
        Fecha = fecha;
    }

    public int getDevolucion() {
        return Devolucion;
    }

    public void setDevolucion(int devolucion) {
        Devolucion = devolucion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
