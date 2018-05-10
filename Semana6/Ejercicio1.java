/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostutoria;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        //´Para esto se acumula cadenas con cadenafinal. Estudiar.
        String cadenafinal = "";
        Scanner entrada = new Scanner (System.in);
        int suma = 0;
        int edad = 0;
        int contador = 1;
        cadenafinal = String.format("%s\t%s\n", "Edad", "Suma");
        //System.out.printf("%s\t%s\n","Edad","Suma");
        while (contador <=5){
            System.out.println("Ingrese el valor de edad");
            edad = entrada. nextInt();
            suma = suma + edad;
            //System.out.printf("%d\t%d\n", edad, suma);
            cadenafinal = String.format("%s%d\t%d\n", cadenafinal, edad, suma);
            contador = contador + 1;
        }
        System.out.printf("%s", cadenafinal);
}
}