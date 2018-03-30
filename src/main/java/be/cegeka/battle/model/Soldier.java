package be.cegeka.battle.model;

import be.cegeka.battle.model.weapons.BareFist;
import be.cegeka.battle.model.weapons.SpecializedWeapon;
import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private int id;
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

    public void setWeapon(Weapon weapon) {
        if (weapon instanceof SpecializedWeapon && !(this instanceof SpecializedSoldier)) {
            throw new RuntimeException("This soldier cannot handle this weapon!");
        }
        this.weapon = weapon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean hasBetterWeapon(Soldier defender) {
        return weapon.hasHigherDamageThan(defender.getWeapon());
    }


}
