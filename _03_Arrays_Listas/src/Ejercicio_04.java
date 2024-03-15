import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio_04 {

    public static void main(String[] args) {

        //Planificador de Viajes: Escribe un programa para ayudar a planificar viajes por
        //carretera. Los usuarios pueden ingresar varias ciudades que planean visitar en
        //orden. Utiliza un arreglo de String para almacenar las ciudades. El programa debe
        //ser capaz de:
        // Añadir y remover ciudades del itinerario.
        // Mostrar la lista completa de ciudades a visitar.
        // (Opcional) Calcular la distancia total del viaje asumiendo distancias ficticias entre ciudades consecutivas.

        ArrayList<String> destiny = new ArrayList<>();

        int option = 0;

        do {

           try {

                option = Integer.parseInt(JOptionPane.showInputDialog(null, "Planificador de Viajes \n" +
                        "1. Agregar destino\n" +
                        "2. Eliminar destino\n" +
                        "3. Mostrar la lista completa de ciudades a visitar\n" +
                        "4. Calcular la distancia total del viaje asumiendo distancias ficticias entre ciudades consecutivas\n" +
                        "5. Salir\n" +
                        "Ingrese una opción (1-5): "));

                switch (option) {

                    case 1: //Añadir destino

                        String newDestiny = JOptionPane.showInputDialog(null, "Ingrese el nombre del destino que desea visitar: ");


                        destiny.add(newDestiny.toLowerCase());

                        JOptionPane.showMessageDialog(null, newDestiny + "\nAgregado correctamente.");

                        break;

                    case 2: //Eliminar destino

                        String deleteDestiny = JOptionPane.showInputDialog(null, "Ingrese el nombre del destino que desea eliminar");

                        //Eliminar la cancion que tenga ese nombre
                        if (destiny.remove(deleteDestiny.toLowerCase())) {
                            JOptionPane.showMessageDialog(null, deleteDestiny + "\nEliminado correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, deleteDestiny + "\nNo se encuentra registrado");
                        }

                        break;

                    case 3: //Mostrar la lista completa de ciudades a visitar

                        String messageDestiny = "Lista de destinos registrados.\n\n";

                        for (int i = 0; i < destiny.size(); i++) {

                            messageDestiny += destiny.get(i) + "\n";
                        }

                        JOptionPane.showMessageDialog(null, messageDestiny);

                        break;


                }



            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Caracteres no validos");
            }



        } while (option != 5);


    }
}
