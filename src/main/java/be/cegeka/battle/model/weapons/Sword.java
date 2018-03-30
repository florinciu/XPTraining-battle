package be.cegeka.battle.model.weapons;

import be.cegeka.battle.model.Weapon;

public class Sword extends Weapon {
    
    @Override
    public int getDamage() {
        return 2;
    }

    @Override
    public int getBonusDamageAgainst(Weapon weapon) {
        if(weapon instanceof Axe)
            return 3;
        return 0;
    }
}
