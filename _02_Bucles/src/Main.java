import javax.swing.*;
import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

import static java.lang.Math.random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Contador Simple: Escribe un programa que utilice un bucle for para contar del 1 al 10 e
        //imprimir cada número en la consola.


       /* for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/

        //Suma de Números: Utiliza un bucle while para sumar los números del 1 al 100 e imprimir
        //el resultado.

       /* int contador = 0;
        int sumaTotal = 0;

        while(contador <= 100) {
            sumaTotal += contador;
            contador++;
        }
        System.out.println(sumaTotal);*/


        //Tabla de Multiplicar: Utiliza un bucle for anidado para imprimir la tabla de multiplicar
        //del 1 al 10.

        /*for (int i = 0; i < 11; i++) {
            System.out.println("\nTabla de "+ i);

            for (int j = 0; j < 11; j++) {
                System.out.println(i+ " X " + j + " = " + (i*j));
            }
        }*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //Sistema de Menú Interactivo: Desarrolla un sistema de menú interactivo que muestre
        //diferentes opciones al usuario (por ejemplo, 1. Ver saldo 2. Depositar dinero 3. Retirar
        //dinero 4. Salir). Utiliza un bucle para permitir al usuario interactuar con el menú hasta que
        //elija salir.

/*       String option = "";
        double saldo = 0;


        do {

            option = JOptionPane.showInputDialog(null, " \n\n MENU DE OPCIONES\n" +
                    "1. Ver saldo\n" +
                    "2. Depositar dinero\n" +
                    "3. Retirar\n" +
                    "4. Salir\n\n" +
                    "Ingrese una opcion: ");

            switch (option) {

                case "1":
                    JOptionPane.showMessageDialog(null, "Tu saldo es: $" + saldo);
                    break;

                case "2":
                    String precioString = JOptionPane.showInputDialog(null, "Ingresa el valor a depositar:\n");

                    try {
                        Double precio = Double.parseDouble(precioString);
                        saldo += precio;
                        JOptionPane.showMessageDialog(null, "Dinero ingresado correctamente.\n" +
                                "Tu saldo actual es: " + saldo);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "No se puede ingresar letras, vuelva a ingresar el monto en numeros");
                    }
                    break;

                case "3":

                    try {
                        Double dineroRetirar = Double.parseDouble(JOptionPane.showInputDialog(null, "Tu saldo es: " + saldo + "\nIngresa el valor a retirar:\n"));

                        if (dineroRetirar <= saldo) {
                            saldo -= dineroRetirar;
                            JOptionPane.showMessageDialog(null, "Dinero retirado.\n" + "Tu saldo actual es: " + saldo);
                        }else {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "No se puede ingresar letras, vuelva a ingresar el monto en numeros");
                    }

                    break;
            }


        } while (!option.equals("4"));*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Suma de Números Pares: Escribe un programa que sume solo los números pares del 1 al
        //100 usando un bucle for y luego imprime el resultado.

        /*Integer contador = 0;

        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0) {

                contador += i;

                System.out.println(contador);
            }
        }*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Validación de Entrada de Usuario: Escribe un programa que solicite al usuario que
        //ingrese su edad. Si el usuario ingresa un valor que no es un número válido o está fuera de
        //un rango razonable (por ejemplo, 0-120), el programa debe pedirle al usuario que intente de
        //nuevo. Utiliza un bucle para seguir solicitando la entrada hasta que sea válida.

/*        Integer age = 0;

        do {
            age = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese su edad: "));

            if (age > 120 || age <= 0) {
                JOptionPane.showMessageDialog(null, "No es una edad valida, ingrese nuevamente");
            }
            
        }while (age > 120 || age <= 0);*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Verificar un Número Primo: Escribe un programa que utilice un bucle para verificar si un
        //número dado es primo o no.

        /*int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: "));
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            JOptionPane.showMessageDialog(null, numero + " es un número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número primo.");
        }*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Juego de Adivinanzas: Crea un pequeño juego de adivinanzas donde el usuario debe
        //adivinar un número generado aleatoriamente. Utiliza un bucle do-while para permitir al
        //usuario seguir intentando hasta que adivine el número.


/*        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100);

        int numUser = 0;
        System.out.println(numeroAleatorio);

        do {
            numUser = Integer.parseInt(JOptionPane.showInputDialog(null, "Adivina el numero \n\nIngresa un numero y prueba tu suerte"));

            if ( numUser != numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "No adivinaste, intenta nuevamente");
            }else {
                JOptionPane.showMessageDialog(null, "Adivinaste, ¡Felicidades! \n\n");
            }

        }while (numUser != numeroAleatorio);*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Cálculo de Interés Compuesto: Crea un programa que calcule el crecimiento de una
        //inversión bajo un esquema de interés compuesto.

        // El usuario debe poder ingresar el capital inicial, la tasa de interés anual y el número de años.
        // Utiliza un bucle para calcular y mostrar el saldo de la inversión al final de cada año.


   /*     Double inversion = Double.parseDouble(JOptionPane.showInputDialog(null, "Bienvenido al fondo de inversiones\n\nIngresa el capital inicial"));
        Double interesAnual = Double.parseDouble(JOptionPane.showInputDialog(null, "Bienvenido al fondo de inversiones\n\n" + "Capital: " + inversion + "\n\nIngresa la tasa de interés anual"));
        Integer años = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al fondo de inversiones\n\n" + "Capital: " + inversion + "\n\nTasa de interés anual: " + interesAnual + "\n\nIngresa el numero de años que desea tener la inversion: "));

        double saldo = inversion;

        for (int año = 1; año <= años; año++) {
            double interesPorcentual = interesAnual / 100;
            double interesCompuesto = saldo * interesPorcentual;
            saldo += interesCompuesto;
            JOptionPane.showMessageDialog(null, "Su saldo al final del año " + año + " es: " + saldo);
        }*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        BigInteger inversion = new BigInteger(JOptionPane.showInputDialog(null, "Bienvenido al fondo de inversiones\n\nIngresa el capital inicial"));
        double interesAnual = Double.parseDouble(JOptionPane.showInputDialog(null, "Bienvenido al fondo de inversiones\n\n" + "Capital: " + inversion + "\n\nIngresa la tasa de interés anual"));
        int años = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al fondo de inversiones\n\n" + "Capital: " + inversion + "\n\nTasa de interés anual: " + interesAnual + "\n\nIngresa el numero de años que desea tener la inversion: "));

        BigInteger saldo = inversion;
        String mensaje = "Detalle de la inversión:\n\n";

        for (int año = 1; año <= años; año++) {
            double interesPorcentual = interesAnual / 100;
            BigInteger interesCompuesto = saldo.multiply(BigInteger.valueOf((long) (interesPorcentual * 100)));
            saldo = saldo.add(interesCompuesto);
            mensaje += "Año " + año + ": $" + saldo + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);








    }
}