package characters;

import items.Treasure;

import java.util.ArrayList;

public abstract class PlayableCharacter extends Character{

    private ArrayList<Treasure> pouch;

    public PlayableCharacter(String name, int health){
        super(name, health);
        this.pouch = new ArrayList<Treasure>();
    }
}
