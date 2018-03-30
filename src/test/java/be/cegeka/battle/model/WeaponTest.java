package be.cegeka.battle.model;

import be.cegeka.battle.model.weapons.*;
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

    @Test
    public void getDamage_ATwoHandedSwordHas5Damage() {
        TwoHandedSword weapon = new TwoHandedSword();
        assertThat(weapon.getDamage()).isEqualTo(5);
    }

    @Test
    public void getDamage_ABroadAxeHas6Damage() {
        BroadAxe weapon = new BroadAxe();
        assertThat(weapon.getDamage()).isEqualTo(6);
    }

    @Test
    public void getDamage_ATridentHas6Damage() {
        Trident weapon = new Trident();
        assertThat(weapon.getDamage()).isEqualTo(6);
    }

    @Test
    public void getDamage_AMagicPotionHas10DamageIfTheOponentHasEvenDamage() {
        MagicPotion weapon = new MagicPotion();
        weapon.setEnemyDamage(6);
        assertThat(weapon.getDamage()).isEqualTo(10);
    }

    @Test
    public void getDamage_AMagicPotionHas0DamageIfTheOponentHasOddDamage() {
        MagicPotion weapon = new MagicPotion();
        weapon.setEnemyDamage(7);
        assertThat(weapon.getDamage()).isEqualTo(0);
    }
}