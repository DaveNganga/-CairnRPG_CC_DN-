import CairnRPG.World;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorldTest {
    World world = new World("The Great Beyond","EA");

    @Test
    void WorldTestGetter1() {
        assertEquals(world.getGameName(), "The Great Beyond");
    }

    @Test
    void WorldTestGetter2() {
        assertEquals(world.getPublisher(), ("EA"));
    }

    @Test
    void WorldTestSetter1() {
        world.setPublisher("Dave Studios");
        assertEquals(world.getPublisher(), ("Dave Studios"));
    }

    @Test
    void WorldTestSetter2() {
        world.setGameName("To Infinity");
        assertEquals(world.getGameName(), ("To Infinity"));
    }

}