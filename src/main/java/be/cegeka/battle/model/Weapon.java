package be.cegeka.battle.model;

public abstract class Weapon {

    public abstract int getDamageAgainst(Weapon weapon);

    public int getBonusDamageAgainst(Weapon weapon) {
        return 0;
    }

    public int getTotalDamageAgainst(Weapon weapon) {
        return getDamageAgainst(weapon) + getBonusDamageAgainst(weapon);
    }

    public boolean hasHigherDamageThan(Weapon weapon) {
        return getTotalDamageAgainst(weapon) >= weapon.getDamageAgainst(this);
    }
}
