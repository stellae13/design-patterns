package strategy3;

import java.util.ArrayList;
/**
 * Abstract class Character
 * Any child of character will have access to these
 * attributes and methods 
 */
public abstract class Character {
    protected ArrayList<String> sections; // each section of the character will be stored here

    /**
     * The Character constructor
     * initializes the sections array list 
     */
    public Character() {
        sections = new ArrayList<String>();

    }

    public void draw() {
        for (int i = 0; i < sections.size(); i++)
            System.out.println(sections.get(i));
    }
}
