package fi.kajstrom.datastructuresalgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    void testBubbleSort()
    {
        StepCounter.reset();

        int[] unsorted = {2, 67, 44, 3};

        int[] sorted = BubbleSort.sort(unsorted);

        assertSame(2, sorted[0]);
        assertSame(3, sorted[1]);
        assertSame(44, sorted[2]);
        assertSame(67, sorted[3]);

        assertSame(6, StepCounter.getSteps());
    }

    @Test
    void testBubbleSortStepsIncreaseQuadratically()
    {
        StepCounter.reset();

        int[] unsorted = {99, 78, 165, 223, 400, 1, 15, 38, 47, 58, 3, -2, 19, 600, 3, 3};

        BubbleSort.sort(unsorted);

        assertTrue(StepCounter.getSteps() > 100);
    }
}
