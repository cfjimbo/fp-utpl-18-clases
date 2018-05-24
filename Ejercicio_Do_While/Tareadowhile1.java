/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdowhile;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tareadowhile1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        String nombreJug;
        String option;
        int pases;
        int goles;
        double sumaP = 0;
        double sumaG = 0;
        double promP;
        double promG;
        double sumaPF = 0;
        double sumaPG = 0;
        String nivJug = null;
        boolean bandera = true;
        int i = 0;
        String cadena_final = String.format("\n\nReporte de Jugadores del Equipo UTPL\n\n%s\t%s\t\t%s\t\t%s\n", "Nombre del Jugador", "Total de Pases", "Total de Goles", "Nivel del Jugador");

        do {
            System.out.println("Ingrese el nombre del Jugador");
            nombreJug = entrada.nextLine();
            System.out.println("Ingrese el número de partidos que ya ha jugado");
            num = entrada.nextInt();
            if (num >= 1) {
                System.out.println("Ingrese el número de Pases por partido P1:");
                pases = entrada.nextInt();
                System.out.println("Ingrese el número de goles por partido G1:");
                goles = entrada.nextInt();
                cadena_final = String.format("%s%-10s\t\t%-10d\t\t%d\t\t\n", cadena_final, nombreJug, pases, goles);
                sumaP = pases;
                sumaG = goles;
            }
            for (int j = 2; j <= num; j++) {
                System.out.printf("Ingrese el total de Pases P%d :\n", j);
                pases = entrada.nextInt();
                System.out.printf("Ingrese el total de Goles G%d :\n", j);
                goles = entrada.nextInt();
                cadena_final = String.format("%s\t\t\tP%d:%d\t\t\tG%d:%d\n", cadena_final, j, pases, j, goles);
                sumaP = sumaP + pases;
                sumaG = sumaG + goles;
            }
            sumaPF = sumaPF + sumaP;
            sumaPG = sumaPG + sumaG;

            if (sumaP >= 100) {
                nivJug = "Excelente";
            }
            if (sumaP >= 80 && sumaP <= 99) {
                nivJug = "Muy Bueno";
            }
            if (sumaP >= 60 && sumaP <= 79) {
                nivJug = "Bueno";
            }
            if (sumaP <= 59) {
                nivJug = "Regular";
            }
            cadena_final = String.format("%s\n\t\t\tTotal:%.2f\t\tTotal:%.2f\t\t%s\n", cadena_final, sumaP, sumaG, nivJug);
            entrada.nextLine();
            System.out.println("Desea ingresar algún otro jugador(Si/No): ");
            option = entrada.nextLine();
            if (option.equals("No")) {
                bandera = false;
            }
            i = i + 1;
        } while (bandera);

        promP = sumaPF / i;
        promG = sumaPG / i;

        System.out.println(cadena_final);
        System.out.println("Datos Finales");
        System.out.printf("%d Jugadores Analizados.\n", i);
        System.out.printf("%s%.2f", "Promedio de Pases del Equipo: ", promP);
        System.out.printf("\nPromedio de Goles del equipo es: %.2f\n", promG);
    }
}
