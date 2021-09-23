package main;

public interface State {

    default void insertCoin(GumBallMachine machine){};

    default void ejectCoin(GumBallMachine machine){};

    default void pullCrank(GumBallMachine machine){};

    default void dispense(GumBallMachine machine){};
}
