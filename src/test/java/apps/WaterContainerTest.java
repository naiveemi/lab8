package apps;

import org.junit.jupiter.api.*;

import java.util.List;

import static apps.c.WaterContainer.maxArea;
import static org.junit.jupiter.api.Assertions.*;

class WaterContainerTest {
    @Test
    @DisplayName("Test for Water Container")
    void maxAreaTest() {
        assertEquals(49, maxArea(List.of(1,8,6,2,5,4,8,3,7)));
        assertEquals(1, maxArea(List.of(1, 1)));
        assertEquals(16, maxArea(List.of(4,3,2,1,4)));
        assertEquals(2, maxArea(List.of(1,2,1)));
    }
}
