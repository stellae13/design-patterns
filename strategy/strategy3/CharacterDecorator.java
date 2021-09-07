package strategy3;

public abstract class CharacterDecorator {

    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    public abstract void customize();
    
}