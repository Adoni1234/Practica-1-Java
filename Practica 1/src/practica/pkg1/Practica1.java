/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1;
import  java.util.Scanner;

/**
 *
 * @author adoni
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 

       System.out.println("Elija una opción");
       int option = scanner.nextInt();
       scanner.nextLine(); // Consumir el salto de línea

       switch(option){
           case 1:
               System.out.println("Ingrese su nombre:");
               String nombre = scanner.nextLine();

               System.out.println("Ingrese el Correo:");
               String correo = scanner.nextLine();

               System.out.println("Nombre: " + nombre + " Correo: " + correo);
               break;

           case 2:
               System.out.println("Operaciones matemáticas");

               System.out.println("Ingrese primer valor:");
               int va1 = scanner.nextInt();

               System.out.println("Ingrese segundo valor:");
               int va2 = scanner.nextInt();

               System.out.println("Suma: " + (va1 + va2));
               System.out.println("Resta: " + (va1 - va2));
               System.out.println("Multiplicación: " + (va1 * va2));

               if (va2 != 0) { // Evitar división por cero
                   System.out.println("División: " + (va1 / va2));
               } else {
                   System.out.println("No se puede dividir por cero.");
               }
               break;

           case 3:
               System.out.println("Números impares del 1 al 100:");
               for (int j = 1; j <= 100; j++) {
                   if (j % 2 != 0) {
                       System.out.println(j);
                   }
               }
               break;

           case 4:
               System.out.println("Números impares del 1 al 100 con while:");
               int k = 1;
               while (k <= 100) {
                   if (k % 2 != 0) {
                       System.out.println(k);
                   }
                   k++;
               }
               break;

           case 5:
               System.out.println("sumatoria del 1 al 50:");
               int suma = 0;
               for (int j = 1; j <= 50; j++) {
                   suma += j;
               }
               System.out.println("Suma total: " + suma);
               break;

           case 6:
               System.out.println("Tablas de multiplicación");
               System.out.println("Ingrese la tabla:");
               int tabla = scanner.nextInt();

               System.out.println("Ingrese hasta dónde generar la tabla:");
               int to = scanner.nextInt();

               for (int j = 0; j <= to; j++) {
                   System.out.println(tabla + " x " + j + " = " + (tabla * j));
               }
               break;

           case 7:
                  System.out.println("Tablas de multiplicacion//");

                  System.out.println("ingrese primer valor//");
                  int var1 = scanner.nextInt();

                  System.out.println("ingrese segundo valor//");
                  int var2 = scanner.nextInt();

                  int mayor = 0;

                  if(var1 > var2){
                   System.out.println("El mayor es: " + var1);
                   System.out.println("El menor es: " + var2);
                  }else if(var2 > var1){
                   System.out.println("El mayor es: " + var2);
                   System.out.println("El menor es: " + var1);
                  }
               break;

           case 8:
                    System.out.println("Par o Impar//");

                     System.out.println("ingrese el valor//");
                     int varlo1 = scanner.nextInt();

                     if(varlo1 % 2 == 0){
                       System.out.println("Es par: " + varlo1);
                     }else{
                      System.out.println("Es impar: " + varlo1);
                     }
               break;

           default:
               System.out.println("Opción no válida.");
               break;
       }
       scanner.close();
    }
    
}
