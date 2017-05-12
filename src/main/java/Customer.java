
import java.lang.*;
import java.util.*;

class Customer {
    private String name;

    Vector<Rental> rentals = new Vector<Rental>();
    private double totalAmount;
    private int frequentRenterPoints;

    Customer(String newname){
        name = newname;
    };

    void addRental(Rental arg) {

        rentals.addElement(arg);
    };

    String getName(){
        return name;
    };

    String statement() {
        totalAmount = 0;
        frequentRenterPoints = 0;
        Enumeration<Rental> enum_rentals = rentals.elements();
        StringBuilder result = new StringBuilder(getHeader());

        while (enum_rentals.hasMoreElements()) {
            Rental rental = enum_rentals.nextElement();
            //determine amounts for each line
            double thisAmount = rental.getAmount();
            // add frequent renter points
            frequentRenterPoints += rental.getFrequentRenterPoints();
            result.append(rental.showFigures(thisAmount));

            totalAmount += thisAmount;
        }
        result.append(addFooter());
        return result.toString();
    }

    protected String getHeader() {
        String result = String.format("Rental Record for %s\n", this.getName());
        result += "\tTitle\t\tDays\tAmount\n";
        return result;
    }

    protected String addFooter() {
        String result = "";
        result += String.format("Amount owed is %s\n", String.valueOf(totalAmount));
        result += String.format("You earned %s frequent renter points", String.valueOf(frequentRenterPoints));
        return result;
    }


}
    