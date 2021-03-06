package strategy3;

/**
 * Mouth is a type of CharacterDecorator
 * that adds a mouth to the character
 * @author Stella Garcia
 */
public class Mouth extends CharacterDecorator{

     /**
     * Mouth constructor, calls the parent constructor and passes in
     * the character in which we are adding a mouth
     * @param character the character being changed
     */
    public Mouth(Character character) {
        super(character);
    }

    /**
     * customize method that is being overwritten 
     * from the abstract parent method
     * adds a mouth to the correct index in the sections ArrayList 
     */
    @Override
    public void customize() {
        super.sections.set(5, " \\ ---- /");
    }
    
}
