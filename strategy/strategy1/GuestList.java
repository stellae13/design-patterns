package strategy1;

import java.util.ArrayList;
/**
 * The Guest list for an event
 * @author Stella Garcia 
 */
public class GuestList {
  private String title;
  private ArrayList<String> people;
  private SearchBehavior searchBehavior;

  /**
   * The constructor for the Guest list, it initiats all of the attributes of the class
   * @param title This parameter it the title of the event
   */
  public GuestList(String title){
    this.title = title;
    people = new ArrayList<String>();
    searchBehavior = new LinearSearch();
  }

  /**
   * This method adds a new name to the list (as long as that person is not already on the list)
   * @param person the name of the person who is being (possibly) added to the list
   * @return boolean that is true when the person is successfully added to the list and false otherwise
   */
  public boolean add(String person){
    if(searchBehavior.contains(people,person)) {
      return false;
    }
    else {
      people.add(person);
      return true;
    }
  }
  /**
   * This method removes a person from this list (given that they actually are already on the list)
   * @param person The person to be removed from the list
   * @return boolean that is true when the person is successfuly removed and false otherwise 
   */
  public boolean remove(String person){
    if(searchBehavior.contains(people,person)) {
      people.remove(person);
      return true;
    }
    else{
     return false; 
    }
  }
  /**
   * A get method for the String title of the GuestList
   * @return String the title of the list 
   */
  public String getTitle(){
    return this.title;
  }
  /**
   * A set method for the searchBehavior attribute of the GuestList
   * @param searchBehavior a type of searchBehavior (linear, binary...)
   */
  public void setSearchBehavior(SearchBehavior searchBehavior) {
    this.searchBehavior = searchBehavior;
  }
  /**
   * A get method for the ArrayList<String> people of the GuestList
   * @return ArrayList<String> people, it returns the GuestList array
   */
  public ArrayList<String> getList() {
    return people;
  }
}
