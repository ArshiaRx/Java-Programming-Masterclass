public class Wall {

//  Two fields (instance Variables)
    private double width;
    private double height;

    // Constructors = create class with a parameter and sets the instance variable field equal to the parameter

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
        if (width < 0 && height > 0){
            this.width = 0;
            this.height = height;
        }
        else if (width > 0 && height < 0) {
            this.width = width;
            this.height = 0;
        }
        else if (width < 0 && height < 0){
            this.width = 0;
            this.height = 0;
        }
        else {
            this.width = width;
            this.height = height;
        }
    }

    //    Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

//    Setters
    public void setWidth(double width) {
        this.width = width;
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea(){
        return width * height;
    }
}
