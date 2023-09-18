package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetWithLooping {

    public HashSetWithLooping() {
    }

    public static void main(String[] args) {
        HashSet<Integer> values = new HashSet<>();//TODO with duplicate values with hashcode;

        values.add(1);
        System.out.println("HashCode of value 1:" + values.hashCode());
        values.add(2);
        System.out.println("HashCode of value 2:" + values.hashCode());
        values.add(3);
        System.out.println("HashCode of value 3:" + values.hashCode());
        values.add(4);
        System.out.println("HashCode of value 4:" + values.hashCode());
        values.add(5);
        System.out.println("HashCode of value 5:" + values.hashCode());
        values.add(6);
        System.out.println("HashCode of value 6:" + values.hashCode());
        values.add(7);
        System.out.println("HashCode of value 7:" + values.hashCode());
        values.add(8);
        System.out.println("HashCode of value 8:" + values.hashCode());
        values.add(9);
        System.out.println("HashCode of value 9:" + values.hashCode());
        values.add(10);
        System.out.println("HashCode of value 10:" + values.hashCode());
        values.add(1);
        System.out.println("HashCode of value 11:" + values.hashCode());
        values.add(2);
        System.out.println("HashCode of value 12:" + values.hashCode());
        values.add(3);
        System.out.println("HashCode of value 13:" + values.hashCode());
        values.add(4);
        System.out.println("HashCode of value 14:" + values.hashCode());
        values.add(5);
        System.out.println("HashCode of value 15:" + values.hashCode());
        values.add(6);
        System.out.println("HashCode of value 16:" + values.hashCode());
        values.add(7);
        System.out.println("HashCode of value 17:" + values.hashCode());
        values.add(8);
        System.out.println("HashCode of value 18:" + values.hashCode());
        values.add(9);
        System.out.println("HashCode of value 19:" + values.hashCode());
        values.add(10);
        System.out.println("HashCode of value 20:" + values.hashCode());

        System.out.println(" ");
        System.out.println("****Using for loop****");
        System.out.println(" ");


        Iterator<Integer> itr = values.iterator();
        for (int i = 0; i < values.size(); i++) {
            System.out.println(i + " iterator over HashSet in for loop :" + itr.next());
        }


        System.out.println(" ");
        System.out.println("****Using while loop****");
        System.out.println(" ");


        Iterator<Integer> itr1 = values.iterator();
        int j = 0;
        while (itr1.hasNext()) {
            System.out.println(j + " iterator over hashset in while loop :" + itr1.next());
            j++;
        }


        System.out.println(" ");
        System.out.println("****Using do while loop****");
        System.out.println(" ");


        Iterator<Integer> itr2 = values.iterator();
        int k = 0;
        do {
            System.out.println(k + " iterator over hashset in do while loop :" + itr2.next());
            k++;
        } while (itr2.hasNext());
    }
}

