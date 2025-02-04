/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package watchtv;

/**
 *
 * @author adoni
 */
public class WatchTv {

    /**
     * @param args the command line arguments
     */

    private final String marca;
    private int pulgada;
    private boolean encendida;
    private int volumen;

    // Constructor
    public WatchTv(String marca, int pulgada) {
        this.marca = marca;
        this.pulgada = pulgada;
        this.encendida = false;
        this.volumen = 10;
    }

    // Métodos
    public void encender() {
        encendida = true;
        System.out.println("La TV " + marca + " esta encendida.");
        System.out.println("(=====visualisar contenido====)");
    }

    public void apagar() {
        encendida = false;
        System.out.println("La TV " + marca + " esta apagada.");
    }

    public void subirVolumen() {
        if (encendida) {
            volumen++;
            System.out.println("Subiendo volumen nivel : %" + volumen);
        } else {
            System.out.println("no se puede subir el volumen, la TV está apagada.");
        }
    }

    public void bajarVolumen() {
        if (encendida && volumen > 0) {
            volumen--;
            System.out.println("bajando volumen nivel : %" + volumen);
        } else {
            System.out.println("No se puede bajar el volumen. La TV está apagada o el volumen ya está en 0. \n");
        }
    }

    
    
}
