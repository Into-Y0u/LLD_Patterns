package StackOverFlow;

public class Test {
    private static int value = -1;
    static {
        System.out.println("Ashchi bhaii");
        value = 344;
    }

    public static int getValue() {
        return value;
    }
}
