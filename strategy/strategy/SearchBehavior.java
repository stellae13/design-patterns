package strategy;

import java.util.ArrayList;

public interface SearchBehavior {
    public abstract boolean contains(ArrayList<String> data, String item);
}
