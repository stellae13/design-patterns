package strategy3;

/**
 * Nose is a type of CharacterDecorator
 * that adds a nose to the character
 * @author Stella Garcia
 */
public class Nose extends CharacterDecorator {

     /**
     * Mose constructor, calls the parent constructor and passes in
     * the character in which we are adding a nose to 
     * @param character the character being changed
     */
    public Nose(Character character) {
        super(character);
    }

    /**
     * customize method that is being overwritten 
     * from the abstract parent method
     * adds a nose to the correct index in the sections ArrayList 
     */
    @Override
    public void customize() {
        super.sections.set(4, "|   >   |");
    }
    
}
