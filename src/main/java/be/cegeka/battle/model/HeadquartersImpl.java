package be.cegeka.battle.model;

import java.util.HashMap;
import java.util.Map;

public class HeadquartersImpl implements Headquarters {
    private Map<Integer, String> soldiersRecord=new HashMap<>();
    private int idGenerator = 0;

    @Override
    public int reportEnlistment(String soldierName) {
        int id=++idGenerator;
        soldiersRecord.put(id,soldierName);
        return id;

    }

    @Override
    public void reportCasualty(int soldierId) {

    }

    @Override
    public void reportVictory(int remainingNumberOfSoldiers) {

    }

    @Override
    public String getSoldierNameById(int id) {
        return soldiersRecord.get(id);
    }
}