package Products;

import Grid.Grid;

public abstract class Products {

    private String name;
    private double price;
    Grid grid;

    public Products (String name, double price, Grid grid) {
        this.name = name;
        this.price = price;
        this.grid = grid;
        }

        public String getName() {
        return name;
        }

        public double getPrice() {
        return price;
    }

    public Grid getGrid() {
        return grid;
    }
}
