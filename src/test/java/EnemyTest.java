import characters.Enemy;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy orc;
    Weapon club;

    @Before
    public void before(){
        club = new Weapon("Club", 5);
        orc = new Enemy("Orc", 500, club);
    }

    @Test
    public void hasWeapon(){
        assertEquals("Club", orc.getWeaponType());
    }

    @Test
    public void can_receive_damage(){
        orc.receiveDamage(club);
        assertEquals(495, orc.getHealth());
    }



}
