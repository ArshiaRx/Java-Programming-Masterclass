package Polymorphism;
public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }
    public String startEngine(){
        return "Mitsubishi -> startEngine()";
    }

    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    public String brake(){
        return "Mitsubishi -> brake()";
    }


}
