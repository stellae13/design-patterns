package strategy7;

public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    public ArithemeticGame() {

    }

    public void pressQuestionButton() {

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
