package fi.kajstrom.datastructuresalgorithms;

public class StepCounter {
    private static int steps;

    public static void increment()
    {
        steps++;
    }

    public static void reset()
    {
        steps = 0;
    }

    public static int getSteps()
    {
        return steps;
    }
}
