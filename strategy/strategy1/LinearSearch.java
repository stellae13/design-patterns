package strategy1;
import java.util.ArrayList;

public class LinearSearch implements SearchBehavior {

    @Override
    public boolean contains(ArrayList<String> data, String item) {
        boolean found = false;
        for(String index : data){
            if (item.toLowerCase().equals(index.toLowerCase())){
                found = true;
                break;
            }
        }
        return found;
    }
    
}
