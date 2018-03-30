package be.cegeka.battle.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Army {
    private List<Soldier> soldiers = new LinkedList<>();
    private Headquarters headquarters=new HeadquartersImpl();

    public void enroll(Soldier soldier) {
        soldiers.add(soldier);
        int id = headquarters.reportEnlistment(soldier.getName());
        soldier.setId(id);
    }

    public Soldier getFrontSoldier() {
        Soldier soldier;
        try {
            soldier = soldiers.get(0);
        } catch (IndexOutOfBoundsException ex) {
            soldier = null;
        }
        return soldier;
    }

    public void killFrontSoldier() {
        Soldier frontSoldier = getFrontSoldier();
        if (frontSoldier == null) {
            throw new RuntimeException("Army has no more soldiers.");
        }
        headquarters.reportCasualty(frontSoldier.getId());
        soldiers.remove(frontSoldier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Army army = (Army) o;
        return Objects.equals(soldiers, army.soldiers);
    }

    @Override
    public int hashCode() {

        return Objects.hash(soldiers);
    }
}
