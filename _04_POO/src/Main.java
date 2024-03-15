import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

       /*Libro objLibro = new Libro(
               "100 años de soledad",
               "Gabriel Garcia Marquez",
               "Mayo de 1967",
               false);


        System.out.println(objLibro.getTitulo());


        objLibro.setTitulo("El rastro de tu sangre en la nieve");
        objLibro.setPublicacion("1976");

        System.out.println(objLibro.getTitulo());

        System.out.println(objLibro.toString());*/

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////


        Empleado objEmpleado = new Empleado();
        int id = 0;
        Scanner objScanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del empleado: ");
        objEmpleado.setNombre(objScanner.nextLine());

        System.out.println("Ingresa el salario base del empleado: ");
        objEmpleado.setSalario(objScanner.nextDouble());

        System.out.println("Ingrese el cargo del empleado");
        objEmpleado.setPosicion(objScanner.next());

        System.out.println("Ingrese el porcentaje para el aumento salarial: ");
        double porcentajeSalario = objScanner.nextDouble();
        objEmpleado.aumentoSalario(porcentajeSalario);

        objEmpleado.setId(id);
        id ++;

        System.out.println("El salario del empleado " + objEmpleado.getNombre() +" con su respectivo aumentos es de:" + objEmpleado.getSalario());



        ///////////////////////////////////////////////////////////////////////////////////////////////////////////









    }
}