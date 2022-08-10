import Coins.CoinTypes;
import Coins.Coins;
import Products.Products;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Coins> coinsInMachine;
    private ArrayList<Products> vendingMachineSnacks;

    public VendingMachine() {
        this.coinsInMachine = new ArrayList<>();
        this.vendingMachineSnacks = new ArrayList<>();
    }

    public void addProduct(Products product) {
        this.vendingMachineSnacks.add(product);
    }

    public int productCount() {
        return this.vendingMachineSnacks.size();
    }

    public ArrayList getVendingMachineSnacks() {
        return this.vendingMachineSnacks;
    }

    public void pickItem(Coins coin, Products product) {
        if (coin.getCoinValue() == product.getPrice()) {
            return product;
        }
        return coinsInMachine;
    }
}
