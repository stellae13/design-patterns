package strategy2;

import java.util.Queue;

public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    public Store(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void update(Book book) {
        System.out.println("Update method");     
    }

    @Override
    public void display() {
        System.out.println("Display method");
    }
    
}
