package Coins;

import java.util.ArrayList;

public class Coins {
    private CoinTypes coinTypes;
    private ArrayList<Coins> amountOfCoinsInserted;

    public Coins(CoinTypes coinTypes) {
        this.coinTypes = coinTypes;
        this.amountOfCoinsInserted = new ArrayList<>();
    }

    public void addCoins(Coins coin) {
       this.amountOfCoinsInserted.add(coin);
    }

    public ArrayList getCoins() {
        return this.amountOfCoinsInserted;
    }

    public int coinsCount() {
        return this.amountOfCoinsInserted.size();
    }

    public double getCoinValue() {
        return this.coinTypes.getValue();
    }
}
