package be.cegeka.battle.model;

public class War {

    private Fight fightResolver;

    public War(Fight fightResolver) {
        this.fightResolver = fightResolver;
    }

    public Army fight(Army army1, Army army2) {

        Soldier soldier1 = army1.getFrontSoldier();
        Soldier soldier2 = army2.getFrontSoldier();

        while (soldier1 != null && soldier2 != null) {
            Soldier winner = fightResolver.fight(soldier1, soldier2);

            if (winner.equals(soldier1)) {
                army2.killFrontSoldier();
                soldier2 = army2.getFrontSoldier();
            } else {
                army1.killFrontSoldier();
                soldier1 = army1.getFrontSoldier();
            }
        }

        return soldier1 != null ? army1 : army2;
    }
}
