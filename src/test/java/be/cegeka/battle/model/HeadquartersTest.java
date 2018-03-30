package be.cegeka.battle.model;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class HeadquartersTest {
    @Test
    public void reportEnlistment_SouldReturnASoldierId(){
        Headquarters headquarters=new HeadquartersImpl();
        int id=headquarters.reportEnlistment("name");
        assertThat(id).isNotZero();
    }

    @Test
    public void reportEnlistment_SouldAddTheSoldier(){
        Headquarters headquarters=new HeadquartersImpl();
        int id=headquarters.reportEnlistment("name");
        assertThat(headquarters.getSoldierNameById(id)).isEqualTo("name");
    }
}
