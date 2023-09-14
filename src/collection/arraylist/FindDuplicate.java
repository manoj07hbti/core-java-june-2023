package collection.arraylist;



import java.util.*;


public class FindDuplicate {

    public static void main(String[] args) {

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

        System.out.println("Before Remove Duplicate elements:"+list);
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After Removing Duplicate elements:"+list);
    }
}


