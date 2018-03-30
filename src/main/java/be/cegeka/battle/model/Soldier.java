package be.cegeka.battle.model;

import be.cegeka.battle.model.weapons.BareFist;
import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private String name;
    private Weapon weapon;

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        this.weapon = new BareFist();
    }

    public String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
