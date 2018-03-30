package be.cegeka.battle.model;

import be.cegeka.battle.model.weapons.Axe;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FightTest {

    @Test
    public void fight_theSoldierWithTheBiggestWeaponDamageWins() {
        Soldier soldier1 = new Soldier("soldier1");
        Soldier soldier2 = new Soldier("soldier2");
        Fight fight = new Fight();

        soldier1.setWeapon(new Axe());

        assertThat(fight.fight(soldier1, soldier2)).isEqualTo(soldier1);
    }

    @Test
    public void fight_ifEqualWeaponDamageTheFirstWins() {
        Soldier soldier1 = new Soldier("soldier1");
        Soldier soldier2 = new Soldier("soldier2");
        Fight fight = new Fight();

        assertThat(fight.fight(soldier1, soldier2)).isEqualTo(soldier1);
    }
}