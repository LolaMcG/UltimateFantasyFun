import characters.Enemy;
import characters.Warrior;
import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WarriorTest {
    
    Warrior warrior;
    Weapon axe;
    Weapon club;
    Weapon bowAndArrow;
    Weapon sword;

    Armour bronze;
    Armour leather;
    Armour chainmail;
    Armour iron;

    Enemy orc;
    
    @Before
    public void before(){
        axe = new Weapon("Axe", 10 );
        club = new Weapon("Club", 5);
        bowAndArrow = new Weapon("Bow and Arrow", 30);
        sword = new Weapon("Sword", 50);
        bronze = new Armour("Bronze", 30);
        leather = new Armour("Leather", 10);
        iron = new Armour("Iron", 20);
        chainmail = new Armour("Chainmail", 40);
        warrior = new Warrior( "Knight", 1000);
        orc = new Enemy("Orc", 500, club);
    }

    @Test
    public void can_add_weapon(){
        warrior.addWeapon(axe);
        assertEquals(1, warrior.getNumberOfWeapons());
    }

    @Test
    public void can_only_add_three_weapons(){
        warrior.addWeapon(axe);
        warrior.addWeapon(club);
        warrior.addWeapon(sword);
        warrior.addWeapon(bowAndArrow);
        assertEquals(3, warrior.getNumberOfWeapons());
    }

    @Test
    public void can_add_armours(){
        warrior.addArmour(bronze);
        assertEquals(1, warrior.getNumberOfArmour());
    }

    @Test
    public void can_only_add_three_armour(){
        warrior.addArmour(bronze);
        warrior.addArmour(leather);
        warrior.addArmour(iron);
        warrior.addArmour(chainmail);
        assertEquals(3, warrior.getNumberOfArmour());
    }

    @Test
    public void can_select_weapon(){
        warrior.addWeapon(club);
        warrior.addWeapon(axe);
        warrior.selectWeapon(axe);
        assertEquals("Axe", warrior.getSelectedWeapon());
    }

    @Test
    public void can_receive_damage(){
        warrior.receiveDamage(axe);
        assertEquals(990, warrior.getHealth());
    }

    @Test
    public void can_attack(){
        warrior.addWeapon(sword);
        warrior.selectWeapon(sword);
        warrior.attack(orc);
        assertEquals(450, orc.getHealth());
    }





}
