package biblioteca.app;

import biblioteca.model.Autor;
import biblioteca.model.Libro;
import biblioteca.model.Revista;
import biblioteca.util.ContadorItems;

public class Main {
    public static void main(String[] args) {
        // Crear  los autores
        Autor a1 = new Autor("Cervantes", "Española");
        Autor[] autores = {a1};

        // Instanciar objetos
        Libro l1 = new Libro("1", "El Quijote", 1700, 2524, autores);
        Revista r1 = new Revista("1", "LaLiga", 2026, 15, "Mensual");

        // Mostrar información de los objetos
        System.out.println(l1.toString() + "-" + l1.obtenerDescripcion());
        System.out.println(r1.toString() + "-" + r1.obtenerDescripcion());

        // Mostrar total de items
        System.out.println("Total de items creados: " + ContadorItems.getTotalItems());
    }
}
