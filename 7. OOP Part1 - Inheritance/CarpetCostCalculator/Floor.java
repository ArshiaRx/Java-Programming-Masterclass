public class Floor {
    private double width, length;

    public Floor(double Width, double Length){
        this.width = Width;
        this.length = Length;
        if (width < 0){
            width = 0;
        }
        else if (length < 0){
            length = 0;
        }
    }

    //Calculate Area
    public double getArea(){
        return width * length;
    }
}
