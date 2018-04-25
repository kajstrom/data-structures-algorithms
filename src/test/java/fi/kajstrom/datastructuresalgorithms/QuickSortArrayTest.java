package fi.kajstrom.datastructuresalgorithms;

import static org.junit.jupiter.api.Assertions.*;

public class QuickSortArrayTest {
    void testQuickSort() {
        int[] array = {60, 50, 2, 30, 5, 9};

        QuickSortArray quick = new QuickSortArray(array);

        quick.sort();

        int[] sorted = quick.getArray();

        assertEquals(2, sorted[0]);
        assertEquals(5, sorted[1]);
        assertEquals(9, sorted[2]);
        assertEquals(30, sorted[3]);
        assertEquals(50, sorted[4]);
        assertEquals(60, sorted[5]);
    }
}
