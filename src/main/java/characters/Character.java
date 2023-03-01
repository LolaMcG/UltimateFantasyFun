package characters;

import Interfaces.IDamage;

public abstract class Character {

    private String name;
    private int health;

    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }

    public int getHealth(){
        return  this.health;
    }

    public void receiveDamage(IDamage weaponySpell){
//        need to get number of points IDamage item comes with. Then health is equal to original - damage points.
        int pointsToReduceBy = weaponySpell.causeDamage();
        getHealth();
        health -= pointsToReduceBy;
    }

}
