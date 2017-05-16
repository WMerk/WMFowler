import Prices.PriceChildrens;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by Merk Waldemar on 12.05.2017.
 */
class PriceChildrensTest {
    @Test
    @DisplayName("Get amount for 10 days rental")
    void getAmount() {
        PriceChildrens priceChildrens = new PriceChildrens();

        Rental rental = new Rental(null,10);
        double amount = priceChildrens.getAmount(rental.getDaysRented());

        double thisAmount = 1.5;
        if (rental.getDaysRented() > 3)
            thisAmount += (rental.getDaysRented() - 3) * 1.5;

        Assertions.assertEquals( thisAmount , amount);
    }

    @Test
    @DisplayName("Get points depending on the rental type")
    void getRenterPoints() {
        PriceChildrens priceChildrens = new PriceChildrens();
        Assertions.assertEquals( 1 , priceChildrens.getRenterPoints());
    }

}