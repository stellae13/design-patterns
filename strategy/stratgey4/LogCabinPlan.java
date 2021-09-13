package stratgey4;

public class LogCabinPlan extends HousePlan {

    public LogCabinPlan(int numRooms, int numWindows, int squareFeet) {
        super(numRooms, numWindows, squareFeet);
    }

    @Override
    protected void setMaterials() {
        System.out.println("Set materials log cabin");
        
    }

    @Override
    protected void setFeatures() {
       System.out.println("Set features log cabin");
        
    }

    @Override 
    public String toString() {
        return "toString of log cabin";
    }
    
}
