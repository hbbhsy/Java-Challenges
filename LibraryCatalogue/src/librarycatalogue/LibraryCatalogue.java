package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    Map<String, Book> bookCollection = new HashMap<>();
    int currentDay = 0;
    int lengthOfCheckedOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    // Constructor
    public LibraryCatalogue(Map<String, Book> collection) {
        this.bookCollection = collection;
    }

    public LibraryCatalogue(Map<String, Book> collection, int lengthOfCheckedPeriod,
                            double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckedOutPeriod = lengthOfCheckedPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    // Getters
    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public int getCurrentDay() {
        return this.currentDay;
    }

    public int getLengthOfCheckedOutPeriod() {
        return this.lengthOfCheckedOutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    // Setters

    public void setBookCollection(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    // Instance Methods:
    public void checkOut(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            alreadyCheckedOut(book);
        } else {
            book.setCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day "+
                    (getCurrentDay() + getLengthOfCheckedOutPeriod())+".");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckedOutPeriod());
        if (daysLate>0) {
            System.out.println("You owe $" + (getInitialLateFee() + daysLate*getFeePerLateDay())
                    + " because your book is "+ daysLate +" days overdue.");
        } else {
            System.out.println("Book returned. Thank you.");
        }
        book.setCheckedOut(false, -1);
    }

    public void alreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. "
                            + "It should be back on day "+(book.getDayCheckedOut() +
                            getLengthOfCheckedOutPeriod())+".");
    }

    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<>();
        Book harry = new Book("Harry Potter", 585, 8435);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOut("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOut("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOut("Harry Potter");

    }


}
