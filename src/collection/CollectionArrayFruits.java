package collection;

import java.util.ArrayList;

public class CollectionArrayFruits {
    // Create one Arraylist object and add 20 elements
    //  1. add
    //  2. get and print all using for loop , while , do while
    //  3. remove and print all using for loop , while , do while
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Eggplant");
        stringList.add("Figs");
        stringList.add("Grapes");
        stringList.add("Honeydew");
        stringList.add("Iguana");
        stringList.add("Jackfruit");
        stringList.add("Kiwi");
        stringList.add("Lemon");
        stringList.add("Mango");
        stringList.add("Nectarine");
        stringList.add("Orange");
        stringList.add("Pineapple");
        stringList.add("Quince");
        stringList.add("Raspberry");
        stringList.add("Strawberry");
        stringList.add("Tomato");

        //using for loop
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("Printing Fruits Name Using for Loop : " + stringList.get(i) + " INDEX : "  + i);
        }
        //using while loop
        int j = 0;
        while (j < stringList.size()) {
            System.out.println("Printing Fruits name Using While Loop " + stringList.get(j) + " INDEX : "  + j);
            j++;
        }
        //using do while loop
        int k = 0;
        do {
            System.out.println("Printing Fruits Name Using Do While Loop " + stringList.get(k) + " INDEX : "  + k);
            k++;

        } while (k < stringList.size());

        //after removing
        System.out.println("Printing Fruits Name After Removing Index No. 5");
        stringList.remove(5);
        for (int i=0; i<stringList.size(); i++)
        System.out.println("Printing Fruits Name After Removing  " + stringList.get(i) + " INDEX : "  + i);

    }


}


