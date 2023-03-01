package items;

import Interfaces.IDefend;

public class Armour implements IDefend {

    private int protectionPoints;
    String type;

    public Armour(String type, int protectionPoints){
        this.type = type;
        this.protectionPoints = protectionPoints;
    }

    public void reduceDamage(){

    }


}
