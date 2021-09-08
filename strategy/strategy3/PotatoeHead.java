package strategy3;


public class PotatoeHead extends Character{
    
    public PotatoeHead() {
        super();
        for(int i = 0; i < 81; i++)
            super.sections.add("");
        super.sections.set(22, "_");
        super.sections.set(23, "_");
        super.sections.set(24, "_");
        super.sections.set(24, "_");
        super.sections.set(30, "/");
        super.sections.set(35, "\\");
        super.sections.set(38, "|");
        super.sections.set(45, "|");
        super.sections.set(47, "|");
        super.sections.set(54, "|");
        super.sections.set(56, "\\");
        super.sections.set(63, "/");
        super.sections.set(66, "\\");
        super.sections.set(71, "/");
        super.sections.set(76, "_");
        super.sections.set(77, "_");
        super.sections.set(78, "_");
    }
}
