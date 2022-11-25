public class Carpet {
    private double cost;

    public Carpet(double Cost){
        this.cost = Cost;
    }

    //Getter
    public double getCost(){
        if (cost < 0){
            cost = 0;
        }
        return cost;
    }
}
