package fi.kajstrom.datastructuresalgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {
    @Test
    void testInsertionSort() {
        StepCounter.reset();

        int[] unsorted = {33, 22, 5, 56, 82};

        int[] sorted = InsertionSort.sort(unsorted);

        assertSame(5, sorted[0]);
        assertSame(22, sorted[1]);
        assertSame(33, sorted[2]);
        assertSame(56, sorted[3]);
        assertSame(82, sorted[4]);

        assertSame(3, StepCounter.getSteps());
    }
}
