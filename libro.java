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
    /**
     * Permite registrar el nombre del Autor
     * @return Regresa el nomrbe del autor
     */
    public String dimeAutor()
    {
        return Autor;
    }
    /**
     * Permite registrar el nombre del Libro
     * @return Regresa el nomrbe del libro
     */
    public String dimeTitulo()
    {
        return Titulo;
    }
    /**
     * Permite registrar el numero de Paginas
     * @return Regresa el numero de paginas
     */
    public int dimePaginas()
    {
        return Paginas;
    }
    /**
     * Permite acceder a los datos del lib
     * @return una cadena con todos los detalles
     */
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
    /**
     * Permite modificar el numero de referencia
     * @Param Recibe el nuevo numero de referencia
     */
    public void cambiaNumRef(String numRef)
    {
        if(numRef.length() == 3)
        {
             numeroDeReferencia = numRef;
        }
    }
    /**
     * Permite registrar el numero de referencia
     * @return Regresa el numero de referencia
     */
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
    /**
     * Solicita un prestamo y aumenta en +1 la variable
     */
    public void presta()
    {
        Prestamos += 1;
    }
    /**
     * Permite registrar el numero de prestamos
     * @return Regresa el numero de prestamos
     */
    public int dimePrestamos()
    {
        return Prestamos;
    }
}