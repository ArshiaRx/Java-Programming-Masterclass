package Polymorphism;
public class Holden extends Car {
    public Holden(int Cylinders, String name){
        super(Cylinders, name);
    }

    public String startEngine(){
        return "Holden -> startEngine()";
    }

    public String accelerate() {
        return "Holden -> accelerate()";
    }

    public String brake(){
        return "Holden -> brake()";
    }
}
