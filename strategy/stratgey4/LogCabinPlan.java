package stratgey4;
/**
 * LogCabinPlan is a type of HousePlan
 * @author Stella Garcia
 */
public class LogCabinPlan extends HousePlan {

    /**
     * Constructor for LogCabinPlan
     */
    public LogCabinPlan() {
        super(2, 10, 1800); // set the three attributes of HousePlan according to assignment guidlines
        setMaterials(); // calls setMaterials of LogCabinPlan
        setFeatures(); // calls setFeatures of LogCabinPlan
    }

    /**
     * setMaterials void method
     * adds to the super.materials ArrayList
     * the materials of a LogCabinPlan
     * according to the assignment guidelines
     */
    @Override
    protected void setMaterials() {
        super.materials.add("Log Sliding");
        super.materials.add("Board and Batten Sliding");
        super.materials.add("White Pine");        
    }
    /**
     * setMaterials void method
     * adds to the super.materials ArrayList
     * the materials of a LogCanbinPlan
     * according to the assignment guidelines
     */
    @Override
    protected void setFeatures() {
       super.features.add("Timbered Roof");
       super.features.add("High Insulation");
       super.features.add("Rustic effect");
    }

    /**
     * toString adds the type of HousePlan 
     * which is LogCabin to the 
     * super.toString
     * @return a String which is the type + the super.toString
     */
    @Override 
    public String toString() {
        return "Log Cabin \n" + super.toString();
    }
    
}
