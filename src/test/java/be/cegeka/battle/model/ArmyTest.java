package be.cegeka.battle.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ArmyTest {
    @Test
    public void enroll_anEnrolledSoldierShouldAppearInArmy() {
        Soldier soldier = new Soldier("name");
        Army army = new Army();
        army.enroll(soldier);

        Assertions.assertThat(army.getFrontSoldier()).isEqualTo(soldier);
    }

    @Test
    public void getFrontSoldier_shouldReturnTheFirstEnrolledSoldier() {
        Soldier soldier1 = new Soldier("name1");
        Soldier soldier2 = new Soldier("name2");
        Army army = new Army();
        army.enroll(soldier1);
        army.enroll(soldier2);

        Assertions.assertThat(army.getFrontSoldier()).isEqualTo(soldier1);
    }

    @Test
    public void getFrontSoldier_shouldReturnNullIfThereIsNoSoldier() {
        Army army = new Army();

        Assertions.assertThat(army.getFrontSoldier()).isNull();
    }

    @Test
    public void killFrontSoldier_shouldReturnTheSecondEnrolledSoldierAfterTheFirstIsKilled() {
        Soldier soldier1 = new Soldier("name1");
        Soldier soldier2 = new Soldier("name2");
        Army army = new Army();
        army.enroll(soldier1);
        army.enroll(soldier2);

        army.killFrontSoldier();
        Assertions.assertThat(army.getFrontSoldier()).isEqualTo(soldier2);
    }

    @Test(expected = RuntimeException.class)
    public void killFrontSoldier_shouldThrowExceptionWhenArmyIsEmpty() {
        Army army = new Army();
        army.killFrontSoldier();
    }
}