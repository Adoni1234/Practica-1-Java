/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author adoni
 */
public class Prueba {
      public static void main(String[] args){
          
      Calculadora calculadora = new Calculadora();
        
        // usando los metodos de la clase
        int suma2 = calculadora.sumar(10, 2);
        int suma3 = calculadora.sumar(10, 2, 2);
        int suma4 = calculadora.sumar(10, 2, 2, 1);
        
        int resta2 = calculadora.restar(15, 5);
        int resta3 = calculadora.restar(15, 5, 2);
        int resta4 = calculadora.restar(15, 5, 2, 1);
        
        int multiplicacion2 = calculadora.multiplicar(2, 2);
        int multiplicacion3 = calculadora.multiplicar(2, 2, 5);
        int multiplicacion4 = calculadora.multiplicar(2, 2, 5, 10);
        
          
   

        // Mostrar los resultados
        System.out.println("Suma de 2 números: " + suma2);
        System.out.println("Suma de 3 números: " + suma3);
        System.out.println("Suma de 4 números: " + suma4);
        
        System.out.println("Resta de 2 números: " + resta2);
        System.out.println("Resta de 3 números: " + resta3);
        System.out.println("Resta de 4 números: " + resta4);
        
        System.out.println("Multiplicación de 2 números: " + multiplicacion2);
        System.out.println("Multiplicación de 3 números: " + multiplicacion3);
        System.out.println("Multiplicación de 4 números: " + multiplicacion4);
        
       // System.out.println("División: " + division);
      }
}
