package Prices;

public class PriceChildrens implements Price {

    @Override
    public double getAmount(int rentalDays) {

        double thisAmount = 1.5;
        if (rentalDays > 3)
            thisAmount += (rentalDays - 3) * 1.5;

        return thisAmount;
    }

    @Override
    public int getRenterPoints() {
        return 1;
    }
}
