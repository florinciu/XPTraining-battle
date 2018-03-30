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
    public void getFrontSoldier_s() {
        Soldier soldier = new Soldier("name");
        Army army = new Army();
        army.enroll(soldier);

        Assertions.assertThat(army.getFrontSoldier()).isEqualTo(soldier);
    }
}