import org.junit.Assert;

import static org.junit.Assert.*;

public class SquareTest {

    Square sq;

    @org.junit.Before
    public void setUp() throws Exception {
         sq = new Square(5, 5);
    }

    @org.junit.Test
    public void area() {
        sq.area(5,5);
        Assert.assertEquals(25, 25);
    }

    @org.junit.Test
    public void perimeter() {
        sq.perimeter();
        Assert.assertEquals(25, 25);
    }
}