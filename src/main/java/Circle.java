public class Circle extends AbstractShape  {

  /*  AbstractShape as = new AbstractShape() {
        public double area() {
            return 0;
        }

        public double perimeter() {
            return 0;
        }
    }*/

    private double radius;

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
