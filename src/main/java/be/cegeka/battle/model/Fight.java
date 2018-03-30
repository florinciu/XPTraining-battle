package be.cegeka.battle.model;

public class Fight {
    public Soldier fight(Soldier attacker, Soldier defender) {
        if (attacker.hasBetterWeapon(defender)) {
            return attacker;
        }
        return defender;
    }
}
