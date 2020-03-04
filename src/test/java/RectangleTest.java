import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle ;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(10.2, 4.0);
    }

    @Test
    public void area() {
        rectangle.area();
        Assert.assertEquals(40.8, 40.8, 40.8);
    }

    @Test
    public void perimeter() {
        rectangle.perimeter();
        Assert.assertEquals(81.6, 81.6, 81.6);

    }
}