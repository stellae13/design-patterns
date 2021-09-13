package stratgey4;

import java.util.ArrayList;;

public abstract class HousePlan {
        protected ArrayList<String> materials;
        protected ArrayList<String> features;
        private int numRooms;
        private int numWindows;
        private int squareFeet;
    
        public HousePlan(int numRooms, int numWindows, int squareFeet) {
            this.numRooms = numRooms;
            this.numWindows = numWindows;
            this.squareFeet = squareFeet;
            materials = new ArrayList<String>();
            features = new ArrayList<String>();
        }
    
        protected abstract void setMaterials();
    
        protected abstract  void setFeatures();
    
        public ArrayList<String> getMaterials() {
            return materials;
        }
    
        public ArrayList<String> getFeatures() {
            return features;
        }
    
        public int getNumRooms() {
            return numRooms;
        }
    
        public int getNumWindows() {
            return numWindows;
        }
    
        public int getSquareFeet() {
            return squareFeet;
        }
    
        public String toString() {
            String output = "Square feet: " + squareFeet + "\n" +
                            "Room: " + numRooms + "\n" + 
                            "Windows: " + numWindows + "\n\nMaterials:";

            for(String material: materials)
                output += "\n" + "-" + material;
             
            output += "\n\n" + "Features: ";

            for(String feature: features)
                output+= "\n-" + feature ;
            
            return output + "\n";
        }
}
