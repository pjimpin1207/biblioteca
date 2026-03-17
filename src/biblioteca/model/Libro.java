package biblioteca.model;

public class Libro extends ItemBiblioteca {
    private Autor[] autores;
    private int numeroPaginas;

    public Libro(String id, String titulo, int anio, int paginas, Autor[] autores) {
        super(id, titulo, anio);
        this.numeroPaginas = paginas;
        this.autores = autores;
    }
    @Override
    public String obtenerDescripcion() {
        return "libro con" + numeroPaginas + "páginas";
    }
}