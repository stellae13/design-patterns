package strategy2;

import java.util.ArrayList;

public class Customer implements Observer {
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.subject.registerObserver(this);
        this.firstName = firstName;
        this.lastName = lastName;
        wishList = new ArrayList<Book>();

    }
    @Override
    public void update(Book book) {
        this.wishList.add(book);     
    }

    @Override
    public void display() {
        System.out.println("Wish List: ");
        for(Book book: wishList)
            System.out.println("- " + book.toString());
        System.out.println();
    }
    
}
