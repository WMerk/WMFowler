package Prices;

public class PriceNewRelease implements Price {

    @Override
    public double getAmount(int rental) {
        return rental * 3;
    }

    @Override
    public int getRenterPoints() {
        return 2;
    }
}
