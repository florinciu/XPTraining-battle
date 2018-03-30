package be.cegeka.battle.model.weapons;

public class BroadAxe extends Axe {
    @Override
    public int getDamage() {
        return 2 * super.getDamage();
    }
}
