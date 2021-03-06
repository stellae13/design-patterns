package strategy3;

/**
 * PotatoeHead is a type of Character
 * it starts as a blank head shape
 */
public class PotatoeHead extends Character{
    
    /**
     * The PotatoeHead constructor creates
     * an base for a potatoe head
     * It is a basic head outilne
     */
    public PotatoeHead() {
        super(); // calls the super constructor, which initializes the sections ArrayList
        super.sections.add("   ____   ");
        super.sections.add("  /    \\ ");
        super.sections.add(" /      \\");
        super.sections.add("|        |");
        super.sections.add("|        |");
        super.sections.add(" \\      /");
        super.sections.add("  \\____/ "); // these last 7 lines add the default head to the sections ArrayList
    }
}
