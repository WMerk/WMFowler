import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Merk Waldemar on 12.05.2017.
 */
class PriceChildrensTest {
    @Test
    void getAmount() {
        PriceChildrens priceChildrens = new PriceChildrens();

        Rental rental = new Rental(null,10);
        double amount = priceChildrens.getAmount(rental);

        double thisAmount = 1.5;
        if (rental.getDaysRented() > 3)
            thisAmount += (rental.getDaysRented() - 3) * 1.5;

        Assertions.assertEquals( thisAmount , amount);
    }

    @Test
    void getRenterPoints() {
        PriceChildrens priceChildrens = new PriceChildrens();
        Assertions.assertEquals( 1 , priceChildrens.getRenterPoints());
    }

}