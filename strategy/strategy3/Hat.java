package strategy3;

public class Hat extends CharacterDecorator {

    public Hat(Character character) {
        super(character);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void customize() {
        super.sections.set(4,"_");
        super.sections.set(5,"_");
        super.sections.set(6,"_");
        super.sections.set(13,"|");
        super.sections.set(16,"|");
        super.sections.set(21,"_");
        super.sections.set(26,"_");
    
    }
    
}
