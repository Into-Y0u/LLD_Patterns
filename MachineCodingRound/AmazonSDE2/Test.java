import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] arr = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(4);
        arrList.add(4);
        Stream<Integer> st = arrList.stream().distinct();
        System.out.println("Count a " + st.toString());
    }
}
