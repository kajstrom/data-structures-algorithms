package fi.kajstrom.datastructuresalgorithms;

public class QuickSortArray extends PartitionableArray {
    public QuickSortArray(int[] array) {
        super(array);
    }

    public void sort() {
        sort(0, array.length - 1);
    }

    private void sort(int leftIdx, int rightIdx) {
        if (rightIdx - leftIdx <= 0) {
            return;
        }

        int pivotPosition = partition(leftIdx, rightIdx);

        sort(leftIdx, pivotPosition - 1);

        sort(pivotPosition + 1, rightIdx);
    }
}
