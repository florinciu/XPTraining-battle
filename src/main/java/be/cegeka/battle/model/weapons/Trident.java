package be.cegeka.battle.model.weapons;

import be.cegeka.battle.model.Weapon;

public class Trident extends Spear implements SpecializedWeapon{
    @Override
    public int getDamageAgainst(Weapon weapon) {
        return 3 * super.getDamageAgainst(weapon);
    }
}
