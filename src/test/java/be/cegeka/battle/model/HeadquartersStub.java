package be.cegeka.battle.model;

public class HeadquartersStub implements Headquarters {
    @Override
    public int reportEnlistment(String soldierName) {
        return 0;
    }

    @Override
    public void reportCasualty(int soldierId) {

    }

    @Override
    public void reportVictory(int remainingNumberOfSoldiers) {

    }

    @Override
    public String getSoldierNameById(int id) {
        return "name";
    }
}
