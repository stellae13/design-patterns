package strategy3;

public class Eyes extends CharacterDecorator{

    public Eyes(Character character) {
        super(character);
    }

    @Override
    public void customize() {
        super.sections.set(3, "|  o o  |");
    }
    
}
