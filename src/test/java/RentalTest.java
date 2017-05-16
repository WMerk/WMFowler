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
        Movie m1 = new Movie("Test",1);
        Rental rental = new Rental(m1,10);

        Assertions.assertEquals(m1,rental.getMovie());
    }

    @Test
    void toStringTest() {
        int rentedDays = 10;
        Movie m1 = new Movie("Test",1);
        Rental rental = new Rental(m1, rentedDays);

        Assertions.assertEquals("\tTest\t\t"+rentedDays,rental.toString());
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