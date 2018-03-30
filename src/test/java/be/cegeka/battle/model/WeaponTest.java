package be.cegeka.battle.model;

import be.cegeka.battle.model.weapons.*;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WeaponTest {

    @Test
    public void getDamage_AAxeHas3Damage() {
        Axe axe = new Axe();
        assertThat(axe.getDamageAgainst(null)).isEqualTo(3);
    }

    @Test
    public void getDamage_ABareFistHas1Damage() {
        BareFist bareFist = new BareFist();
        assertThat(bareFist.getDamageAgainst(null)).isEqualTo(1);
    }

    @Test
    public void getDamage_ASpearHas2Damage() {
        Spear spear = new Spear();
        assertThat(spear.getDamageAgainst(null)).isEqualTo(2);
    }

    @Test
    public void getDamage_ASwordHas2Damage() {
        Sword sword = new Sword();
        assertThat(sword.getDamageAgainst(null)).isEqualTo(2);
    }

    @Test
    public void getBonusDamageOver_axeOverSpear() {
        Weapon axe = new Axe();
        Weapon spear = new Spear();

        assertThat(axe.getBonusDamageAgainst(spear)).isEqualTo(3);
    }

    @Test
    public void getBonusDamageOver_SpearOverSword() {
        Weapon spear = new Spear();
        Weapon sword = new Sword();

        assertThat(spear.getBonusDamageAgainst(sword)).isEqualTo(3);
    }

    @Test
    public void getBonusDamageOver_swordOverAxe() {
        Weapon sword = new Sword();
        Weapon axe = new Axe();

        assertThat(sword.getBonusDamageAgainst(axe)).isEqualTo(3);
    }

    @Test
    public void getBonusDamageOver_bareFistOverAnyWeapon() {
        Weapon bareFist = new BareFist();

        assertThat(bareFist.getBonusDamageAgainst(new Axe())).isEqualTo(0);
        assertThat(bareFist.getBonusDamageAgainst(new Sword())).isEqualTo(0);
        assertThat(bareFist.getBonusDamageAgainst(new Spear())).isEqualTo(0);
    }

    @Test
    public void getBonusDamageOver_sameWeaponNoBonusDamage() {
        assertThat(new Axe().getBonusDamageAgainst(new Axe())).isEqualTo(0);
        assertThat(new Sword().getBonusDamageAgainst(new Sword())).isEqualTo(0);
        assertThat(new Spear().getBonusDamageAgainst(new Spear())).isEqualTo(0);
        assertThat(new BareFist().getBonusDamageAgainst(new BareFist())).isEqualTo(0);
    }

    @Test
    public void getDamage_ATwoHandedSwordHas5Damage() {
        TwoHandedSword weapon = new TwoHandedSword();
        assertThat(weapon.getDamageAgainst(null)).isEqualTo(5);
    }

    @Test
    public void getDamage_ABroadAxeHas6Damage() {
        BroadAxe weapon = new BroadAxe();
        assertThat(weapon.getDamageAgainst(null)).isEqualTo(6);
    }

    @Test
    public void getDamage_ATridentHas6Damage() {
        Trident weapon = new Trident();
        assertThat(weapon.getDamageAgainst(null)).isEqualTo(6);
    }

    @Test
    public void getDamage_AMagicPotionHas10DamageIfTheOponentHasEvenDamage() {
        MagicPotion weapon = new MagicPotion();
        assertThat(weapon.getDamageAgainst(new Sword())).isEqualTo(10);
    }

    @Test
    public void getDamage_AMagicPotionHas0DamageIfTheOponentHasOddDamage() {
        MagicPotion weapon = new MagicPotion();
        assertThat(weapon.getDamageAgainst(new Axe())).isEqualTo(0);
    }

}