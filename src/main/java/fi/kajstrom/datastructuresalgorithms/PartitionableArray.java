package fi.kajstrom.datastructuresalgorithms;

public class PartitionableArray {
    protected int[] array;

    public PartitionableArray(int[] array) {
        this.array = array;
    }

    public int partition(int leftPointer, int rightPointer) {
        int pivotPosition = rightPointer;
        int pivot = array[pivotPosition];

        rightPointer--;

        while(true) {
            while (array[leftPointer] < pivot) {
                leftPointer++;
            }

            while (array[rightPointer] > pivot) {
                rightPointer--;
            }

            if (leftPointer >= rightPointer) {
                break;
            } else {
                swap(leftPointer, rightPointer);
            }
        }

        swap(leftPointer, pivotPosition);

        return leftPointer;
    }

    public int[] getArray() {
        return array;
    }

    private void swap(int leftPointer, int rightPointer) {
        int temp = array[leftPointer];
        array[leftPointer] = array[rightPointer];
        array[rightPointer] = temp;
    }
}
