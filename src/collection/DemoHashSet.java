package collection;

import java.util.HashSet;


public class DemoHashSet {

    public HashSet<String> createStringSet() {

        HashSet<String> subjects = new HashSet<>();

        subjects.add("Math");
        subjects.add("Science");
        subjects.add("Chemistry");
        subjects.add("Physics");
        subjects.add("Biology");
        subjects.add("English");
        subjects.add("Zoology");
        subjects.add("Geography");

        return subjects;
    }

    public HashSet<Integer> createIntegerSet() {

        HashSet<Integer> pageNo = new HashSet<>();

        pageNo.add(1);
        pageNo.add(2);
        pageNo.add(3);
        pageNo.add(4);
        pageNo.add(1);
        pageNo.add(2);
        pageNo.add(3);
        pageNo.add(4);

        return pageNo;
    }

    public HashSet<Double> createDoubleSet() {

        HashSet<Double> price = new HashSet<>();

        price.add(45.5);
        price.add(54.3);
        price.add(67.45);
        price.add(34.23);
        price.add(45.5);
        price.add(54.3);
        price.add(67.45);
        price.add(34.23);

        return price;

    }

    public static void main(String[] args) {

        DemoHashSet obj = new DemoHashSet();

        HashSet<String> subjects = obj.createStringSet();

        int i = 0;

        for (String var : subjects) {

            System.out.println("Printing subject data: " + var + " at Index: " + i);
            i++;
        }

        HashSet<Integer> pageNo = obj.createIntegerSet();

        for (Integer var : pageNo) {

            System.out.println("printing pageNo : " + var);


        }

    }
}
