package ua.lviv.iot.algo.part1.lab1;
import java.util.ArrayList;

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

    public void turnOn(){
        System.out.println("The dishwasher is turned on");
    }

    public void turnOff() {
        System.out.println("The dishwasher is turned off");
    }

    public static Dishwasher getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return ("Model: '" + model + '\'' + ", Max capacity: " + maxCapacity + ", Current capacity: " + currentCapacity + ", Does the dishwasher work: " + isOn + '}');
    }

    public static void main(String[] args){
        Dishwasher dishwasher = new Dishwasher();
        dishwasher.turnOn();
        dishwasher.turnOff();

        ArrayList<Integer> loadDishes = new ArrayList<Integer>();
        loadDishes.add(1);
        loadDishes.add(2);
        loadDishes.add(3);
        System.out.println("Dishes in dishwasher: " + loadDishes);

        ArrayList<Integer> cleanDishes = new ArrayList<Integer>();
        cleanDishes.clear();
        System.out.println("Dishes in dishwasher: " + cleanDishes);

        Dishwasher[] objArray = new Dishwasher[4];
        objArray[0] = new Dishwasher();
        objArray[1] = new Dishwasher("Bosch series 4", 7, 4, true);
        objArray[2] = getInstance();
        objArray[3] = getInstance();

        for(int i = 0; i < objArray.length; i++){
            System.out.println(objArray[i]);
        }


    }

}
