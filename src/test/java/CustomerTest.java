import org.junit.jupiter.api.Assertions;

/**
 * Created by Merk Waldemar on 12.05.2017.
 */
class CustomerTest {

    @org.junit.jupiter.api.Test
    void addRental() {
        String customerName = "Test";
        Customer c1 = new Customer(customerName);
        Rental rental = new Rental(null,0);
        c1.addRental(rental);
        Assertions.assertEquals(1,c1.rentals.size());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        String customerName = "Test";
        Customer c1 = new Customer(customerName);
        Assertions.assertEquals( customerName , c1.getName());
    }

    @org.junit.jupiter.api.Test
    void blackBoxTest_Statement() {
        String result;

        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);

        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);

        Customer c1 = new Customer("joe");

        c1.addRental(r1);
        c1.addRental(r2);

        result = "Rental Record for joe\n" +
        "\tTitle\t\tDays\tAmount\n" +
        "\tmovie1\t\t10\t30.0\n" +
        "\tmovie2\t\t5\t4.5\n" +
        "Amount owed is 34.5\n" +
        "You earned 3 frequent renter points";

        Assertions.assertEquals( result , c1.statement()) ;
    }

    @org.junit.jupiter.api.Test
    void getHeader() {

    }
    @org.junit.jupiter.api.Test
    void getFooter() {

    }

}