package strategy7;

public interface State {

    public abstract int getNum();

    public abstract String getOperation();

    public abstract void levelUp();

    public abstract void levelDown();

}
