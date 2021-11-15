package strategy7;

/**
 * Interface State
 * 
 * @author Stella Garcia
 */
public interface State {

    /**
     * getNum method will be implemented by children method depending on
     * program/specfic state requirements
     * 
     * @return int the num decided by the specific state
     */
    public abstract int getNum();

    /**
     * getOpertaion method will be implemented by children method depending on
     * program/specfic state requirements
     * 
     * @return String the operation decided by the specific state
     */
    public abstract String getOperation();

    /**
     * levelUp method when we want to up the level (state) will be implemented by
     * children method depending on program/specfic state requirements
     */
    public abstract void levelUp();

    /**
     * levelDown when we want to go down a level (state) will be implemented by
     * children method depending on program/specfic state requirements
     */
    public abstract void levelDown();

}
