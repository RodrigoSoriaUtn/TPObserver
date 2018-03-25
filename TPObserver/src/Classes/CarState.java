/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;



/**
 *
 * @author Alumno
 */
class CarState implements Cloneable{
    
    private int oilLevel; //0 to 100 (percentage)
    private float wheelPressure;
    private int waterLevel; // 0 to 100 (percentage)
    
    public CarState(int baseOilLevel, float baseWheelPressure, int baseWaterLevel){
        this.oilLevel = baseOilLevel;
        this.wheelPressure = baseWheelPressure;
        this.waterLevel = baseWaterLevel;
    }
    
    public int getOilLevel() {
        return oilLevel;
    }

    public int getWaterLevel() {
        return waterLevel;
    }
    
    public float getWheelsPressure() {
        return wheelPressure;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public void setWheelPressure(float wheelPressure) {
        this.wheelPressure = wheelPressure;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }
    
    @Override
    public String toString() {
        return  " presion de las ruedas: " + wheelPressure + 
                " nivel de aceite: " + oilLevel + 
                " nivel de agua: " + waterLevel;
    }
    
    @Override
    public CarState clone(){
        CarState carState = null;
        try {
            carState = (CarState) super.clone();
        } catch (CloneNotSupportedException ex) { }
        return carState;
    }
    
}
