package main.Behaviors;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I'm killing with my axe.");
    }
}
