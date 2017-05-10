
import java.lang.*;
import java.util.*;

class Customer {
    private String name;

    private Vector<Rental> rentals = new Vector<Rental>();
    private double totalAmount;
    private int frequentRenterPoints;

    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {
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

    private String getHeader() {
        String result = String.format("Rental Record for %s\n", this.getName());
        result += "\tTitle\t\tDays\tAmount\n";
        return result;
    }

    private String addFooter() {
        String result = "";
        result += String.format("Amount owed is %s\n", String.valueOf(totalAmount));
        result += String.format("You earned %s frequent renter points", String.valueOf(frequentRenterPoints));
        return result;
    }


}
    