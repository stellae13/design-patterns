package strategy3;

/**
 * Eyes is a type of CharacterDecorator that adds 
 * eyes to the character
 * @author Stella Garcia
 */
public class Eyes extends CharacterDecorator{
 
    /**
     * Eyes constructor, calls the parent constructor and passes in
     * the character in which we are adding eyes to
     * @param character the character being changed
     */
    public Eyes(Character character) {
        super(character);
    }

    /**
     * customize method that is being overwritten 
     * from the abstract parent method
     * adds eyes to the correct index in the sections ArrayList 
     */
    @Override
    public void customize() {
        super.sections.set(3, "|  o o  |");
    }
    
}
