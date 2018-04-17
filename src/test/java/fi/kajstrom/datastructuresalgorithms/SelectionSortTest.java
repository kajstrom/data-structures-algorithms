package fi.kajstrom.datastructuresalgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    void testSelectionSort()
    {
        StepCounter.reset();

        int[] unsorted = {67, 8, 15, 2, 6, 10};

        int[] sorted = SelectionSort.sort(unsorted);

        assertSame(2, sorted[0]);
        assertSame(6, sorted[1]);
        assertSame(8, sorted[2]);
        assertSame(10, sorted[3]);
        assertSame(15, sorted[4]);
        assertSame(67, sorted[5]);

        assertSame(15, StepCounter.getSteps());
    }
}
