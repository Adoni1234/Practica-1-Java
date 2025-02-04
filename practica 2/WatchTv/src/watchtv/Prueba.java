/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchtv;
import watchtv.WatchTv;

/**
 *
 * @author adoni
 */
public class Prueba {
    public static void main(String[] args) {
        // Crear instancias de la clase Tv
        WatchTv tvs = new WatchTv("samsung", 55);
        WatchTv tvT = new WatchTv("Tecnomaster", 42);
        WatchTv tvS = new WatchTv("Sony", 65);

        // Asignar valores y probar métodos
        tvs.encender();
        tvs.subirVolumen();
        tvs.bajarVolumen();
        tvs.apagar();

        tvT.encender();
        tvT.subirVolumen();
        tvT.apagar();

        tvS.encender();
        tvS.bajarVolumen();
        tvS.apagar();
    }
}
