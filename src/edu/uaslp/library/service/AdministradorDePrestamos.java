package edu.uaslp.library.service;

import edu.uaslp.library.model.Prestamo;
import edu.uaslp.library.model.*;


import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;

public class AdministradorDePrestamos {
    public void registraPrestamo(Prestamo prestamo){
        System.out.println("Se regristra un prestamo a:");
        System.out.println("Usuario: " + prestamo.getUsuario().getNombre());
        System.out.println("Empleado: " + prestamo.getEmpleado().getName());
        System.out.println("Fecha/Hora: " + prestamo.getFechaHora());

        LinkedList<Libro> libros= prestamo.getLibros();
        System.out.println("Libros: ");
        for(Libro libro:libros){
            System.out.println("- " +libro.getTitle());
        }

        Iterator<Libro> iterator=libros.iterator();
        while(iterator.hasNext()) {
            Libro libro = iterator.next();
            System.out.println("** " + libro.getTitle());
        }
    }
}
