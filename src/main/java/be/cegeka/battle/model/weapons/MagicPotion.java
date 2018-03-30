package be.cegeka.battle.model.weapons;

import be.cegeka.battle.model.Weapon;

public class MagicPotion extends Weapon {

    @Override
    public int getDamageAgainst(Weapon weapon) {
        if (weapon.getDamageAgainst(null) % 2 == 0) {
            return 10;
        }
        return 0;
    }
}
