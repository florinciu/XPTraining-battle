package be.cegeka.battle.model.weapons;

import be.cegeka.battle.model.Weapon;

public class BareFist extends Weapon {
    @Override
    public int getDamageAgainst(Weapon weapon) {
        return 1;
    }
}
