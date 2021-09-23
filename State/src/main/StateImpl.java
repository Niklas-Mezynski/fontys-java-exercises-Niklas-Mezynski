package main;

enum StateImpl implements State  {

    NoQuater {
        public void insertCoin(GumBallMachine machine) {
            System.out.println("Thanks for the coin :)");
            machine.setState(HasQuater);
            machine.setHasCoin(true);
        }
    },

    HasQuater {

        @Override
        public void ejectCoin(GumBallMachine machine) {
            System.out.println("Ok hers you got your coin back");
            machine.setState(NoQuater);
            machine.setHasCoin(false);
        }

        @Override
        public void pullCrank(GumBallMachine machine) {
            System.out.println("Here we go :D");
            machine.setState(GumballSold);
        }
    },

    GumballSold {
        @Override
        public void dispense(GumBallMachine machine) {
            if (machine.hasBall()) {
                System.out.println("Here you have your gumball");
                machine.setState(NoQuater);
                machine.setHasCoin(false);
            } else {
                System.out.println("Ohoh no more balls in the machine");
                machine.setState(OutOfGumballs);
            }
        }
    },

    OutOfGumballs {
        @Override
        public void ejectCoin(GumBallMachine machine) {
            if (machine.hasCoin) {
                System.out.println("Here at least you have your coin back");
            }
            machine.setHasCoin(false);
        }
    }

}
