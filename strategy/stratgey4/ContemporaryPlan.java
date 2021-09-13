package stratgey4;

public class ContemporaryPlan extends HousePlan{

    public ContemporaryPlan() {
        super(5, 40, 300);
        setMaterials();
        setFeatures();
    }

    @Override
    protected void setMaterials() {
        super.materials.add("Ceramics");
        super.materials.add("High-Strength Alloys");
        super.materials.add("Composites"); 
    }

    @Override
    protected void setFeatures() {
        super.features.add("Oversized Windows");
        super.features.add("Unconventional Roofs");
        super.features.add("Minimalism");   
        super.features.add("Open Floor Plan");
    }
    
    @Override
    public String toString() {
        return "Contemporary Home \n" + super.toString();
    }
    
}
