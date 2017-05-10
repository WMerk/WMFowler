public class PriceChildrens implements Price{

    @Override
    public double getAmount(Rental rental) {

        double thisAmount = 1.5;
        if (rental.getDaysRented() > 3)
            thisAmount += (rental.getDaysRented() - 3) * 1.5;

        return thisAmount;
    }

    @Override
    public int getRenterPoints() {
        return 1;
    }
}
