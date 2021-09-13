package stratgey4;

public class LogCabinPlan extends HousePlan {

    public LogCabinPlan() {
        super(2, 10, 1800);
        setMaterials();
        setFeatures();
    }

    @Override
    protected void setMaterials() {
        super.materials.add("Log Sliding");
        super.materials.add("Board and Batten Sliding");
        super.materials.add("White Pine");        
    }

    @Override
    protected void setFeatures() {
       super.features.add("Timbered Roof");
       super.features.add("High Insulation");
       super.features.add("Rustic effect");
    }

    @Override 
    public String toString() {
        return "Log Cabin \n" + super.toString();
    }
    
}
