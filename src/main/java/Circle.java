public class Circle {

    private double radius;

    private AbstractShape as;

    

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
