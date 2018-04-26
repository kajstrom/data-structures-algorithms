package fi.kajstrom.datastructuresalgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSelectTest {
    @Test
    void testQuickSelect() {
        int[] array = {33, 44, 55, 66, 1, 3, 70};

        QuickSelectArray quick = new QuickSelectArray(array);

        assertEquals(33, quick.select(2, 0, array.length - 1));
    }
}
