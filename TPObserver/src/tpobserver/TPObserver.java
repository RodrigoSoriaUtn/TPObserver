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
        
        Car car1 = new Car("AB-703-CZ", 6, Colors.AZUL, "Toyota R10", 30, 25, 12);
        
        System.out.println(car1.toString());
        car1.addObserver(repairman);
        
        
        car1.setOilLevel(50);
        car1.setOilLevel(32);
        car1.setOilLevel(15);
        car1.setWaterLevel(50);
        car1.setWheelsPressure(35.12F);
    }
    
}
