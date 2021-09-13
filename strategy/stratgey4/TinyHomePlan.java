package stratgey4;

public class TinyHomePlan extends HousePlan {

    public TinyHomePlan() {
        super(1, 5, 200);
        setMaterials();
        setFeatures();
    }

    @Override
    protected void setMaterials() {
        super.materials.add("Lumber");
        super.materials.add("Insulation");
        super.materials.add("Metal Roofing");
        super.materials.add("Hardware");  
    }

    @Override
    protected void setFeatures() {
        super.features.add("Natural Light");
        super.features.add("Creative Storage");
        super.features.add("Multipurpoe areas");   
        super.features.add("Multi-use applications");
    }
    
    @Override
    public String toString() {
        return "Tiny House \n" + super.toString();
    }
}
