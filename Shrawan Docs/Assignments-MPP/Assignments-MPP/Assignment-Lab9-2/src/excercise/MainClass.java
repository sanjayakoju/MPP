package excercise;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);

        List<? super Number> nums = new ArrayList<>();;
        nums.add(3.14);
        System.out.println(ints);
    }
}
