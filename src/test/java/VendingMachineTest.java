import Coins.CoinTypes;
import Coins.Coins;
import Grid.Grid;
import Products.Cola;
import Products.Crisps;
import Products.Sweets;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VendingMachineTest {
    VendingMachine vendingMachine;
    Cola cola1;
    Cola cola2;
    Cola cola3;
    Crisps crisp1;
    Crisps crisp2;
    Crisps crisp3;
    Sweets sweets1;
    Sweets sweets2;
    Sweets sweets3;
    Coins one_p;
    Coins two_p;
    Coins five_p;
    Coins ten_p;
    Coins twenty_p;
    Coins fifty_p;

    @Before
    public void before(){
        one_p = new Coins(CoinTypes.ONE_P);
        two_p = new Coins(CoinTypes.TWO_P);
        five_p = new Coins(CoinTypes.FIVE_P);
        ten_p = new Coins(CoinTypes.TEN_P);
        twenty_p = new Coins(CoinTypes.TWENTY_P);
        fifty_p = new Coins(CoinTypes.FIFTY_P);
        one_p = new Coins(CoinTypes.ONE_P);
        cola1 = new Cola("Irn Bru", 1.00, Grid.A1);
        cola2 = new Cola("Orange Fanta", 1.00, Grid.A2);
        cola3 = new Cola("Sprite", 1.00, Grid.A3);
        crisp1 = new Crisps("Pringles Regular", 0.50, Grid.B1);
        crisp2 = new Crisps("McCoys Salt & Vinegar", 0.50, Grid.B2);
        crisp3 = new Crisps("Walkers Sweet Chilli", 0.50, Grid.B3);
        sweets1 = new Sweets("Yorkie", 0.65, Grid.C1);
        sweets2 = new Sweets("Minstrels", 0.65, Grid.C2);
        sweets3 = new Sweets("M&Ms", 0.65, Grid.C3);
        vendingMachine = new VendingMachine();
        vendingMachine.addProduct(cola1);
        vendingMachine.addProduct(cola2);
        vendingMachine.addProduct(cola3);
        vendingMachine.addProduct(crisp1);
        vendingMachine.addProduct(crisp2);
        vendingMachine.addProduct(crisp3);
        vendingMachine.addProduct(sweets1);
        vendingMachine.addProduct(sweets2);
        vendingMachine.addProduct(sweets3);
    }

    @Test
    public void addProductsToVendingMachine() {
    assertEquals(9, vendingMachine.productCount());
    }

    @Test
    public void vendingMachineHasProducts() {
        assertTrue(vendingMachine.getVendingMachineSnacks().contains(crisp3));
    }

    @Test
    public void enoughCoinsToBuyProduct(){
        vendingMachine.pickItem(fifty_p, crisp1);
        assertEquals()
    }

    @Test
    public void returnChange() {}
}
