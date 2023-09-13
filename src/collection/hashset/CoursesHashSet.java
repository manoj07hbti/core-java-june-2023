package collection.hashset;

import java.util.HashSet;

public class CoursesHashSet {


    public HashSet<String> createStringSet() {

        HashSet<String> courses = new HashSet<>();

        courses.add("Math");
        courses.add("DSTL");
        courses.add("DAA");
        courses.add("Math");
        courses.add("Geographic");
        courses.add("DBMS");
        courses.add("DAA");
        courses.add("Math");
        courses.add("Microprocessor");
        courses.add("Math");

        return courses;

    }

    public HashSet<Integer> createIntegerSet() {
        HashSet<Integer> value = new HashSet<>();
        value.add(8);
        value.add(3);
        value.add(5);
        value.add(7);
        value.add(6);
        value.add(5);
        value.add(2);
        value.add(1);
        value.add(2);
        value.add(1);

        return value;
    }

    public HashSet<Double> createDoubleSet() {
        HashSet<Double> doubleValues = new HashSet<>();

        doubleValues.add(3.2);
        doubleValues.add(3.1);
        doubleValues.add(2.2);
        doubleValues.add(1.2);
        doubleValues.add(3.2);
        doubleValues.add(3.3);
        doubleValues.add(3.6);
        doubleValues.add(3.3);
        doubleValues.add(3.1);
        doubleValues.add(3.6);

        return doubleValues;


    }


    public static void main(String[] args) {
        CoursesHashSet obj = new CoursesHashSet();
        HashSet<String> coursesData = obj.createStringSet();
        HashSet<Integer> valuesData = obj.createIntegerSet();
        HashSet<Double> doubleData = obj.createDoubleSet();
        int i = 0;
        for (String var : coursesData) {

            System.out.println("Printing Courses Data :" + var + " at INDEX " + i);
            i++;
        }
        int j = 0;
        for (Integer var : valuesData) {
            System.out.println("Printing Values Data :" + var + " at INDEX " + j);
            j++;
        }
        int k = 0;
        for (Double var : doubleData) {
            System.out.println("Printing Double Values Data :" + var + " at INDEX " + k);
            k++;
        }
    }

}
