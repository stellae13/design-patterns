package strategy4;
/**
 * ContemporaryPlan is a type of HousePlan
 * @author Stella Garcia
 */
public class TinyHomePlan extends HousePlan {

    public TinyHomePlan() {
        super(1, 5, 200); // set the three attributes of HousePlan according to assignment guidlines
        setMaterials(); // calls setMaterials of TinyHomePlan
        setFeatures(); // calls setFeatures of TinyHomePlan 
    }

    /**
     * setMaterials void method
     * adds to the super.materials ArrayList
     * the materials of a TinyHomePlan
     * according to the assignment guidelines
     */
    @Override
    protected void setMaterials() {
        super.materials.add("Lumber");
        super.materials.add("Insulation");
        super.materials.add("Metal Roofing");
        super.materials.add("Hardware");  
    }
    /**
     * setMaterials void method
     * adds to the super.materials ArrayList
     * the materials of a TinyHomePlan
     * according to the assignment guidelines
     */
    @Override
    protected void setFeatures() {
        super.features.add("Natural Light");
        super.features.add("Creative Storage");
        super.features.add("Multipurpoe areas");   
        super.features.add("Multi-use applications");
    }
    
    /**
     * toString adds the type of HousePlan 
     * which is TinyHome (Tiny House) to the 
     * super.toString
     * @return a String which is the type + the super.toString
     */
    @Override
    public String toString() {
        return "Tiny House \n" + super.toString();
    }
}
