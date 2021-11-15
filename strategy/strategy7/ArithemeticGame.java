package strategy7;

import java.util.Scanner;

/**
 * Arithemetic Game class stores what state we are on and how to run the game
 * 
 * @author Stella Garcia
 */
public class ArithemeticGame {
    // three different types of states for the game
    private State easyState;
    private State mediumState;
    private State hardState;
    // the current state
    private State state;
    // score and Scanner
    private int score;
    private Scanner input;

    /**
     * ArithemeticGame constructor Initializes all of the variables and starts the
     * game on easy mode
     */
    public ArithemeticGame() {
        this.easyState = new Easy(this);
        this.mediumState = new Medium(this);
        this.hardState = new Hard(this);
        this.state = this.easyState;
        this.score = 0;
        this.input = new Scanner(System.in);
    }

    /**
     * Runs the actual game handles user input and calculating the correct answer
     * also keeps track of the score and if the user needs to level up / level down
     */
    public void pressQuestionButton() {
        int userAnswer;
        int correctAnswer;
        int num1 = state.getNum();
        int num2 = state.getNum();

        String operation = state.getOperation();
        System.out.println(num1 + " " + operation + " " + num2 + ":");
        userAnswer = Integer.parseInt(input.nextLine());

        if (operation.equals("+"))
            correctAnswer = num1 + num2;
        else if (operation.equals("-"))
            correctAnswer = num1 - num2;
        else if (operation.equals("*"))
            correctAnswer = num1 * num2;
        else
            correctAnswer = num1 / num2;

        if (correctAnswer == userAnswer) {
            System.out.println("Correct");
            score++;
            if (score >= 3) {
                score = 0;
                state.levelUp();
            }
        } else {
            System.out.println("Incorrect");
            score--;
            if (score <= -3) {
                score = 0;
                state.levelDown();
            }
        }

    }

    /**
     * Set method for state variable
     * 
     * @param state the state we want to set this.state to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Get method for easyState
     * 
     * @return State the easyState for this game
     */
    public State getEasyState() {
        return this.easyState;
    }

    /**
     * Get method for mediumState
     * 
     * @return State the mediumState for this game
     */
    public State getMediumState() {
        return this.mediumState;
    }

    /**
     * Get method for hardState
     * 
     * @return State the hardState for this game
     */
    public State getHardState() {
        return this.hardState;
    }
}
