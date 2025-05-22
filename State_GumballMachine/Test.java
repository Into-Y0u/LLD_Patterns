import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(new ArrayList(Arrays.asList(1, 2)));
        arr.add(new ArrayList(Arrays.asList(5, 4)));
        System.out.println("arr  " + arr);

        for (Object co : arr) {
            ArrayList temp = (ArrayList) co;
            System.out.println(temp + "  emeld " + temp.get(0) + ", " + temp.get(1));
        }
    }
}