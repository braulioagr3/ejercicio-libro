public class libro
{
    private String Titulo = "";
    private String Autor = "";
    private int Paginas;
    public libro(String titulo, String autor, int paginas)
    {
        Titulo = titulo;
        Autor = autor;
        Paginas = paginas;
    }
    
    public String dimeAutor()
    {
        return Autor;
    }
    
    public String dimeTitulo()
    {
        return Titulo;
    }
    
    public int dimePaginas()
    {
        return Paginas;
    }
    public String dimeDetalles()
    {
        String Detalles = "";
        Detalles += "Titulo: ";
        Detalles += Titulo;
        Detalles += " ";
        Detalles += "Autor: ";
        Detalles += Autor;
        Detalles += " ";
        Detalles += "Paginas: ";
        Detalles += Paginas;
        return Detalles;
    }
}