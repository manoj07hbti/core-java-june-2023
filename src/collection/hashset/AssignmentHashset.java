package collection.hashset;

import java.util.HashSet;

public class AssignmentHashset {


    public HashSet<String> createStringSet()
    {
        HashSet<String> name=new HashSet<>();
        name.add("Rahul");
        name.add("Reva");
        name.add("anvit");
        name.add("chiki");
        name.add("Rahul");
        name.add("chiki");
        name.add("payal");
        name.add("anvit");


        return name;
    }

    public  HashSet<Integer> createIntegerSet()
    {
        HashSet<Integer> rollNo=new HashSet<>();
        rollNo.add(1);
        rollNo.add(2);
        rollNo.add(3);
        rollNo.add(2);
        rollNo.add(2);
        rollNo.add(4);
        rollNo.add(3);
        rollNo.add(1);

        return rollNo;
    }
    public  HashSet<Double> createDouble()
    {
        HashSet<Double> marks=new HashSet<>();
        marks.add(85.52);
        marks.add(78.25);
        marks.add(85.25);
        marks.add(74.52);
        marks.add(78.25);
        marks.add(85.25);
        marks.add(85.52);
        marks.add(78.25);
        marks.add(74.25);

        return marks;
    }

    public static void main(String[] args) {
        AssignmentHashset obj=new AssignmentHashset();
        System.out.println("..............String HashSet...........");
        HashSet<String> names=obj.createStringSet();
        for (String var:names)
        {
            System.out.println(var);
        }
        System.out.println();
        System.out.println("..............Integer HashSet...........");
        HashSet<Integer> rollNo=obj.createIntegerSet();
        for (Integer var:rollNo)
        {
            System.out.println(var);
        }
        System.out.println();
        System.out.println("..............Double HashSet...........");
        HashSet<Double> marks=obj.createDouble();
        for (Double var:marks)
        {
            System.out.println(var);
        }
    }

}
