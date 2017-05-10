class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        return String.format("\t%s\t\t%d", getMovie().getTitle(), getDaysRented());
    }

    public String showFigures(double thisAmount) {
        return String.format("%s\t%s\n", this.toString(), String.valueOf(thisAmount));
    }

    public double getAmount() {
        return getMovie().price.getAmount(this);
    }

    public int getFrequentRenterPoints() {
        return getMovie().price.getRenterPoints();
    }
}