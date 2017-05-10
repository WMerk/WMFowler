public class PriceRegular implements Price{

    @Override
    public double getAmount(Rental rental) {
        double thisAmount = 2;
        if (rental.getDaysRented() > 2)
            thisAmount += (rental.getDaysRented() - 2) * 1.5;

        return thisAmount;
    }

    @Override
    public int getRenterPoints() {
        return 1;
    }
}
