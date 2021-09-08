package strategy3;

public class Mouth extends CharacterDecorator{

    public Mouth(Character character) {
        super(character);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void customize() {
        super.sections.set(5, "\\  --- /");
    }
    
}
