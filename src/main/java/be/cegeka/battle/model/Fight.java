package be.cegeka.battle.model;

public class Fight {
    public Soldier fight(Soldier soldier1, Soldier soldier2) {
        if(soldier1.getWeapon().getDamage() >= soldier2.getWeapon().getDamage()) {
            return soldier1;
        }
        return soldier2;
    }
}
