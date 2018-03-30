package be.cegeka.battle.model.weapons;

import be.cegeka.battle.model.Weapon;

public class TwoHandedSword extends Sword implements SpecializedWeapon {
    @Override
    public int getDamageAgainst(Weapon weapon) {
        return 5;
    }
}
