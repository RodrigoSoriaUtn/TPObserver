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
class CarState{
    private final String patent; // ID
    private int oilLevel; //0 to 100 (percentage)
    private int wheelPressure;
    private int waterLevel; // 0 to 100 (percentage)
    private int wheelsCuantity;
    private String color;
    private String model; 
    
    public CarState(String patent, int wheelsCuantity, Colors color, String model){
        this.oilLevel = 100;
        this.wheelPressure = 100;
        this.waterLevel = 100;
        this.patent = patent;
        this.wheelsCuantity = wheelsCuantity;
        this.color = color.name();
        this.model = model;
    }
    
    public int getOilLevel() {
        return oilLevel;
    }

    public int getWaterLevel() {
        return waterLevel;
    }
    
    public int getWheelPressure() {
        return wheelPressure;
    }
    
    public void decrementOilLevel(int oilLevel) {
        this.oilLevel-=oilLevel;
    }

    public void decrementWheelPressure(int wheelPressure) {
        this.wheelPressure-= wheelPressure;
    }

    public int decrementWaterLevel(int waterLevel) {
        return waterLevel-=waterLevel;
    }

    @Override
    public String toString() {
        return "| Vehículo: " + model + " " + color + " " + wheelsCuantity + " ruedas " +
               "| Patente: " + patent + "| Estado: " + 
                    " presion de las ruedas: " + wheelPressure + 
                    " nivel de aceite: " + oilLevel + 
                    " nivel de agua: " + waterLevel;
    }
    
}
