/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Observable;

/**
 *
 * @author Alumno
 */
public class Car extends Observable{
    
    private final String domain; // ID
    private final String model; 
    private CarState carState; //el estado "variable" del auto.
    private final int wheelsCuantity;
    private final String color;
    
    public Car(String domain, int wheelsCuantity, Colors color, String model, 
            int baseWaterLevel, int baseOilLevel, int baseWheelsPressure) {
        this.model = model;
        this.domain = domain;
        this.wheelsCuantity = wheelsCuantity;
        this.carState = new CarState(baseOilLevel, baseWheelsPressure, baseWaterLevel);
        this.color = color.name();
    }
    
    @Override
    public String toString() {
        return "| Vehículo: " + model + " " + color + " " + wheelsCuantity + " ruedas " +
               "| Patente: " + domain + "| Estado: " + carState.toString();
    }
    
    public void setOilLevel(int OilLevel){
        informCarVariations(OilLevel, carState.getWaterLevel(), carState.getWheelsPressure());
    }
    public void setWaterLevel(int waterLevel){
        informCarVariations(carState.getOilLevel(), waterLevel, carState.getWheelsPressure());
    }
    public void setWheelsPressure(float wheelsPressure){
        informCarVariations(carState.getOilLevel(), carState.getWaterLevel(), wheelsPressure);
    }
    
    public int getOilLevel(){
        return carState.getOilLevel();
    }
    public int getWaterLevel(){
        return carState.getWaterLevel();
    }
    public float getWheelsPressure(){
        return carState.getWheelsPressure();
    }
    
    private void informCarVariations(int oilLevel, int waterLevel, float wheelsPressure){
        CarState previousCarState = this.carState.clone();
        this.carState.setOilLevel(oilLevel);
        this.carState.setWheelPressure(wheelsPressure);
        this.carState.setWaterLevel(waterLevel);
        setChanged();
        notifyObservers(previousCarState);
        //Es innecesario llamar a clearChanged ya que se hace automaticamente al final de notifyObservers
    }
    
    
    
}
