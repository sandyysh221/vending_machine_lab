package Coins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CoinsTest {

    Coins coins;

    @Before
    public void before() {
        coins = new Coins(CoinTypes.FIFTY_P);
    }

    @Test
    public void getCoinValue() {
        assertEquals(0.50, CoinTypes.FIFTY_P.getValue(), 0.01);
    }

    @Test
    public void testCoinIsValid(){
        assertTrue(CoinTypes.FIFTY_P.isValid());
    }

    @Test
    public void canAddCoin() {
        coins.addCoins(coins);
        assertEquals(1, coins.coinsCount());
    }

    @Test
    public void canGetCoins() {
        coins.addCoins(coins);
        assertTrue(coins.getCoins().contains(coins));
    }
}
