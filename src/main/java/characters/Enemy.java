package characters;

import items.Weapon;

public class Enemy extends Character {

    private Weapon weapon;

    public Enemy(String name, int health, Weapon weapon){
        super(name, health);
        this.weapon = weapon;
    }


    public String getWeaponType() {
        return weapon.getWeaponType();
    }
}
