public class Rectangle extends Square {

    private double l;
    private double b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public double area() {
        return this.l * this.b ;
    }

    @Override
    public double perimeter() {
        return 2 * (this.l * this.b);
    }
}
