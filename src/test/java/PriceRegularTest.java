import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Merk Waldemar on 12.05.2017.
 */
class PriceRegularTest {
    @Test
    void getAmount() {
        PriceRegular price = new PriceRegular();

        Rental rental = new Rental(null,10);
        double amount = price.getAmount(rental);

        double thisAmount = 2;
        if (rental.getDaysRented() > 2)
            thisAmount += (rental.getDaysRented() - 2) * 1.5;

        Assertions.assertEquals( thisAmount , amount);
    }

    @Test
    void getRenterPoints() {
        PriceRegular price = new PriceRegular();
        Assertions.assertEquals( 1 , price.getRenterPoints());
    }

}