package collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_WithLoop {

    public static void main(String[] args) {

        HashSet<String> Detail = new HashSet<>();

        Detail.add("canada");
        System.out.println("Hash code detail 1" + Detail.hashCode());

        Detail.add("ukraine");
        System.out.println("Hash code detail 2" + Detail.hashCode());
        Detail.add("WDC");
        System.out.println("Hash code detail 3" + Detail.hashCode());
        Detail.add("Japan");
        System.out.println("Hash code detail 4" + Detail.hashCode());
        Detail.add("Malaysia");
        System.out.println("Hash code detail 5" + Detail.hashCode());
        Detail.add("Indonesia");
        System.out.println("Hash code detail 6" + Detail.hashCode());
        Detail.add("President");
        System.out.println("Hash code detail 7" + Detail.hashCode());
        Detail.add("Governor");
        System.out.println("Hash code detail 8" + Detail.hashCode());
        Detail.add("canada");
        System.out.println("Hash code detail 9" + Detail.hashCode());
        Detail.add("ukraine");
        System.out.println("Hash code detail 10" + Detail.hashCode());
        Detail.add("WDC");
        System.out.println("Hash code detail 12" + Detail.hashCode());
        Detail.add("Japan");
        System.out.println("Hash code detail 13" + Detail.hashCode());
        Detail.add("Malaysia");
        System.out.println("Hash code detail 14" + Detail.hashCode());
        Detail.add("Indonesia");
        System.out.println("Hash code detail 14" + Detail.hashCode());
        Detail.add("President");
        System.out.println("Hash code detail 15" + Detail.hashCode());
        Detail.add("Governor");
        System.out.println("Hash code detail 16" + Detail.hashCode());
        System.out.println(" ");
        System.out.println("****Using  for loop****");
        System.out.println(" ");
        Iterator<String> itr = Detail.iterator();

        for (int i = 0; i < Detail.size(); i++) {

            System.out.println(" Iterator using for loop " + itr.next());

        }
        System.out.println(" ");
        System.out.println("****Using  while loop****");
        System.out.println(" ");
        Iterator<String> itr1 = Detail.iterator();
        int k = 0;
        while (itr1.hasNext()) {

            System.out.println(k + "Iterator using while loop " + itr1.next());
            k++;
        }
        System.out.println(" ");
        System.out.println("****Using do while loop****");
        System.out.println(" ");
        Iterator<String> itr2 = Detail.iterator();

        int j = 0;
        do {

            System.out.println(j + "Iterator using do while  " + itr2.next());
            j++;

        } while (itr2.hasNext());

    }


}
