package Products;

import Grid.Grid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SweetsTest {

    Sweets sweets;

    @Before
    public void before() {
        sweets = new Sweets("Maltesers", 0.65, Grid.C1);
    }

    @Test
    public void getName() {
        assertEquals("Maltesers", sweets.getName());
    }

    @Test
    public void getPrice() {
        assertEquals(0.65, sweets.getPrice(),01);
    }

    @Test
    public void getGridLocation() {
        assertEquals(Grid.C1, sweets.getGrid());
    }
}
