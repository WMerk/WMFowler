package Prices;

public class PriceRegular implements Price {

    @Override
    public double getAmount(int rental) {
        double thisAmount = 2;
        if (rental > 2)
            thisAmount += (rental - 2) * 1.5;

        return thisAmount;
    }

    @Override
    public int getRenterPoints() {
        return 1;
    }
}
