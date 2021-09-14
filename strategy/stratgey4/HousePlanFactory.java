package stratgey4;
/**
 * HousePlanFactory
 * facilitates the creation of 
 * the three different types of
 * HousePlans
 * @author Stella Garcia
 */
public class HousePlanFactory  {
    /**
     * static (class method) createHousePlan method
     * @param type type of HousePlan to be created
     * @return new HousePlan that was just created 
     */
    public static HousePlan createHousePlan(String type) {
        if(type.equalsIgnoreCase("log cabin"))
            return new LogCabinPlan();
        else if (type.equalsIgnoreCase("tiny home") || type.equalsIgnoreCase("tiny house")) // it is called tiny home sometimes
            return new TinyHomePlan();                                                      // and tiny house other times
        else if (type.equalsIgnoreCase("contemporary home"))
            return new ContemporaryPlan();
        else
            return null; // if it gets here, the house plan that the user wants has
                         // not been created yet
    }
}
