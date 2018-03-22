/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpobserver;

import Classes.Car;
import Classes.Colors;
import Classes.Repairman;

/**
 *
 * @author Alumno
 */
public class TPObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Repairman repairman = new Repairman();
        
        Car car1 = new Car("AB-703-CZ", 6, Colors.AZUL, "Toyota R10", 3, 2, 1);
        Car car2 = new Car("RS-144-GL", 4, Colors.AMARILLO, "Toyota R10", 10, 6, 3);
        Car car3 = new Car("OS-885-SL", 4, Colors.ROJO, "Toyota R10", 8, 7, 2);
        
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        
        car1.addObserver(repairman);
        car2.addObserver(repairman);
        car3.addObserver(repairman);
        
        Thread carTravel = new Thread(car1);
        Thread carTravel2 = new Thread(car2);
        Thread carTravel3 = new Thread(car3);
        
        carTravel.start();
        carTravel2.start();
        carTravel3.start();
    }
    
}
