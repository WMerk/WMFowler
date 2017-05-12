import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Merk Waldemar on 12.05.2017.
 */
class PriceNewReleaseTest {
    @Test
    void getAmount() {
        PriceNewRelease price = new PriceNewRelease();

        Rental rental = new Rental(null,10);
        double amount = price.getAmount(rental);

        double thisAmount = rental.getDaysRented() * 3;

        Assertions.assertEquals( thisAmount , amount);
    }

    @Test
    void getRenterPoints() {
        PriceNewRelease price = new PriceNewRelease();
        Assertions.assertEquals( 2 , price.getRenterPoints());
    }

}