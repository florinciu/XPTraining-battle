package be.cegeka.battle.model;

import be.cegeka.battle.model.weapons.Axe;
import be.cegeka.battle.model.weapons.BareFist;
import be.cegeka.battle.model.weapons.Spear;
import be.cegeka.battle.model.weapons.Sword;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WeaponTest {

    @Test
    public void getDamage_AAxeHas3Damage() {
        Axe axe = new Axe();
        assertThat(axe.getDamage()).isEqualTo(3);
    }

    @Test
    public void getDamage_ABareFistHas1Damage() {
        BareFist bareFist = new BareFist();
        assertThat(bareFist.getDamage()).isEqualTo(1);
    }

    @Test
    public void getDamage_ASpearHas2Damage() {
        Spear spear = new Spear();
        assertThat(spear.getDamage()).isEqualTo(2);
    }

    @Test
    public void getDamage_ASwordHas2Damage() {
        Sword sword = new Sword();
        assertThat(sword.getDamage()).isEqualTo(2);
    }
}