package strategy2;

import java.util.ArrayList;

public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    public BestSellers() {
        this.observers = new ArrayList<Observer>();
        this.bestSellers = new ArrayList<Book>();
    }
    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Register observer method");
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Remove observer method"); 
    }

    @Override
    public void notifyObserver(Observer obeserver) {
        System.out.println("notify observer method");
    }

    public void addBook(Book book) {
        System.out.println("Add Book method");
    }
    
}
