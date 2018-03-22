/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static java.lang.Thread.sleep;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Thread.sleep;

/**
 *
 * @author Alumno
 */
public class Car extends Observable implements Runnable{
    
    private int waterConsumption;
    private int oilConsumption;
    private int pressureReduction;
            
    private CarState carState;
    
    public Car(String patent, int wheelsCuantity, Colors color, String model, 
            int waterConsumption, int oilConsumption, int pressureReduction) {
        this.carState = new CarState(patent, wheelsCuantity, color, model);
        this.waterConsumption = waterConsumption;
        this.oilConsumption = oilConsumption;
        this.pressureReduction = pressureReduction;
    }
    
    @Override
    public void run() {
        while(carState.getOilLevel() > 0 && carState.getWaterLevel() > 0){
            try {
                viajar();
                sleep(10);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return carState.toString();
    }
    
    public void viajar(){
        carState.decrementOilLevel(3);
        carState.decrementWaterLevel(2);
        carState.decrementWheelPressure(1);
        setChanged();
        super.notifyObservers(carState);
    }
    
}
