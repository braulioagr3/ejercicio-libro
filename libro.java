public class libro
{
    private String Titulo = "";
    private String Autor = "";
    public libro(String titulo, String autor)
    {
        Titulo = titulo;
        Autor = autor;
    }
    public String dimeAutor()
    {
        return Autor;
    }
    public String dimeTitulo()
    {
        return Titulo;
    }
}