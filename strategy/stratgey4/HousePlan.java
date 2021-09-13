package stratgey4;

import java.util.ArrayList;;
/**
 * HousePlan is an abstract class that
 * will be extended by the different types of 
 * HousePlans
 * @author Stella Garcia 
 */
public abstract class HousePlan {
        protected ArrayList<String> materials; // ArrayList of materials (String)
        protected ArrayList<String> features; // ArrayList of feautres (String)
        private int numRooms; // number of rooms in HousePlan
        private int numWindows; // number of windows in HousePlan
        private int squareFeet; // number of square feet in HousePlan
    
        /**
         * Constructor for HousePlan 
         * @param numRooms the number of rooms in the HousePlan
         * @param numWindows the number of windows in the HousePlan
         * @param squareFeet the number of square feet in the HousePlan
         */
        public HousePlan(int numRooms, int numWindows, int squareFeet) {
            this.numRooms = numRooms;
            this.numWindows = numWindows;
            this.squareFeet = squareFeet;
            materials = new ArrayList<String>(); // initializes the materials ArrayList
            features = new ArrayList<String>(); // initializes the features ArrayList
        }
    
        /**
         * setMaterials abstract void method  
         * to be implemented by children
         */
        protected abstract void setMaterials();
    
        /**
         * setFeatures abstract void method
         * to be implemented bby children
         */
        protected abstract  void setFeatures();
    
        /**
         * get method for materials ArrayList attribute 
         * @return ArrayList<String> the materials for the HousePlan
         */
        public ArrayList<String> getMaterials() {
            return materials;
        }
    
        /**
         * get method for featrues ArrayList attribute
         * @return ArrayList<String? the features for the HousePlan
         */
        public ArrayList<String> getFeatures() {
            return features;
        }
    
        /**
         * get method for numRooms attribute 
         * @return int of numRooms  in HousePlan 
         */
        public int getNumRooms() {
            return numRooms;
        }
    
        /**
         * get method for numWindows attribute 
         * @return int of numWindowns in HousePlan
         */
        public int getNumWindows() {
            return numWindows;
        }
    
        /**
         * get method for squareFeet attribute
         * @return int of squareFeet in HousePlan
         */
        public int getSquareFeet() {
            return squareFeet;
        }
    
        /**
         * toString method for HousepPlan
         * @return String of the HousePlan
         * according to the assignment guidelines
         */
        public String toString() {
            String output = "Square feet: " + squareFeet + "\n" +
                            "Room: " + numRooms + "\n" + 
                            "Windows: " + numWindows + "\n\nMaterials:";

            for(String material: materials)
                output += "\n" + "-" + material; // adds all materials to output
             
            output += "\n\n" + "Features: ";

            for(String feature: features)
                output+= "\n-" + feature ; // add all feautures to output
            
            return output + "\n";
        }
}
