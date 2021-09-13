package stratgey4;

public class HousePlanFactory  {
    public static HousePlan createHousePlan(String type) {
        if(type.equalsIgnoreCase("log cabin"))
            return new LogCabinPlan();
        else if (type.equalsIgnoreCase("tiny home"))
            return new TinyHomePlan();
        else if (type.equalsIgnoreCase("contemporary home"))
            return new ContemporaryPlan();
        else
            return null;
    }
}
