public abstract class AbstractShape implements Shape {

    public double area(double l , double b) {
        return l * b;
    }

    public double perimeter(double l , double b) {
        return 2 * l * b;
    }
}
