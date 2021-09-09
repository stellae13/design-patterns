package strategy3;

import java.util.ArrayList;
/**
 * CharacterDecorator class
 * Extends character
 * This will be be the individualized characters after
 * certain sections are changed in order to decorate them
 * @author Stella Garcia
 */
public abstract class CharacterDecorator extends Character{

    protected Character character; //the character that we are decorating
    
    /**
     * CharacterDecorator constructor
     * @param character the character we are decorating 
     * It initializes its own sections ArrayList by
     * copying the super's ArrayList
     */
    public CharacterDecorator(Character character) {
        this.character = character;
        this.sections = new ArrayList<String>();

        for(String section: character.sections)
            this.sections.add(section);
        
        this.customize(); // call the customize method
    }

    /**
     * The customize method is how each specific characterDecorator 
     * will change the base character
     * Implemened in children classes
     */
    public abstract void customize();
    
}