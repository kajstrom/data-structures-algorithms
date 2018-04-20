package fi.kajstrom.datastructuresalgorithms;

public class InsertionSort {
    public static int[] sort(int[] array)
    {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;

            while (j > 0 && array[j - 1] > temp) {
                StepCounter.increment();

                array[j] = array[j - 1];
                j--;
            }

            array[j] = temp;
        }

        return array;
    }
}
