package be.cegeka.battle.model;

public interface Headquarters {
    int reportEnlistment(String soldierName);

    void reportCasualty(int soldierId);

    void reportVictory(int remainingNumberOfSoldiers);

    String getSoldierNameById(int id);

}
