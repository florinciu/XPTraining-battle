package be.cegeka.battle.model.weapons;

import be.cegeka.battle.model.Weapon;

public class BareFist extends Weapon {
    @Override
    public int getDamage() {
        return 1;
    }

    @Override
    public int getBonusDamageAgainst(Weapon weapon) {
        return 0;
    }
}
