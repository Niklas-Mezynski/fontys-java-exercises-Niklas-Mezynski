package main;

public class Main {
    public static void main(String[] args) {
        GumBallMachine machine = new GumBallMachine(2);

        machine.insertCoin();
        machine.pullCrank();
        machine.insertCoin();
        machine.ejectCoin();
        machine.insertCoin();
        machine.pullCrank();
        machine.insertCoin();
        machine.pullCrank();
        machine.ejectCoin();
        machine.ejectCoin();


    }
}
