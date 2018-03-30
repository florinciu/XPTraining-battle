package be.cegeka.battle.model;

import be.cegeka.battle.model.weapons.BareFist;
import be.cegeka.battle.model.weapons.MagicPotion;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
    }

    @Test(expected = RuntimeException.class)
    public void setWeapon_normalSoldierCannotHandleSpecialWeapon() {
        Soldier soldier = new Soldier("soldier one");
        soldier.setWeapon(new MagicPotion());
    }

    @Test
    public void setWeapon_specializedSoldierCanHandleSpecialWeapon() {
        Soldier soldier = new SpecializedSoldier("soldier one");
        soldier.setWeapon(new MagicPotion());
    }

    @Test
    public void construction_ASoldierHasByDefaultBareFistWeapon() {
        Soldier soldier = new Soldier("me");

        assertThat(soldier.getWeapon()).isExactlyInstanceOf(BareFist.class);
    }


}