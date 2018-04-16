package fi.kajstrom.datastructuresalgorithms;

public class BubbleSort {
    public static int[] sort(int[] array)
    {
        int unsortedUntil = array.length - 1;

        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            int i = 0;
            while (i < unsortedUntil) {
                StepCounter.increment();

                if (array[i] > array[i + 1]) {
                    int left = array[i];
                    int right = array[i + 1];

                    array[i] = right;
                    array[i + 1] = left;

                    sorted = false;
                }

                i++;
            }

            unsortedUntil--;
        }

        return array;
    }
}
