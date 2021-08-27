package strategy;

import java.util.ArrayList;

public class GuestList {
  private String title;
  private ArrayList<String> people;
  private SearchBehavior searchBehavior;
   
  public GuestList(String title){
    this.title = title;
    people = new ArrayList<String>();
    searchBehavior = new LinearSearch();
  }

  public boolean add(String person){
    if(searchBehavior.contains(people,person)) {
      return false;
    }
    else {
      people.add(person);
      return true;
    }
  }

  public boolean remove(String person){
    if(searchBehavior.contains(people,person)) {
      people.remove(person);
      return true;
    }
    else{
     return false; 
    }
  }

  public String getTitle(){
    return this.title;
  }

  public void setSearchBehavior(SearchBehavior searchBehavior) {
    this.searchBehavior = searchBehavior;
  }

  public ArrayList<String> getList() {
    return people;
  }
}
