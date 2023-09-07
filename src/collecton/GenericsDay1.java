package collecton;

import java.util.ArrayList;


public class GenericsDay1 {

    public ArrayList<String> createStringList() {
        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("UK");
        countryNames.add("MP");
        countryNames.add("SPain");
        countryNames.add("France");

        return countryNames;
    }

    public ArrayList<Double> createDoubleList() {
        ArrayList<Double>Salary  = new ArrayList<>();
        Salary.add(45000.00);
        Salary.add(67000.00);
        Salary.add(99000.00);
        Salary.add(87000.00);
        Salary.add(59000.00);
        Salary.add(77000.00);

        return Salary;
    }
    public ArrayList<Long> createLongList(){
        ArrayList <Long> Population = new ArrayList<>();
        Population.add(5678943L);
        Population.add(5838963L);
        Population.add(6674243L);
        Population.add(9638943L);
        Population.add(5668742L);

        return Population;
    }


    public static void main(String args[]) {
        GenericsDay1 Obj = new GenericsDay1();
        ArrayList<String> countrynames = Obj.createStringList();

        System.out.println(" Using for loop Printing countries names: ");

        for (int i = 0; i < countrynames.size(); i++) {
            System.out.println("Printing country names: " + countrynames.get(i) + " INDEX " + i);
        }
        System.out.println(" Using do while loop Printing country names");
        int j = 0;
        do {
            System.out.println("Printing country names:" + countrynames.get(j) + " INDEX " + j);
            j++;
        } while (j < countrynames.size());

        System.out.println(" Using while loop printing country names : ");
        int k = 0;
        while (k < countrynames.size()) {
            System.out.println("printing country names:" + countrynames.get(k) + " INDEX " + k);
            k++;
        }
        System.out.println("Using advanced loop printing country names: ");
        for (String var : countrynames) {
            System.out.println("Printing country names:" + var);
        }

        ArrayList<Double> Salary = Obj.createDoubleList();

        System.out.println("Using for loop print Salary: ");
        int i = 0;
        for (int i1 = 0; i < Salary.size(); i++) {
            System.out.println("Printing Salary: " + Salary.get(i)+" INDEX "+i);

        }
        System.out.println(" Using while loop Printing salary:");
        int n = 0;
        while (n < Salary.size()) {
            System.out.println("Printing Salary:" + Salary.get(n)+" INDEX "+n);
            n++;
        }
        System.out.println("Using do while loop printing salary: ");
        int m = 0;
        do {
            System.out.println("Printing salary: " + Salary.get(m)+ " INDEX "+m);
            m++;
        } while (m < Salary.size());

        System.out.println("Using advanced loop printing salary: ");

        for (double var : Salary) {
            System.out.println("Printing salary: " + var+ " INDEX "+var);
        }
        ArrayList<Long> Population = Obj.createLongList();

        System.out.println("Using while loop printing population: ");
        int i1 = 0;
        while (i1 < Population.size()) {
            System.out.println("Printing Population: " + Population.get(i1)+ " INDEX "+i1);
            i1++;
        }
        System.out.println("Using do while loop Printing Population: ");
        int n1 = 0;
        do {
           System.out.println("Printing Salary: "+Population.get(n1)+ " INDEX "+n1);
            n1++;
            }while (n1< Population.size());

          System.out.println("Using Advanced loop Printing Population: ");
          for (Long var: Population){
              System.out.println("Printing Population: "+var);
          }
          System.out.println("Using for loop Printing for loop: ");
          int i2 = 0;
          for (int i3 = 0; i2< Population.size(); i2++){
              System.out.println("Printing Population: "+Population.get(i2)+" INDEX "+i2);
          }
        }

    }







