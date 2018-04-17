package fi.kajstrom.datastructuresalgorithms;



public class SelectionSort {

    public static int[] sort(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            int idxOfSmallest = i;

            for (int j = i + 1; j < array.length; j++) {
                StepCounter.increment();

                if (array[j] < array[idxOfSmallest]) {
                    idxOfSmallest = j;
                }
            }

            if (idxOfSmallest != i) {
                int temp = array[i];

                array[i] = array[idxOfSmallest];
                array[idxOfSmallest] = temp;
            }
        }

        return array;
    }
}
