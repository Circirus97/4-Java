import javax.swing.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //System.out.println nos permite imprimir un mensaje por consola
       /* System.out.println("Hola mundo!");

        //Instaciar la clase Scanner nos permite crear un objeto para leer datos ingresados desde la consola
        Scanner objScanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre ");
        String name = objScanner.nextLine();

        System.out.println("Ingresa tu edad ");
        int age = objScanner.nextInt();

        System.out.println("Ingresa tu altura ");
        double height = objScanner.nextDouble();
        //Shortcut para imprimir en consola
        System.out.println("Datos " + "Nombre " + name + " Edad " + age + " Altura " + height);

        if (age >= 18) {
            System.out.println(name + " Eres mayor de edad");
            if (height > 1.80) {
                System.out.println(" Eres una persona alta");
            } else if (height < 1.80 && height > 1.70) {
                System.out.println(" eres una persona de estatura promedio");
            } else {
                System.out.println(" eres una persona de estatura baja");
            }

        } else {
            System.out.println(name + " Eres menor de edad");
        }
        if (height > 1.80) {
            System.out.println(" Eres una persona alta");
        } else if (height < 1.80 && height > 1.70) {
            System.out.println(" eres una persona de estatura promedio");
        } else {
            System.out.println(" eres una persona de estatura baja");
        }
*/

        //Ejercicios

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///Calculadora basica

        /*String option = JOptionPane.showInputDialog(null, "MENU DE OPERACIONES \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir");

        //Obtener los dos numeros a operar
        String num1 = JOptionPane.showInputDialog(null, "Ingrese el primer número para la ecuacion");
        String num2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número para la ecuacion");

        //Convertir los numeros que estan en string a decimal

        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);

        switch (option) {
            case "1":
                JOptionPane.showMessageDialog(null, a + "+" + b + " = " + (a + b));
                break;
            case "2":
                JOptionPane.showMessageDialog(null, a + "-" + b + " = " + (a - b));
                break;
            case "3":
                JOptionPane.showMessageDialog(null, a + "x" + b + " = " + (a * b));
                break;
            case "4":
                if (b == 0) {
                    JOptionPane.showMessageDialog(null, "El numero debe ser diferente de 0");
                } else {

                    JOptionPane.showMessageDialog(null, a + "/" + b + " = " + (a / b));
                }

                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no valida");
        }*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///Verificador de Edad

/*        Scanner objScanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad ");

        int age = objScanner.nextInt();

        if (age >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///Conversor de Unidades

/*        Scanner convertorScanner = new Scanner(System.in);

        System.out.println("Introduzca una distancia en kilómetros: ");
        Double distance = convertorScanner.nextDouble();

        Double newDistance = distance / 1.60934;

        System.out.println("Su distancia en millas es: " + newDistance);*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///Calculadora de Índice de Masa Corporal (IMC)

/*        Scanner calculateScanner = new Scanner(System.in);

        System.out.println("Introduzca su peso en kilogramos: ");
        Double weight = calculateScanner.nextDouble();

        System.out.println("Introduzca su estatura en metros: ");
        Double height = calculateScanner.nextDouble();

        Double newCalculate = weight/height;
        System.out.println("Su IMC (Indice de masa corporal) es: " + newCalculate);*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///Clasificador de Números

/*        Scanner numberClassifierScanner = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        double numberClassifier = numberClassifierScanner.nextDouble();

        if (numberClassifier == 0) {
            System.out.println("El numero es cero.");
        } else if (numberClassifier % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///Calculadora de Días del Mes

/*      System.out.println("Ingrese el numero del mes: ");
        Integer monthsScanner = objScanner.nextInt();
        String month = null;

        switch (monthsScanner){
            case 1:
                month = "Enero";
                break;
            case 2:
                month = "Febero";
                break;
            case 3:
                month = "Marzo";
                break;
            case 4:
                month = "Abril";
                break;
            case 5:
                month = "Mayo";
                break;
            case 6:
                month = "Junio";
                break;
            case 7:
                month = "Julio";
                break;
            case 8:
                month = "Agosto";
                break;
            case 9:
                month = "Septiembre";
                break;
            case 10:
                month = "Octubre";
                break;
            case 11:
                month = "Noviembre";
                break;
            case 12:
                month = "Diciembre";
                break;

            default:
                System.out.println("Opcion invalida, es de 1 a 12");
        }

        LocalDate date = LocalDate.now().withYear(LocalDate.now().getYear()).withMonth(monthsScanner);

        System.out.println("El mes de: " + month + " tiene " + date.lengthOfMonth() + " dias.");*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /// Cálculo de Promedio

/*      Scanner averageScanner = new Scanner(System.in);

        System.out.println("Ingresa la primera nota: ");
        Double note1 = averageScanner.nextDouble();

        System.out.println("Ingresa la segunda nota: ");
        Double note2 = averageScanner.nextDouble();

        System.out.println("Ingresa la tercera nota: ");
        Double note3 = averageScanner.nextDouble();

        Double noteAverage = (note1+note2+note3)/3;

        if (noteAverage >= 6) {
            System.out.println("El alumno aprobo el curso con un promedio de: " + noteAverage);
        } else {
            System.out.println("El alumno reprobo el curso con un promedio de: " + noteAverage);
        }*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /// Calculadora de Año Bisiesto

/*      System.out.println("Ingrese el año que desea consultar: ");
        Integer yearScanner = objScanner.nextInt();

        LocalDate date = LocalDate.now().withYear(yearScanner).withMonth(2);

        if (date.lengthOfMonth() == 29) {
            System.out.println("El año " + yearScanner + ", es bisiesto");
        }else {
            System.out.println("El año " + yearScanner + ", no es bisiesto");
        }*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /// Calculadora de Propina

        /*Scanner calculateTips = new Scanner(System.in);

        System.out.println("Señor usuario, ingrese el total de la cuenta: ");
        Double totalPayment = calculateTips.nextDouble();

        System.out.println("Señor usuario, ingrese el porcentaje de propina que desea dejar: ");
        Double tips = calculateTips.nextDouble();

        Double totalTipsPayment = (totalPayment / 100)* tips;

        System.out.println("El usuario debe dejar " + totalTipsPayment + " de propina.");*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /// Ordenando Tres Números

       /* System.out.println("Ingresa el primer numero: ");
        Integer num1 = objScanner.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        Integer num2 = objScanner.nextInt();

        System.out.println("Ingresa el tercer numero: ");
        Integer num3 = objScanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println( num3 + "," + num2 + "," + num1);
            }else {
                System.out.println( num2 + "," + num3 + "," + num1);
            }
        }

        if (num2 > num3 && num2 > num1) {
            if (num1 > num3) {
                System.out.println( num3 + "," + num1 + "," + num2);
            }else {
                System.out.println( num1 + "," + num3 + "," + num2);
            }
        }
        if (num3 > num2 && num3 > num1) {
            if (num2 > num1) {
                System.out.println( num1 + "," + num2 + "," + num3);
            }else {
                System.out.println( num2 + "," + num1 + "," + num3);
            }
        }*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /// Generador de Horóscopo

        /*Integer monthsScanner = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el numero del mes de su nacimiento: ", JOptionPane.YES_NO_OPTION));
        Integer dayScanner = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el dia: ", JOptionPane.YES_NO_OPTION));

        String sign = null;

        switch (monthsScanner) {

            case 1:
                if (dayScanner >= 20) {
                    sign = "Camus de Acuario.";
                } else {
                    sign = "Shura de Capricornio.";
                }
                break;
            case 2:
                if (dayScanner >= 19) {
                    sign = "Afrodita de Piscis";
                } else {
                    sign = "Camus de Acuario.";
                }
                break;
            case 3:

                if (dayScanner >= 21) {
                    sign = "Mu de Aries";
                } else {
                    sign = "Afrodita de Piscis";
                }
                break;
            case 4:
                if (dayScanner >= 20) {
                    sign = "Aldebarán de Tauro.";
                } else {
                    sign = "Mu de Aries";
                }
                break;
            case 5:
                if (dayScanner >= 21) {
                    sign = "Saga de Géminis";
                } else {
                    sign = "Aldebarán de Tauro.";
                }
                break;
            case 6:
                if (dayScanner >= 21) {
                    sign = "Mascara de la muerte de Cáncer.";
                } else {
                    sign = "Saga de Géminis";
                }
                break;
            case 7:
                if (dayScanner >= 23) {
                    sign = "Aioria de Leo";
                } else {
                    sign = "Mascara de la muerte de Cáncer.";
                }
                break;
            case 8:
                if (dayScanner >= 23) {
                    sign = "Shaka de Virgo.";
                } else {
                    sign = "Aioria de Leo";
                }
                break;
            case 9:
                if (dayScanner >= 23) {
                    sign = "Dohko de Libra";
                } else {
                    sign = "Shaka de Virgo.";
                }
                break;
            case 10:
                if (dayScanner >= 23) {
                    sign = "Milo de Escorpio.";
                } else {
                    sign = "Dohko de Libra";
                }
                break;
            case 11:
                if (dayScanner >= 22) {
                    sign = "Aioros de Sagitario";
                } else {
                    sign = "Milo de Escorpio.";
                }
                break;
            case 12:
                if (dayScanner >= 22) {
                    sign = "Shura de Capricornio.";
                } else {
                    sign = "Aioros de Sagitario";
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida, es de 1 a 12");
        }

        JOptionPane.showMessageDialog(null, "Eres: " + sign);*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /// Calculadora de Tarifa de Taxi

       /* Double kilometros = Double.parseDouble(JOptionPane.showInputDialog(null, "Bienvenido\n\n La tarifa base es de: $4.900\n\nIngrese la distancia del viaje en kilometros: ", JOptionPane.YES_NO_OPTION));
        Double tarifaBase = 4.900;
*/
        //Por cada 50 metros 100 pesos+

        /*Double metrosRecorrido = (kilometros * 1000)/50;
        Double valorRecorrido = (metrosRecorrido * 100) + 4.900;

        JOptionPane.showMessageDialog(null, "El valor total de su reccorrido es: $" + valorRecorrido);*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /// Convertidor de Temperatura

        //String option = JOptionPane.showInputDialog(null, "Convertidor de Temperatura \n\n 1. Convertir de Celsius a Fahrenheit \n 2. Convertir de Fahrenheit a Celsius");

        //Convertir los numeros que estan en string a decimal

        /*switch (option) {
            case "1":
                Double temperaturaCelsius = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la temperatura en Celsius: "));
                Double convertirAFahrenheit = (temperaturaCelsius * 9/5) + 32;
                JOptionPane.showMessageDialog(null, "Su temperatura en Celsius " + temperaturaCelsius + "° convertida a Fahrenheit es: " + convertirAFahrenheit + "°");
                break;
            case "2":
                Double temperaturaFahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la temperatura en Fahrenheit: "));
                Double convertirACelsius = (temperaturaFahrenheit - 32) * 5/9;
                JOptionPane.showMessageDialog(null, "Su temperatura en Fahrenheit " + temperaturaFahrenheit + "° convertida a Celsius es: " + convertirACelsius + "°");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
        }*/


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /// Sistema de Calificaciones

        Integer calificacion = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese la calificacion del estudiante entre 0 a 100"));

        if (calificacion >= 90 && calificacion <= 100) {
            JOptionPane.showMessageDialog(null, "¡Wow! Eres una estrella, sacaste una A, ¡felicidades!");
        }else if (calificacion >= 80 && calificacion <= 89) {
            JOptionPane.showMessageDialog(null, "¡Buen trabajo! Tu esfuerzo se ve reflejado en esa B, sigue así.");
        }else if (calificacion >= 70 && calificacion <= 79) {
            JOptionPane.showMessageDialog(null, "No está mal, pero sé que puedes hacerlo mejor. Una C te espera, ¡a darle con todo!");
        }else if (calificacion >= 60 && calificacion <= 69) {
            JOptionPane.showMessageDialog(null, "¡Vamos, tú puedes! Una D te dice que debes esforzarte un poco más, ¡sigue adelante!");
        }else if (calificacion >= 0 && calificacion <= 59) {
            JOptionPane.showMessageDialog(null, "No te desanimes, la F es solo una oportunidad para mejorar. Sigue intentándolo, ¡tú puedes lograrlo!");
        } else {
            JOptionPane.showMessageDialog(null, "Calificación no válida, ingresa un número entre 0 y 100");
        }
    }
}