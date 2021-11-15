package strategy7;

import java.util.Scanner;

public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    Scanner input = new Scanner(System.in);

    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        score = 0;
    }

    public void pressQuestionButton() {
        int userAnswer;
        int correctAnswer;
        int num1 = state.getNum();
        String operation = state.getOperation();
        int num2 = state.getNum();
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

    public void setState(State state) {
        this.state = state;
    }

    public State getEasyState() {
        return this.easyState;
    }

    public State getMediumState() {
        return this.mediumState;
    }

    public State getHardState() {
        return this.hardState;
    }
}
