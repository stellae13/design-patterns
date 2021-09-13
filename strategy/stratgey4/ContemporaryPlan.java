package stratgey4;
/**
 * ContemporaryPlan is a type of HousePlan
 * @author Stella Garcia
 */
public class ContemporaryPlan extends HousePlan{

    /**
     * Constructor for ContemporaryPlan
     */
    public ContemporaryPlan() {
        super(5, 40, 3000); // set the three attributes of HousePlan according to assignment guidlines
        setMaterials(); // calls setMaterials of ContemporaryPlan
        setFeatures(); // calls setFeatrures of ContemporaryPlan
    }

    /**
     * setMaterials void method
     * adds to the super.materials ArrayList
     * the materials of a ContemporaryPlan
     * according to the assignment guidelines
     */
    @Override
    protected void setMaterials() {
        super.materials.add("Ceramics");
        super.materials.add("High-Strength Alloys");
        super.materials.add("Composites"); 
    }

    /**
     * setFeatures void method
     * adds to the super.feautres ArrayList
     * the features of a ContemporaryPlan
     * according to the assignment guidelines
     */
    @Override
    protected void setFeatures() {
        super.features.add("Oversized Windows");
        super.features.add("Unconventional Roofs");
        super.features.add("Minimalism");   
        super.features.add("Open Floor Plan");
    }
    /**
     * toString adds the type of HousePlan 
     * which is Contemporary Home to the 
     * super.toString
     * @return a String which is the type + the super.toString
     */
    @Override
    public String toString() {
        return "Contemporary Home \n" + super.toString();
    }
    
}
