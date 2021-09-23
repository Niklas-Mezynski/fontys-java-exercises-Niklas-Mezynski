package main.Characters;

import main.Behaviors.WeaponBehavior;

public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public Character (WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

}
