package be.cegeka.battle.model;

public abstract class Weapon {
    public abstract int getDamage();
    public abstract int getBonusDamageAgainst(Weapon weapon);
}
