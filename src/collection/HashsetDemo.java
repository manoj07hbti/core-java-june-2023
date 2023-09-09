package collection;

import java.util.HashSet;

public class HashsetDemo {

    public HashSet<String> Hashsetlist() {

        HashSet<String> Subject = new HashSet<>();
        Subject.add("Hindi");
        Subject.add("English");
        Subject.add("Math");
        Subject.add("Social science");
        Subject.add("History");
        Subject.add("Chemistry");
        Subject.add("Life Science");
        Subject.add("Drowning");
        Subject.add("Social science");
        Subject.add("History");
        Subject.add("Chemistry");
        Subject.add("Life Science");
        Subject.add("Drowning");

        return Subject;
    }


    public HashSet<Integer> Integerlist() {

        HashSet<Integer> Number = new HashSet<>();

        Number.add(34);
        Number.add(45);
        Number.add(76);
        Number.add(87);
        Number.add(34);
        Number.add(23);
        Number.add(9);
        Number.add(32);
        Number.add(45);
        Number.add(89);
        Number.add(32);
        Number.add(67);
        return Number;
    }

    public HashSet<Double> doubleNumber() {

        HashSet<Double> Salary = new HashSet<Double>();

        Salary.add(34569.90);
        Salary.add(134500.45);
        Salary.add(54700.98);
        Salary.add(32500.80);
        Salary.add(43700.675);
        Salary.add(19000.567);
        Salary.add(546889.5676);
        Salary.add(32600.98);
        Salary.add(43000.0009);
        Salary.add(65000.88);
        Salary.add(34569.90);
        Salary.add(134500.45);
        Salary.add(54700.98);
        Salary.add(32500.80);
        Salary.add(43700.675);
        Salary.add(19000.567);
        Salary.add(546889.5676);
        Salary.add(32600.98);
        Salary.add(43000.0009);
        Salary.add(65000.88);

        return Salary;
    }


    public static void main(String[] args) {

        HashsetDemo obj = new HashsetDemo();

        HashSet<String> subject = obj.Hashsetlist();
        HashSet<Integer> number = obj.Integerlist();
        HashSet<Double> salary = obj.doubleNumber();
        int k = 0;
        for (String var : subject) {
            k++;
            System.out.println("print subject :" + var + "Index : " + k);
        }

        int i = 0;
        for (Integer var : number) {
            i++;
            System.out.println("print my integer number :" + var + "Index :" + i);
        }

        int j = 0;
        for (Double var : salary) {

            j++;

            System.out.println("print salary :" + var + ": Index " + j);
        }


    }

}
