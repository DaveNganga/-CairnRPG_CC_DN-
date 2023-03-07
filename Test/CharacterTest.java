import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    Character character = new Character();
    @Test
    void characterTest1() {
        assertEquals(character.getName(), "Professor Petcaugh");
    }

    @Test
    void characterTest2() {
        assertEquals(character.getHealth(), (100));
    }
    @Test
    void characterTest3() {
        assertEquals(character.getAttackPower(), (20));
    }

    @Test
    void characterTest4() {
        assertEquals(character.isAlive, (true));
    }
}
