package collection.linkedhashset;

import java.util.LinkedHashSet;

public class StringLinkedSet {

    public LinkedHashSet<String> createStringLinkedSet() {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("JAVA");
        set.add("SPRING");
        set.add("SPRING BOOT");
        set.add("MICROSERVICES");
        set.add("INDIA");
        set.add("CHINA");
        set.add("UNITED STATES");
        set.add("INDONESIA");
        set.add("PAKISTAN");
        set.add("NIGERIA");
        set.add("BRAZIL");
        set.add("BANGLADESH");
        set.add("RUSSIA");
        set.add("MEXICO");
        set.add("ETHIOPIA");
        set.add("JAPAN");
        set.add("PHILIPPINES");
        set.add("EGYPT");
        set.add("DR CONGO");
        set.add("VIET NAM");
        set.add("IRAN");
        set.add("TURKEY");
        set.add("GERMANY");
        set.add("THAILAND");

        return set;

    }

    public LinkedHashSet<Integer> createIntegerLinkedSet() {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(1431012843);
        set.add(1425607058);
        set.add(340327659);
        set.add(277948831);
        set.add(224762384);
        set.add(216646550);
        set.add(173271987);
        set.add(144354116);
        set.add(128625914);
        set.add(127101500);
        set.add(123175071);
        set.add(117657387);
        set.add(113030664);
        set.add(102861256);
        set.add(98977292);
        set.add(89291380);
        set.add(85897624);
        set.add(83288033);
        set.add(71818431);

        return set;

    }

    public LinkedHashSet<Double> createDoubleLinkedSet() {

        LinkedHashSet<Double> set = new LinkedHashSet<>();
        set.add(1.1);
        set.add(1.2);
        set.add(1.3);
        set.add(1.4);
        set.add(1.5);
        set.add(1.6);
        set.add(1.7);
        set.add(1.8);
        set.add(1.9);
        set.add(2.0);
        set.add(124572.55);
        set.add(485165.55);
        set.add(254975.52);
        set.add(579842.55);
        set.add(123456.12);
        set.add(789456.32);
        set.add(789123.45);
        set.add(456123.45);
        set.add(654321.21);
        set.add(987654.32);
        set.add(321987.32);
        set.add(741852.36);
        set.add(369258.25);

        return set;
    }

    public static void main(String[] args) {
        StringLinkedSet obj = new StringLinkedSet();
        LinkedHashSet<String> data = obj.createStringLinkedSet();
        System.out.println("****Using Advanced For Loop****");
        System.out.println(" ");
        int i = 0;
        for (String var : data) {
            System.out.println("Printing Linked Set Data is: " + var + " at INDEX-->" + i);
            i++;
        }
        LinkedHashSet<Integer> data1 = obj.createIntegerLinkedSet();
        System.out.println(" ");
        System.out.println("****Using Advanced For Loop****");
        System.out.println(" ");
        int j = 0;
        for (Integer var : data1) {
            System.out.println("Printing Linked Set Data is: " + var + " at INDEX-->" + j);
            j++;
        }
        LinkedHashSet<Double> data2 = obj.createDoubleLinkedSet();
        System.out.println(" ");
        System.out.println("****Using Advanced For Loop****");
        System.out.println(" ");
        int k = 0;
        for (Double var : data2) {
            System.out.println("Printing Linked Set Data is: " + var + " at INDEX-->" + k);
            k++;
        }
    }
}

