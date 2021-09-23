package main;

public class GumBallMachine {

    private State state;
    private int ballCount;
    boolean hasCoin;

    public GumBallMachine(int ballCount) {
        this.ballCount = ballCount;
        this.hasCoin = false;
        if (ballCount > 0) {
            state = StateImpl.NoQuater;
        } else {
            state = StateImpl.OutOfGumballs;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean hasBall() {
        return ballCount > 0;
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void ejectCoin() {
        state.ejectCoin(this);
    }

    public void pullCrank() {
        state.pullCrank(this);
        state.dispense(this);
        ballCount--;
    }

    public boolean hasCoin() {
        return hasCoin;
    }

    public void setHasCoin(boolean hasCoin) {
        this.hasCoin = hasCoin;
    }
}
