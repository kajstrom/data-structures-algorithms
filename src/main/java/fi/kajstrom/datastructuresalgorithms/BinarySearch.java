package fi.kajstrom.datastructuresalgorithms;

public class BinarySearch {
    public static Integer run(int[] orderedArray, int value)
    {
        int lowerBound = 0;
        int upperBound = orderedArray.length - 1;

        while (lowerBound <= upperBound) {
            StepCounter.increment();

            int middlePoint = (upperBound + lowerBound) / 2;
            int valueAtMiddle = orderedArray[middlePoint];

            if (value < valueAtMiddle) {
                upperBound = middlePoint - 1;
            } else if (value > valueAtMiddle) {
                lowerBound = middlePoint + 1;
            } else if (value == valueAtMiddle){
                return middlePoint;
            }
        }

        return null;
    }
}
