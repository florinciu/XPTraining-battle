package be.cegeka.battle.model.weapons;

import be.cegeka.battle.model.Weapon;

public class Spear extends Weapon {
    @Override
    public int getDamage() {
        return 2;
    }

    @Override
    public int getBonusDamageAgainst(Weapon weapon) {
        if(weapon instanceof Sword)
            return 3;
        return 0;
    }
}
