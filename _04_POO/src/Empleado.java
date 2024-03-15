public class Empleado {

    private String nombre;

    private String posicion;

    private double salario;

    private int id;

    public Empleado() {
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion(String posicion) {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void aumentoSalario(double porcentajeSalario){

        this.salario = ((salario*porcentajeSalario)/100)+salario;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", salario=" + salario +
                ", id=" + id +
                '}';
    }


}
