public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        double area = Math.PI*radius*radius;
        return area; //Calculate and return the area
    }

    public double circumference() {
        double circumference = 2*Math.PI*radius;
        return circumference; //Calculate and return the circumfernce
    }

    public double cylinderVolume(double height) {
        double volume = area()*height;
        return volume; //Calculate and return the volume usingheight and area
    }

    public void updateRadius(double radius) {
        this.radius = radius;
    }
}