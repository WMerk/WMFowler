public class PriceNewRelease implements Price{

    @Override
    public double getAmount(Rental rental) {
        return rental.getDaysRented() * 3;
    }

    @Override
    public int getRenterPoints() {
        return 2;
    }
}
