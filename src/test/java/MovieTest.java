import Prices.PriceChildrens;
import Prices.PriceNewRelease;
import Prices.PriceRegular;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Merk Waldemar on 12.05.2017.
 */
class MovieTest {
    @Test
    void setPriceCode() {
        String title = "Test";
        int priceCode = 1;
        Movie movie = new Movie(title,priceCode);

        movie.setPriceCode(Movie.NEW_RELEASE);
        Assertions.assertEquals( PriceNewRelease.class , movie.price.getClass());

        movie.setPriceCode(Movie.CHILDRENS);
        Assertions.assertEquals( PriceChildrens.class , movie.price.getClass());

        movie.setPriceCode(Movie.REGULAR);
        Assertions.assertEquals( PriceRegular.class , movie.price.getClass());
    }

    @Test
    void getTitle() {
        String title = "Test";
        int priceCode = 2;
        Movie movie = new Movie(title,priceCode);

        Assertions.assertEquals( title , movie.getTitle());
    }

}