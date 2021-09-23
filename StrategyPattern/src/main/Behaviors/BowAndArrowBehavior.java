package main.Behaviors;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I'm shooting with my bow.");
    }
}
