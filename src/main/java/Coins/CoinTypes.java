package Coins;

public enum CoinTypes {

    FIVE_P(0.05, true),
    TEN_P(0.10, true),
    TWENTY_P(0.20, true),
    FIFTY_P(0.50, true),
    ONE_P(0.01, false),
    TWO_P(0.02, false);

    private final double value;
    private final boolean valid;

    CoinTypes(double value, boolean valid) {
        this.value = value;
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }

    public double getValue() {
        return value;
    }
}
