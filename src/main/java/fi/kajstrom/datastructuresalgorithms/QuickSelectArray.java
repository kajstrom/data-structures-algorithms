package fi.kajstrom.datastructuresalgorithms;

public class QuickSelectArray extends PartitionableArray {

    public QuickSelectArray(int[] array) {
        super(array);
    }

    public int select(int kthLowestValue, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex <= 0) {
            return array[leftIndex];
        }

        int pivotPosition = partition(leftIndex, rightIndex);

        if (kthLowestValue < pivotPosition) {
            return select(kthLowestValue, leftIndex, pivotPosition - 1);
        } else if(kthLowestValue > pivotPosition) {
            return select(kthLowestValue, pivotPosition + 1, rightIndex);
        } else {
            return array[pivotPosition];
        }
    }
}
