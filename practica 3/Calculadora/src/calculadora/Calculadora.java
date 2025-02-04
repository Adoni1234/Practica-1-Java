/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author adoni
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public int sumar(int v1, int v2) {
        return v1 + v2;
    }
    
    public int sumar(int v1, int v2, int v3) {
        return v1 + v2 + v3;
    }
    
    public int sumar(int v1, int v2, int v3, int v4) {
        return  v1 + v2 + v3 + v4;
    }
    
    // Metodos para restar
    public int restar(int v1, int v2) {
        return v1 - v2;
    }
    
    public int restar(int v1, int v2, int v3) {
        return v1 - v2 - v3;
    }
    
    public int restar(int v1, int v2, int v3, int v4) {
        return v1 - v2 - v3 - v4;
    }
    
    // Metodos para multiplicar
    public int multiplicar(int v1, int v2) {
        return v1 * v2;
    }
    
    public int multiplicar(int v1, int v2, int v3) {
        return v1 * v2 * v3;
    }
    
    public int multiplicar(int v1, int v2, int v3, int v4) {
        return v1 * v2 * v3 * v4;
    }
    
    
    public int dividir(int v1, int v2) {
        if (v2 == 0) {
            System.out.println("No se puede dividir por cero");
        }
        return v1 / v2;
     
    }
    
}
