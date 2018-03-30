package be.cegeka.battle.model.weapons;

import be.cegeka.battle.model.Weapon;

public class BroadAxe extends Axe implements SpecializedWeapon {
    @Override
    public int getDamageAgainst(Weapon weapon) {
        return 2 * super.getDamageAgainst(weapon);
    }
}
