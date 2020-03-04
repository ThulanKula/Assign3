import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    private Circle circle;

    @Before
    public void setUp() throws Exception {
        circle = new Circle(5);
    }

    @Test
    public void area() {
        circle.area();
        Assert.assertEquals(78.5, 78.5, 78.5);
    }

    @Test
    public void perimeter() {
        circle.perimeter();
        Assert.assertEquals(31.4, 31.4, 31.4);
    }
}