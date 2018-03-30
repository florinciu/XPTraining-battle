package be.cegeka.battle.model.weapons;

import be.cegeka.battle.model.Weapon;

public class MagicPotion extends Weapon {

    private int enemyDamage;

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    @Override
    public int getDamage() {
        if (enemyDamage % 2 == 0) {
            return 10;
        }
        return 0;
    }
}
