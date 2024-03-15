public class Libro {

    //Atributos

    private String titulo;
    private String autor;
    private String publicacion;
    private boolean prestado;


    //Metodo constructor
    public Libro(String titulo, String autor, String publicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.prestado = prestado;
    }

    //Metodos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void cambiarEstado(){
        /*if (this.prestado) {
            this.prestado = false;
        }else{
            this.prestado = true;
        }*/

        this.prestado = !this.prestado;

        System.out.println("Estado del libro actualizado correctamente");
    }


    //Metodo toString()

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", publicacion='" + publicacion + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}