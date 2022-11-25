public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor flr, Carpet carp){
        this.floor = flr;
        this.carpet = carp;
    }
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
