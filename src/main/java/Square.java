public class Square extends AbstractShape {

    private double l;
    private double b;

    public Square() {
    }

    public Square(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return this.l * this.b;
    }

    @Override
    public double perimeter() {
        return 4 * this.l;
    }
}
