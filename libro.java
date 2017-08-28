public class libro
{
    private String Titulo = "";
    private String Autor = "";
    private int Paginas;
    private int Prestamos;
    private String numeroDeReferencia = "";
    public libro(String titulo, String autor, int paginas)
    {
        Titulo = titulo;
        Autor = autor;
        Paginas = paginas;
        Prestamos = 0;
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
        if(numeroDeReferencia.length()>0)
        {
            Detalles += " ";
            Detalles += "Numero de Referencia: ";
            Detalles += numeroDeReferencia;
        }
        Detalles += "Prestamos: ";
        Detalles += Prestamos;
        return Detalles;
    }
    public void cambiaNumRef(String numRef)
    {
        if(numRef.length() == 3)
        {
             numeroDeReferencia = numRef;
        }
    }
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
    public void presta()
    {
        Prestamos += 1;
    }
    public int dimePrestamos()
    {
        return Prestamos;
    }
}