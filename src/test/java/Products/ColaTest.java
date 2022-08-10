package Products;

import Grid.Grid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ColaTest {

    Cola cola;

    @Before
    public void before() {
        cola = new Cola("Cola-Cola", 1.00, Grid.A1);
    }

    @Test
    public void getName() {
        assertEquals("Cola-Cola", cola.getName());
    }

    @Test
    public void getPrice() {
        assertEquals(1.00, cola.getPrice(),01);
    }

    @Test
    public void getGridLocation() {
        assertEquals(Grid.A1, cola.getGrid());
    }
}
