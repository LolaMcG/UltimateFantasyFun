package characters;

import Interfaces.IDamage;
import Interfaces.IDamageable;
import items.Armour;
import items.Weapon;

import java.util.ArrayList;

public class Warrior extends PlayableCharacter implements IDamageable {

    private ArrayList<Weapon> weaponsCollection;
    private Weapon selectedWeapon;
    private Armour selectedArmour;
    private ArrayList<Armour> armourCollection;

    public Warrior(String name, int health){
        super(name, health);
        this.weaponsCollection = new ArrayList<>();
        this.armourCollection = new ArrayList<>();
        this.selectedArmour = null;
        this.selectedWeapon = null;
    }


    public void addWeapon(Weapon weapon) {
        if(getNumberOfWeapons() < 3){
        weaponsCollection.add(weapon);}
    }

    public int getNumberOfWeapons() {
        return this.weaponsCollection.size();
    }

    public void addArmour(Armour armour) {
        if(getNumberOfArmour() < 3){
            armourCollection.add(armour);}
    }

    public int getNumberOfArmour() {
        return this.armourCollection.size();
    }

    public void selectWeapon(Weapon chosenWeapon) {
//        if the weapon you've chosen is a weapon, set this weapon as your selected weapon
        for(Weapon weapon : this.weaponsCollection){
            if(weapon.equals(chosenWeapon)){
                this.selectedWeapon = weapon;
            }
        }
    }

    public String getSelectedWeapon() {
        return selectedWeapon.getWeaponType();
    }





}
