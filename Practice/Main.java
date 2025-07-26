package Practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(3, 1, 4, 1, 5, 9);
        PriorityQueue<Integer> heap = new PriorityQueue<>(data); // copies elements
        System.out.println("ASDA " + heap);

    }
}
