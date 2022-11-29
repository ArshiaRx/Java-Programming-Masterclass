public class Point {
    int x, y;
    //int y = 0;
    public Point(){

    }

    public Point(int X, int Y){
        this.x = X;
        this.y = Y;
    }

    //Constructor for X
    public int getX(){
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    //Constructors for Y
    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    //Additional Method
    public double distance(){
        double distance = Math.pow(this.getX() , 2) + Math.pow(this.getY(), 2);
        return Math.sqrt(distance);
    }
    public double distance(int x, int y){
        double distance = Math.pow((this.getX()-x), 2) + Math.pow((this.getY()-y), 2);
        return Math.sqrt(distance);   //Result work fine
    }
    public double distance(Point newPoint){
        double distance = Math.pow((this.getX() - newPoint.getX()) , 2) + Math.pow((this.getY() - newPoint.getY()), 2);
        return Math.sqrt(distance);
    }
}

//Need to work On this