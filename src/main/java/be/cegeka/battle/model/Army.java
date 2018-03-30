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
        return soldiers.get(0);
    }

    public void killFrontSoldier() {
        soldiers.remove(this.getFrontSoldier());
    }
}
