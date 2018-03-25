/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Alumno
 */
public class Repairman implements Observer{

    @Override
    public void update(Observable o, Object o1) { // does nothing with the observable object, just advice.
        if(o instanceof Car && o1 instanceof CarState){
            checkCar( (Car) o,(CarState) o1);
        }
    }
    
    private void checkCar(Car car, CarState previousCarState) {
        checkOil(car , previousCarState);
        checkWater(car, previousCarState);
        checkPressure(car, previousCarState);
    }
    
    private void checkOil(Car car, CarState previousCarState){
        if(car.getOilLevel() != previousCarState.getOilLevel()){
            System.out.println("Se detectó un cambio en el nivel de aceite. De "
                                + previousCarState.getOilLevel() + " A "
                                + car.getOilLevel() + ".");
        }
    }
    
    private void checkPressure(Car car, CarState previousCarState){
        if(car.getWheelsPressure()!= previousCarState.getWheelsPressure()){
            System.out.println("Se detectó un cambio en la presion de las ruedas. De "
                                + previousCarState.getWheelsPressure()+ " A "
                                + car.getWheelsPressure()+ ".");
        }
    }
    
    private void checkWater(Car car, CarState previousCarState){
        if(car.getWaterLevel() != previousCarState.getWaterLevel()){
            System.out.println("Se detectó un cambio en el nivel de agua. De "
                                + previousCarState.getWaterLevel() + " A "
                                + car.getWaterLevel() + ".");
        }
    }

}
