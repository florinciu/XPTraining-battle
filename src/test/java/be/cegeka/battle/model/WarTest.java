package be.cegeka.battle.model;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WarTest {

    @Test
    public void fightShallProvideAWinner() {
        Army army1 = new Army();
        Army army2 = new Army();

        Army winner = new War(new FightAlwaysFirstWinsStub()).fight(army1, army2);

        assertThat(winner).isEqualTo(army1);
    }

    class FightAlwaysFirstWinsStub extends Fight {

        @Override
        public Soldier fight(Soldier soldier1, Soldier soldier2) {
            return soldier1;
        }
    }
}
