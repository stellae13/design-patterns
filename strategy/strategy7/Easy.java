package strategy7;

/**
 * Easy state (a type of state for the game)
 * 
 * @author Stella Garcia
 */
public class Easy implements State {

    private ArithemeticGame game; // the game in which this is a state to

    /**
     * Easy constructor
     * 
     * @param game the ArithmeticGame being played
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * getNum method overidden from parent class
     * 
     * @return int a random number between 1 and 10
     */
    @Override
    public int getNum() {
        return (int) ((Math.random() * 10) + 1);
    }

    /**
     * getOpertaion method overridden from parent class
     * 
     * @return String the random opertion (either + or -)
     */
    @Override
    public String getOperation() {
        int choice = (int) (Math.random() * 2) + 1;
        if (choice == 1)
            return "+";
        else
            return "-";
    }

    /**
     * levelUp method overridden from parent class if the user is doing well, the
     * state for the current game is set to medium
     */
    @Override
    public void levelUp() {
        System.out.println("You have beenn advanced to medium mode");
        game.setState(game.getMediumState());

    }

    /**
     * levelDown method overridden from parent class if the user is doing bad, the
     * program outputs a message to them
     */
    @Override
    public void levelDown() {
        System.out.println("You seem to be struggling you may want to study.");
    }
}
