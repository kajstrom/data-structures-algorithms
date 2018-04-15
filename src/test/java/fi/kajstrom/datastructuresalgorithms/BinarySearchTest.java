package fi.kajstrom.datastructuresalgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testBinarySearch() {
        int[] orderedArray = {1,2,3,4,5,6,7,8,9,10};
        StepCounter.reset();

        assertEquals((Integer) 0, BinarySearch.run(orderedArray, 1));
        assertEquals(3, StepCounter.getSteps());
    }

    @Test
    void testBinarySearchNotFound() {
        int[] orderedArray = {1,2,3,4,5,6,7,8,9,10};
        StepCounter.reset();

        assertEquals(null, BinarySearch.run(orderedArray, 200));
        assertEquals(4, StepCounter.getSteps());
    }
}
