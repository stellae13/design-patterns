package strategy3;

public class Hat extends CharacterDecorator {

    public Hat(Character character) {
        super(character);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void customize() {
        super.sections.set(0,"   ____   ");
        super.sections.set(1,"__|____|__");
    }
    
}
