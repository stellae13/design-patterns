package strategy7;

/**
 * Hard state (a type of state for the game)
 * 
 * @author Stella Garcia
 */
public class Hard implements State {

    private ArithemeticGame game; // the game in which this is a state too

    /**
     * Hard constructor
     * 
     * @param game the ArithmeticGame being played
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * getNum method overidden from parent class
     * 
     * @return int a random number between 1 and 100
     */
    @Override
    public int getNum() {
        return (int) ((Math.random() * 100) + 1);
    }

    /**
     * getOpertaion method overridden from parent class
     * 
     * @return String the random opertion (either + , - , * , or /)
     */
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

    /**
     * levelUp method overridden from parent class if the user is doing well, the
     * program outputs a message to them
     */
    @Override
    public void levelUp() {
        System.out.println("You are doing so well!!!");

    }

    /**
     * levelDown method overridden from parent class if the user is doing bad, the
     * state for the current game is set to medium
     */
    @Override
    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You seem to be struggling, let's go to medium mode");
    }
}
