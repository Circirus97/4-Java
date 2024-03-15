import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio05 {

    public static void main(String[] args) {

        //Creación de la lista de canciones
        ArrayList<String> playList = new ArrayList<>();

        int option = 0;
        int cancionActual = 0;

        do {

            try {

                option = Integer.parseInt(JOptionPane.showInputDialog(null, "PLAYLIST \n" +
                        "1. Agregar canción\n" +
                        "2. Eliminar canción\n" +
                        "3. Mostrar canción actual y siguiente en la lista\n" +
                        "4. Saltar a la siguiente canción\n" +
                        "5. Salir\n" +
                        "Ingrese una opción (1-5): "));

                switch (option) {

                    case 1://Añadir una canción
                        String nuevaCancion = JOptionPane.showInputDialog(null, "Ingrese el nombre de la canción a agregar");

                        //Agregamos la nueva cancion a la playlist
                        playList.add(nuevaCancion.toLowerCase());

                        JOptionPane.showMessageDialog(null, nuevaCancion + "\nAgregada correctamente.");

                        break;

                    case 2://Eliminar una canción de la playlist

                        //Pedimos al usuario el nombre de la cancion a eliminar
                        String cancionEliminar = JOptionPane.showInputDialog(null, "Ingrese el nombre de la canción a eliminar");

                        //Eliminar la cancion que tenga ese nombre
                        if (playList.remove(cancionEliminar.toLowerCase())) {
                            JOptionPane.showMessageDialog(null, cancionEliminar + "\nEliminada correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, cancionEliminar + "\nNo se encuentra en la playlist");
                        }

                        break;

                    case 3: //Mostrar la cancion actual y la siguiente

                        //Preguntar si la playlist esta vacía
                        if (playList.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "La playlist esta vacía");
                        } else {

                            //Creamos una variable para guardar en texto todas las canciones mayores a la actual
                            String listaTotal = "";

                            //Agregamos la cancion actual
                            listaTotal += "Canción actual\n " + playList.get(cancionActual) + "\n" +
                                    "\n\nSiguientes en la lista:\n";

                            for (int i = cancionActual; i < playList.size() - 1; i++) {
                                //Por cada iteracion concatenamos a la variable listaTotal
                                listaTotal += playList.get(i + 1) + "\n";
                            }

                            JOptionPane.showMessageDialog(null, listaTotal);

                        }
                        break;

                    case 4: //Saltar a la siguiente canción

                        //Validar que si haya una siguiente cancion

                        if (cancionActual + 1 < playList.size()) {
                            cancionActual++;
                            JOptionPane.showMessageDialog(null, playList.get(cancionActual) + " Reproducida correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "Playlist finalizada");
                            cancionActual = 0;
                        }

                        break;
                }


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Caracteres no validos");
            }


        } while (option != 5);


    }
}