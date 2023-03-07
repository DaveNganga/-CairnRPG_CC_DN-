import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    Hero hero = new Hero();

    @Test
    void heroTest1() {
        assertEquals(hero.getName(), "Professor Petcaugh");
    }

    @Test
    void heroTest2() {
        assertEquals(hero.getHealth(), (100));
    }
    @Test
    void heroTest3() {
        assertEquals(hero.getAttackPower(), (50));
    }

    @Test
    void heroTest4() {assertEquals(hero.isAlive, (true));}


}


