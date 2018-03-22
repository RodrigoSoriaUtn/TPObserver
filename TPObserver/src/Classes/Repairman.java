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
        if(o1 instanceof CarState){
            checkCar((CarState) o1);
        }
    }
    
    private void checkOil(CarState carState){
        int oilLevel = carState.getOilLevel();
        if(oilLevel < 20){
            System.out.println("Se está acabando el aceite!. Aceite: " + oilLevel);
        }
    }
    
    private void checkPressure(CarState carState){
        int pressure = carState.getWheelPressure();
        if(pressure < 20){
            System.out.println("La presion de las ruedas es muy baja!. Presion: " + pressure);
        }else if(pressure > 80){
            System.out.println("La presion de las ruedas es demasiado alta!. Presion: " + pressure);
        }
    }
    
    private void checkWater(CarState carState){
        int waterLevel = carState.getWaterLevel();
        if(waterLevel < 20){
            System.out.println("Se está quedando sin agua!. Agua: " + waterLevel);
        }
    }

    private synchronized void checkCar(CarState carState) {
        System.out.println(carState.toString());
        checkOil(carState);
        checkWater(carState);
        checkPressure(carState);
    }
    
}
