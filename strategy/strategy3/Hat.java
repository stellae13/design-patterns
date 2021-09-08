package strategy3;

/**
 * Hat is a type of CharacterDecorator
 * that adds a hat to the character
 * @author Stella Garcia
 */
public class Hat extends CharacterDecorator {

     /**
     * Hat constructor, calls the parent constructor and passes in
     * the character in which we are adding a hat to
     * @param character the character being changed
     */
    public Hat(Character character) {
        super(character);
    }

    /**
     * customize method that is being overwritten 
     * from the abstract parent method
     * adds a hat to the correct indeces in the sections ArrayList 
     */
    @Override
    public void customize() {
        super.sections.set(0,"   ____   ");
        super.sections.set(1,"__|____|__");
    }
    
}
