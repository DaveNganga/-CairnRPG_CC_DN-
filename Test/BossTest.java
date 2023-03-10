import CairnRPG.Boss;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BossTest {
    Boss boss = new Boss();


    @Test
    void bossTest1() {
        assertEquals(boss.getName(), "generic Boss");
    }

    @Test
    void bossTest2() {
        assertEquals(boss.getHealth(), (200));
    }
    @Test
    void bossTest3() {
        assertEquals(boss.getAttackPower(), (75));
    }

    @Test
    void bossTest4() {assertEquals(boss.isAlive, (true));}

    @Test
    void bossTest5() {assertEquals(boss.getUltrasLeft(), (0));}
}
