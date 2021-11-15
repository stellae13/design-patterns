package strategy7;

/**
 * Medium state (a type of state for the game)
 * 
 * @author Stella Garcia
 */
public class Medium implements State {

    private ArithemeticGame game; // the game in which this is a state to

    /**
     * Medium constructor
     * 
     * @param game the ArithmeticGame being played
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * getNum method overidden from parent class
     * 
     * @return int a random number between 1 and 50
     */
    @Override
    public int getNum() {
        return (int) ((Math.random() * 50) + 1);
    }

    /**
     * getOpertaion method overridden from parent class
     * 
     * @return String the random opertion (either + , - , or *)
     */
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

    /**
     * levelUp method overridden from parent class if the user is doing well, the
     * state for the current game is set to hard
     */
    @Override
    public void levelUp() {
        System.out.println("You have been advanced to the hardest mode");
        game.setState(game.getHardState());
    }

    /**
     * levelUp method overridden from parent class if the user is doing bad, the
     * state for the current game is set to easy
     */
    @Override
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode");
        game.setState(game.getMediumState());
    }
}
