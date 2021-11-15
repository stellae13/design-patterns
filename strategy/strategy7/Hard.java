package strategy7;

public class Hard implements State {
    private ArithemeticGame game;

    @Override
    public int getNum() {
        return (int) ((Math.random() * 100) + 1);
    }

    @Override
    public String getOperation() {
        int choice = (int) (Math.random() * 4) + 1;
        if (choice == 1)
            return "+";
        else if (choice == 2)
            return "-";
        else if (choice == 3)
            return "*";
        else
            return "/";
    }

    @Override
    public void levelUp() {
        System.out.println("You are doing so well!!!");

    }

    @Override
    public void levelDown() {
        game.setState(new Medium());
        System.out.println("You seem to be struggling, let's go to medium mode");
    }
}
