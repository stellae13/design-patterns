package strategy3;

import java.util.ArrayList;
/**
 * Abstract class Character
 * Any child of character will have access to these
 * attributes and methods 
 * @author Stella Garcia
 */
public abstract class Character {
    protected ArrayList<String> sections; // each section of the character will be stored here

    /**
     * The Character constructor
     * initializes the sections ArrayList
     */
    public Character() {
        sections = new ArrayList<String>();
    }

    /**
     * The draw method
     * Loops through the ArrayList and prints out each section
     */
    public void draw() {
        for(String section: sections)
            System.out.println(section);
    }
}
