package strategy7;

public class Easy implements State {

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
        System.out.println("You have beenn advanced to medium mode");
        game.setState(new Medium());

    }

    @Override
    public void levelDown() {
        System.out.println("You seem to be struggling you may want to study.");
    }
}
