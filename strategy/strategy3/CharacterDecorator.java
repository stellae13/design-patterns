package strategy3;

import java.util.ArrayList;

public abstract class CharacterDecorator extends Character{

    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
        this.sections = new ArrayList<String>();
        
        for(int i = 0; i < super.sections.size(); i++) {
            this.sections.set(i, super.sections.get(i));
        }

        this.customize();
    }

    public abstract void customize();
    
}