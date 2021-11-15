package strategy7;

public class Medium implements State {
    private ArithemeticGame game;

    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    @Override
    public int getNum() {
        return (int) ((Math.random() * 50) + 1);
    }

    @Override
    public String getOperation() {
        int choice = (int) (Math.random() * 3) + 1;
        if (choice == 1)
            return "+";
        else if (choice == 2)
            return "-";
        else
            return "*";
    }

    @Override
    public void levelUp() {
        System.out.println("You have been advanced to the hardest mode");
        game.setState(game.getHardState());
    }

    @Override
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode");
        game.setState(game.getMediumState());
    }
}
