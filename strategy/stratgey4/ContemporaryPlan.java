package stratgey4;

public class ContemporaryPlan extends HousePlan{

    public ContemporaryPlan(int numRooms, int numWindows, int squareFeet) {
        super(numRooms, numWindows, squareFeet);
    }

    @Override
    protected void setMaterials() {
        System.out.println("Set materials contemporary");
        
    }

    @Override
    protected void setFeatures() {
        System.out.println("Set features contemporary");
        
    }

    @Override 
    public String toString() {
        return "Contemporary toString";
    }
    
}
