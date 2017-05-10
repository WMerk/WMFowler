public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    public Price price;

    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        setPriceCode(newpriceCode);
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case Movie.REGULAR:
                price = new PriceRegular();
                break;
            case Movie.NEW_RELEASE:
                price = new PriceNewRelease();
                break;
            case Movie.CHILDRENS:
                price = new PriceChildrens();
                break;
        }
    }

    public String getTitle (){
        return title;
    };

}
