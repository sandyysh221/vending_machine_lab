package Products;

import Grid.Grid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CrispsTest {

    Crisps crisps;

        @Before
        public void before() {
            crisps = new Crisps("Watsits", 0.50, Grid.B1);
        }

        @Test
        public void getName() {
            assertEquals("Watsits", crisps.getName());
        }

        @Test
        public void getPrice() {
            assertEquals(0.50, crisps.getPrice(),01);
        }

        @Test
        public void getGridLocation() {
            assertEquals(Grid.B1, crisps.getGrid());
        }
    }

