package Polymorphism;
public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
        }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
