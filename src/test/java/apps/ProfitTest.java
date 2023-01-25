package apps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static apps.b.MaxProfit.maxProfit;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfitTest {
    @Test
    @DisplayName("Test for max profit")
    void maxProfitTest() {
        assertEquals(5, maxProfit(List.of(7,1,5,3,6,4)));
        assertEquals(0, maxProfit(List.of(7,6,4,3,1)));
    }
}
