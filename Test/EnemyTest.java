import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {
    Enemy enemy = new Enemy();
    @Test
    void enemyTest1() {
        assertEquals(enemy.getName(), "Dangerous Dave");
    }

    @Test
    void enemyTest2() {
        assertEquals(enemy.getHealth(), (100));
    }
    @Test
    void enemyTest3() {
        assertEquals(enemy.getAttackPower(), (20));
    }

    @Test
    void enemyTest4() {
        assertEquals(enemy.isAlive, (true));
    }

}