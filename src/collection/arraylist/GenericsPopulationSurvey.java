package collection.arraylist;

import java.util.ArrayList;

public class GenericsPopulationSurvey {

    public ArrayList<String> createString() {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("INDIA");
        stringArrayList.add("CHINA");
        stringArrayList.add("UNITED STATES");
        stringArrayList.add("INDONESIA");
        stringArrayList.add("PAKISTAN");
        stringArrayList.add("NIGERIA");
        stringArrayList.add("BRAZIL");
        stringArrayList.add("BANGLADESH");
        stringArrayList.add("RUSSIA");
        stringArrayList.add("MEXICO");
        stringArrayList.add("ETHIOPIA");
        stringArrayList.add("JAPAN");
        stringArrayList.add("PHILIPPINES");
        stringArrayList.add("EGYPT");
        stringArrayList.add("DR CONGO");
        stringArrayList.add("VIET NAM");
        stringArrayList.add("IRAN");
        stringArrayList.add("TURKEY");
        stringArrayList.add("GERMANY");
        stringArrayList.add("THAILAND");


        return stringArrayList;
    }

    public ArrayList<Integer> createIntegerList(){

        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(1431012843);
        integerArrayList.add(1425607058);
        integerArrayList.add(340327659);
        integerArrayList.add(277948831);
        integerArrayList.add(224762384);
        integerArrayList.add(216646550);
        integerArrayList.add(173271987);
        integerArrayList.add(144354116);
        integerArrayList.add(128625914);
        integerArrayList.add(127101500);
        integerArrayList.add(123175071);
        integerArrayList.add(117657387);
        integerArrayList.add(113030664);
        integerArrayList.add(102861256);
        integerArrayList.add(98977292);
        integerArrayList.add(89291380);
        integerArrayList.add(85897624);
        integerArrayList.add(83288033);
        integerArrayList.add(71818431);


        return integerArrayList;
    }

    public ArrayList<Double> createDoubleList(){

        ArrayList<Double> doubleArrayList=new ArrayList<>();

        doubleArrayList.add(124572.55);
        doubleArrayList.add(485165.55);
        doubleArrayList.add(254975.52);
        doubleArrayList.add(579842.55);
        doubleArrayList.add(123456.12);
        doubleArrayList.add(789456.32);
        doubleArrayList.add(789123.45);
        doubleArrayList.add(456123.45);
        doubleArrayList.add(654321.21);
        doubleArrayList.add(987654.32);
        doubleArrayList.add(321987.32);
        doubleArrayList.add(741852.36);
        doubleArrayList.add(369258.25);


        return doubleArrayList;

    }

    public static void main(String[] args) {
        GenericsPopulationSurvey obj = new GenericsPopulationSurvey();
        ArrayList<String> countryName = obj.createString();
        ArrayList<Integer> countryPopulation = obj.createIntegerList();
        ArrayList<Double> decimalValues= obj.createDoubleList();
        System.out.println("COUNTRY NAME");
        System.out.println("****Using for loop****");
        for (int i = 0; i < countryName.size(); i++) {
            System.out.println("Printing Country Name : " + "INDEX " + +i + "." + countryName.get(i));
        }



        System.out.println(" ");
        System.out.println("****Using while loop****");
        int j = 0;
        while (j < countryName.size()) {
            System.out.println("Printing Country Name : " + "INDEX " + + j + "." + countryName.get(j));
            j++;
        }


        System.out.println("");
        System.out.println("****Using do while loop****");
        int k=0;
        do {
            System.out.println("Printing Country Name : "+"INDEX " +  + k + "." + countryName.get(k));
            k++;
        }while (k<countryName.size());


        System.out.println("");
        System.out.println("****Using Advanced for loop****");
            int r=0;
        for (String var:countryName){

            System.out.println("Printing Country Name : " + var +" at INDEX " +r);
            r++;
        }

        System.out.println(" ");
        System.out.println("COUNTRY POPULATION");
        System.out.println("****Using for loop****");

        for (int l=0;l<countryPopulation.size();l++){
            System.out.println("Population of :" + " INDEX " + l + "." + countryName.get(l) + " = " + countryPopulation.get(l));
        }

        System.out.println("");
        System.out.println("****Using while loop****");
        int m=0;
        while (m<countryPopulation.size()){
            System.out.println("Population of :" + " INDEX " + m + "." + countryName.get(m) + " = " + countryPopulation.get(m));
            m++;
        }

        System.out.println("");
        System.out.println("****Using do while loop****");
        int n=0;
        do {
            System.out.println("Population of :" + " INDEX " + n + "." + countryName.get(n) + " = " + countryPopulation.get(n));
            n++;
        }while (n<countryPopulation.size());

        System.out.println("");
        System.out.println("********Using Advanced for loop****");
        for (Integer var:countryPopulation){
            System.out.println("Population of :"+var);
        }

        System.out.println("");
        System.out.println("DECIMAL VALUES");
        System.out.println("****USing for loop****");
        for (int o=0;o<decimalValues.size();o++){
            System.out.println(decimalValues.get(o));
        }

        System.out.println("");
        System.out.println("****Using while loop****");
        int p=0;
        while (p<decimalValues.size()){
            System.out.println(decimalValues.get(p));
            p++;
        }
        System.out.println("");
        System.out.println("****Using do while loop****");
        int q=0;
        do {
            System.out.println(decimalValues.get(q));
            q++;
        }while (q<decimalValues.size());

        System.out.println("");
        System.out.println("****Using Advanced for loop****");
        for (Double var:decimalValues){
            System.out.println(var);
        }
    }
}

