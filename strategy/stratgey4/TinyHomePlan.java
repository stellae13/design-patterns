package stratgey4;

public class TinyHomePlan extends HousePlan {

    public TinyHomePlan(int numRooms, int numWindows, int squareFeet) {
        super(numRooms, numWindows, squareFeet);
    }

    @Override
    protected void setMaterials() {
        System.out.println("Set materials tiny home");
        
    }

    @Override
    protected void setFeatures() {
        System.out.println("Set features tiny home");
        
    }
    
    @Override
    public String toString() {
        return "Tiny home toString";
    }
}
