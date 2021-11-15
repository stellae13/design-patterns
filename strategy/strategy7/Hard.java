package strategy7;

public class Hard implements State {
    private ArithemeticGame game;

    @Override
    public int getNum() {
        return (int) ((Math.random() * 10) + 1);
    }

    @Override
    public String getOperation() {
        int choice = (int) (Math.random() * 2) + 1;
        if (choice == 1)
            return "+";
        else
            return "-";
    }

    @Override
    public void levelUp() {
        game.setState(new Medium());

    }

    @Override
    public void levelDown() {
        System.out.println("You seem to be strugglingn you may want to study.");
    }
}
