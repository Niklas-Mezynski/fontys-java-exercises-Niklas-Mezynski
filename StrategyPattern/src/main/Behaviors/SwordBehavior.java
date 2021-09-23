package main.Behaviors;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I'm swinging my blade.");
    }
}

