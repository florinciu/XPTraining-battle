package be.cegeka.battle.model.weapons;

import be.cegeka.battle.model.Weapon;

public class Axe extends Weapon {
    @Override
    public int getDamage() {
        return 3;
    }

    @Override
    public int getBonusDamageAgainst(Weapon weapon) {
        if(weapon instanceof Spear)
            return 3;
        return 0;
    }
}
