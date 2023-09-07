package package_collection;

import java.util.ArrayList;

public class ArrayList_Generics_Day2 {

    public ArrayList<String> Country_Name() {

        ArrayList<String> Country = new ArrayList<>();

        Country.add("India");
        Country.add("Pakistan");
        Country.add("America");
        Country.add("China");
        Country.add("Brazil");
        Country.add("Canada");
        Country.add("Bangladesh");
        Country.add("Australia");
        Country.add("Nepal");
        Country.add("France");
        Country.add("Africa");
        return Country;
    }

    public ArrayList<Integer> Country_Population() {

        ArrayList<Integer> Population = new ArrayList<>();

        Population.add(289128829);
        Population.add(684959332);
        Population.add(999395893);
        Population.add(1263743222);
        Population.add(244391112);
        Population.add(238781291);
        Population.add(232954319);
        Population.add(563287557);
        Population.add(654896590);
        Population.add(678556584);
        Population.add(45679854);
        return Population;
    }

    public ArrayList<Double> Employee_Salary() {

        ArrayList<Double> Salary = new ArrayList<>();

        Salary.add(100000.87);
        Salary.add(440000.60);
        Salary.add(760000.77);
        Salary.add(134000.56);
        Salary.add(7863000.87);
        Salary.add(896830.98);
        Salary.add(8598300.39);
        Salary.add(7583800.97);
        return Salary;
    }

    public static void main(String[] args) {

        ArrayList_Generics_Day2 obj = new ArrayList_Generics_Day2();

        ArrayList<String> CountryName = obj.Country_Name();

        for (int i = 0; i < CountryName.size(); i++)

            System.out.println("Printing Country Name : " + "    " + i + "-> " + CountryName.get(i));

        for (String var : CountryName) {

            System.out.println("Using Advance For Loop Printing Country Name : " + (var));

        }

        int n = 1;
        while (n < CountryName.size()) {
            System.out.println(" Using   While Loop Printing Country Name : " + CountryName.get(n));
            n++;
        }

        int k = 1;
        do {
            System.out.println(" Using  do While Loop Printing Country Name : " + CountryName.get(k));
            k++;
        }
        while (n < CountryName.size());
        ArrayList<Integer> CountryPopulation = obj.Country_Population();
        for (Integer var : CountryPopulation) {
            System.out.println(" Using Advance For loop Printing Country Population are : " + var);
        }
        for (int i = 1; i < CountryPopulation.size(); i++) {
            System.out.println("Using For loop Printing Country Population Are : " + CountryPopulation.get(i));
        }
        int i = 1;
        while (i < CountryPopulation.size()) {
            System.out.println("Using while loop Printing Country Population are : " + CountryPopulation.get(i));
            i++;
        }
        int t = 1;
        do {
            System.out.println("Using do while loop Printing Country Population are : " + CountryPopulation.get(t));
            t++;
        } while (t < CountryPopulation.size());


        ArrayList<Double> salary = obj.Employee_Salary();
        for (Double var : salary) {
            System.out.println("Using Advance for loop Printing Salary are : " + var);
        }
        for (int o = 1; o < salary.size(); o++) {
            System.out.println("Using For Loop Printing Salary are : " + salary.get(o));
        }
        int q = 1;
        while (q < salary.size()) {
            System.out.println("Using while loop Printing salary : " + salary.get(q));
            q++;
        }
        int v = 1;
        do {
            System.out.println("Using do while loop Printing salary are : " + salary.get(v));
            v++;
        } while (v < salary.size());
    }
}









