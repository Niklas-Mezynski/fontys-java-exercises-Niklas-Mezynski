package main.Behaviors;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I'm cutting with my knife.");
    }
}
