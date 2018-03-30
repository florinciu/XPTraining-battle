package be.cegeka.battle.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Army {
    private List<Soldier> soldiers = new LinkedList<>();

    public void enroll(Soldier soldier) {
        soldiers.add(soldier);
    }

    public Soldier getFrontSoldier() {
        Soldier soldier = null;
        try {
            soldier = soldiers.get(0);
        } catch (IndexOutOfBoundsException ex) {
            soldier = null;
        }
        return soldier;
    }

    public void killFrontSoldier() {
        Soldier frontSoldier = getFrontSoldier();
        if(frontSoldier == null) {
            throw new RuntimeException("Army has no more soldiers.");
        }
        soldiers.remove(frontSoldier);
    }
}
