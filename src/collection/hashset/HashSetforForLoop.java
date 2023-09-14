package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetforForLoop {
    public static void main(String[] args) {
        HashSet<Integer> values = new HashSet<>();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);

        for (int i = 0; i < values.size(); i++) {
            if (values.contains(i)) {
                System.out.println(i + " Using HashSet with for loop " + values);
            }
        }
    }
}
