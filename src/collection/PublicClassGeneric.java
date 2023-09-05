package collection;

import method.Return_type;

import java.util.ArrayList;

public class PublicClassGeneric {
    public ArrayList<String> StringClass() {

        ArrayList<String> StringArrayList = new ArrayList<>();

        StringArrayList.add("HINDUSTAN");
        StringArrayList.add("BHARAT");
        StringArrayList.add("INDIA");
        StringArrayList.add("ENGLAND");
        StringArrayList.add("AMERICA");
        StringArrayList.add("NEPAL");
        StringArrayList.add("BHUTAN");
        StringArrayList.add("MAYA-MAR");
        StringArrayList.add("BANGLADESH");
        StringArrayList.add("AFGHANISTAN");
        StringArrayList.add("SHRILANKA");
        StringArrayList.add("PAKISTAN");
        StringArrayList.add("CHINA");
        StringArrayList.add("JAPAN");
        StringArrayList.add("SOUTHEASTER");
        StringArrayList.add("SOUTHKORIA");
        StringArrayList.add("NORTHKORIA");
        StringArrayList.add("IDLE");
        StringArrayList.add("DUBAI");
        StringArrayList.add("SAUDIAREBIA");
        StringArrayList.add("FENLAND");
        StringArrayList.remove(7);
        StringArrayList.remove(9);
        return StringArrayList;
    }

    public ArrayList<Double> salary() {

        ArrayList<Double> doublesList = new ArrayList<Double>();

        doublesList.add(35500.0);
        doublesList.add(40000.50);
        doublesList.add(56000.60);
        doublesList.add(53000.765);
        doublesList.add(25000.87);
        doublesList.add(34000.345);
        doublesList.add(46000.68);
        doublesList.add(12000.69);
        doublesList.add(1345688.88);
        return doublesList;
    }

    public ArrayList<Long> countryPopulation() {

        ArrayList<Long> Population = new ArrayList<>();

        Population.add(15000000L);
        Population.add(80000000L);
        Population.add(890000000L);
        Population.add(560000000L);
        Population.add(1567800000L);
        Population.add(5000000L);
        Population.add(2680000L);
        Population.add(35000000L);
        Population.add(560000000L);
        Population.add(6800000009L
        );

        return Population;
    }

    public static void main(String[] args) {
        PublicClassGeneric obj = new PublicClassGeneric();
        ArrayList<String> Save = obj.StringClass();
        ArrayList<Double> massage = obj.salary();
        ArrayList<Long> Public = obj.countryPopulation();

        for (String var : Save) {

            System.out.println("print data after removed for advanced loops :" + var);


        }
        for (int i = 0; i < Save.size(); i++) {

            System.out.println("printing massage with for loop: " + Save.get(i));
        }
        int j = 0;
        while (j < Save.size()) {

            System.out.println("printing data with while loops :" + Save.get(j));
            j++;
        }
        int k = 0;

        do {
            System.out.println("printing data with do while loops :" + Save.get(k));
            k++;
        } while (k < Save.size());
        for (int i = 0; i < Save.size(); i++) {
            System.out.println("print data after removed :" + Save.get(i));
        }
        while (k < Save.size()) ;
        for (int i = 0; i < massage.size(); i++) {
            System.out.println("print data for loops : " + massage.get(i));
        }
        int l = 0;
        while (l < massage.size()) {
            System.out.println("printing data for while loops :" + massage.get(l));
            l++;
        }
        int m = 0;
        do {
            System.out.println("print data for do while loops :" + massage.get(m));
            m++;
        } while (m < massage.size());
        for (int i = 0; i < Public.size(); i++) {

            System.out.println("print data for loops :" + Public.get(i));
        }

        for (double var : Public) {
            System.out.println("print data for advanced loops :" + var);
        }
        int n = 0;
        while (n < Public.size()) {

            System.out.println("print data for while loops :" + Public.get(n));
            n++;
        }
        int t = 0;
        do {
            System.out.println("print data for do while " + Public.get(t));
            t++;
        } while (t < Public.size());
    }
}