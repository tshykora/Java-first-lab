package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dishwasher {
    private String model;
    private float maxCapacity;
    private float currentCapacity;
    private boolean isOn;
    private static Dishwasher instance = new Dishwasher();

    public Boolean loadDishes(int count){
        if(currentCapacity > count){
            System.out.println("Dishwasher is full");
            return false;
        }
        else {
            currentCapacity += count;
            System.out.println("Adding a dishes: " + count);
            return true;
        }
    }

    public void cleandDishes(){
        Dishwasher count = null;
    }

    public Boolean turnOn(){
        return true;
    }

    public Boolean turnOff() {
        return false;
    }

    public static Dishwasher getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return ("Model: '" + model + '\'' + ", Max capacity: " + maxCapacity + ", Current capacity: " + currentCapacity + ", Does the dishwasher work: " + isOn + '}');
    }

    public static void main(String[] args){
        Dishwasher[] objArray = new Dishwasher[4];
        objArray[0] = new Dishwasher();
        objArray[1] = new Dishwasher("Bosch series 4", 14, 7, true);
        objArray[2] = getInstance();
        objArray[3] = getInstance();

        for(int i = 0; i < objArray.length; i++){
            System.out.println(objArray[i]);
        }


    }

}
