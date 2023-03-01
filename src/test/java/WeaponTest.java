import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon axe;

    @Before
    public void before(){
        axe = new Weapon("Axe", 10 );
    }

    @Test
    public void canGetWeaponType(){
        assertEquals("Axe", axe.getWeaponType());
    }
}

