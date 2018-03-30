package be.cegeka.battle.model.weapons;

public class Trident extends Spear {

    @Override
    public int getDamage() {
        return 3 * super.getDamage();
    }
}
