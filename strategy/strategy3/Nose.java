package strategy3;

public class Nose extends CharacterDecorator {

    public Nose(Character character) {
        super(character);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void customize() {
        super.sections.set(4, "|   >   |");
    }
    
}
