package collection.arraylist;

import java.util.ArrayList;

public class FindDuplicate2 {

    public ArrayList<Object> duplicateFind() {
        ArrayList<Object> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        return list;
    }

    public static void main(String[] args) {


        FindDuplicate2 obj = new FindDuplicate2();
        ArrayList<Object> list = obj.duplicateFind();


        for (int i = 0; i < list.size(); i++) {
            System.out.println("Before Remove Duplicate elements:" + list);
            System.out.println(" ");
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After Removing Duplicate elements:" + list);
    }
}

