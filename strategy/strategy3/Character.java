package strategy3;

import java.util.ArrayList;

public abstract class Character {
    protected ArrayList<String> sections;

    public Character() {
        sections = new ArrayList<String>();

    }

    public void draw() {
        for (int i = 0; i < sections.size(); i++) {
            System.out.print(sections.get(i));
            if(i%13 == 0)
                System.out.println();
        }
    }
}
