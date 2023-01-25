package apps;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static apps.a.JavaPerms.listPermutations;
import static org.junit.jupiter.api.Assertions.*;

class PermsTest {
    @Test
    void permsTest() {
        Integer[][] integers = {{1, 2, 3}, {2, 1, 3}, {2, 3, 1}, {1, 3, 2}, {3, 1, 2}, {3, 2, 1}};
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);

        assertEquals(Arrays.stream(integers).map(Arrays::asList).toList(), listPermutations(num));
    }
}

