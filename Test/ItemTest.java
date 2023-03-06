import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    Item apple = new Item("Apple", 2);
    Item poisonApple = new Item("Poison Apple", -2);
    Item copperRing = new Item("Copper Ring", 0);

    @Test
    void itemTest1() {
        assertEquals(apple.info(), ("Item: Apple\nHealing Power: 2"));
    }

    @Test
    void itemTestGetters() {
        assertEquals(poisonApple.getName(), ("Poison Apple"));
    }

    @Test
    void itemTestGetters1() {
        assertEquals(poisonApple.getHealingPower(), (-2));
    }

    @Test
    void itemTestSetters() {
        apple.setName("Pear");
        assertEquals("Pear", apple.getName());
    }

    @Test
    void itemTestSetters1() {
        copperRing.setName("Useless");
        assertEquals("Useless", copperRing.getName());
    }
}