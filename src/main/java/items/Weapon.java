package items;

import Interfaces.IDamage;

public class Weapon implements IDamage {

    private String type;
    private int damagePoints;

    public Weapon(String type, int damagePoints){
        this.type = type;
        this.damagePoints = damagePoints;
    }

    public void causeDamage(){

    }

    public String getWeaponType() {
        return this.type;
    }
}
