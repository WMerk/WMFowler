import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Waldemar on 16.05.2017.
 */
class RentalTest {
    @Test
    void getDaysRented() {
        int rentedDays = 10;
        Rental rental = new Rental(null, rentedDays);

        Assertions.assertEquals(rentedDays,rental.getDaysRented());
    }

    @Test
    void getMovie() {
    }

    @Test
    void toStringTest() {
    }

    @Test
    void showFigures() {
    }

    @Test
    void getAmount() {
    }

    @Test
    void getFrequentRenterPoints() {
    }

}