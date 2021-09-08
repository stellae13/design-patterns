package strategy3;

public class Eyes extends CharacterDecorator{

    public Eyes(Character character) {
        super(character);
    }

    @Override
    public void customize() {
        super.sections.set(38,"O");
        super.sections.set(41,"O");
    }
    
}
