package strategy2;

import java.util.ArrayList;

public class Customer implements Observer {
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        wishList = new ArrayList<Book>();

    }
    @Override
    public void update(Book book) {
        System.out.println("updater method");     
    }

    @Override
    public void display() {
        System.out.println("display method");
    }
    
}
