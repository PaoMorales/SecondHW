package edu.uaslp.library.model;

import java.time.LocalDateTime;
import java.util.LinkedList;

import java.time.LocalDateTime;

public class Prestamo {
    private Usuario usuario;
    private Empleado empleado;
    private LinkedList<Libro> libros = new LinkedList<Libro>();
    private LocalDateTime fechaHora;


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void addLibros(Libro libro) {
        libros.add(libro);
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }


    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
