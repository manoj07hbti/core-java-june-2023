package Collection;

import java.util.ArrayList;

public class Demo_Generic {

    public ArrayList<String> StringClass() {

        ArrayList<String> StringArraylist = new ArrayList<>();
        StringArraylist.add("india");
        StringArraylist.add("saudi arab");
        StringArraylist.add("finland");
        StringArraylist.add("america");
        StringArraylist.add("france");
        StringArraylist.add("bangladesh");
        StringArraylist.add("vietnam");
        StringArraylist.add("germany");
        StringArraylist.add("laos");
        StringArraylist.add("srilanka");
        StringArraylist.add("china");
        StringArraylist.add("switzerland");
        StringArraylist.add("england");
        StringArraylist.add("australia");
        StringArraylist.add("greece");
        StringArraylist.add("botswana");
        StringArraylist.add("pakistan");
        StringArraylist.add("russia");
        StringArraylist.add("sudan");
        StringArraylist.add("iran");
        StringArraylist.add("iraq");
        return StringArraylist;
    }

    public ArrayList<Long> Countrypopulation() {
        ArrayList<Long> Population = new ArrayList<>();
        Population.add(100000l);
        Population.add(150000l);
        Population.add(300000l);
        Population.add(600000l);
        Population.add(900000l);
        Population.add(10000l);
        Population.add(700000l);
        Population.add(6000l);
        Population.add(750000l);
        Population.add(80000l);
        Population.add(52000l);
        return Population;

    }

    public ArrayList<Double> salary() {
        ArrayList<Double> price = new ArrayList<>();
        price.add(8500.4);
        price.add(9800.0);
       price.add(6800.90);
      price.add(9850.09);
       price.add(6500.98);
      price.add(7400.40);
        price.add(4350.5);
        return price;

    }

    public static void main(String[] args) {
        Demo_Generic obj = new Demo_Generic();
        ArrayList<String> country = obj.StringClass();
        ArrayList<Long> POPULATION = obj.Countrypopulation();
        ArrayList<Double> salary = obj.salary();

        for (int i = 0; i < country.size(); i++) {
            System.out.println("printing country names:" + country.get(i));
        }
        int j = 0;
        while (j < country.size()) {
            System.out.println("printing country using Do while:" + country.get(j));
            j++;
        }
        int k = 0;
        do {
            System.out.println("printing using do while:" + country.get(k));
            k++;
        } while (k < country.size());

      

        

        for (String var : country) {
            System.out.println("printing names using advanced loops:" + var);

        }



        for (int i = 0; i < POPULATION.size(); i++) {
            System.out.println("printing population for loop:" + POPULATION.get(i));
        }
        int f = 1;
        while (f < POPULATION.size()) {
            System.out.println("printing population while loop:" + POPULATION.get(f));
            f++;
        }
        int g = 1;
        do {
            System.out.println("printing population do while loop:" + POPULATION.get(g));
            g++;
        } while (g < POPULATION.size());




        for (long var : POPULATION) {
            System.out.println("printing population advanced loops:" + var);

        }
        for (int i = 0; i < salary.size(); i++) {
            System.out.println("printing salary for loop:" + salary.get(i));
        }
        int h = 1;
        while (h < salary.size()) {
            System.out.println("printing salary while loop:" + salary.get(h));
            h++;
        }
        int d = 1;
        do {
            System.out.println("printing salary using do while loop:" + salary.get(d));
        } while (d < salary.size());





        for (double var : salary) {
            System.out.println("printing salary advanced loop :" + var);





        }



    }
}



