package Collection;

import java.util.ArrayList;

public class ArrayList_Generics {
    public ArrayList<String> Country_Name() {
        ArrayList<String> Country = new ArrayList<>();
        Country.add("India");
        Country.add("China");
        Country.add("America");
        Country.add("Rus");
        Country.add("Australia");
        Country.add("Canada");
        Country.add("Bangladesh");
        Country.add("United State");
        Country.add("Nepal");
        Country.add("France");
        Country.add("Afghanistan");
        Country.add("Germany");
        Country.add("Brazil");
        Country.add("Austria");
        return Country;
    }


    public ArrayList<Integer> Country_Population() {
        ArrayList<Integer> Population = new ArrayList<>();
        Population.add(1430948559);
        Population.add(1425583619);
        Population.add(340319431);
        Population.add(144444359);
        Population.add(26439111);
        Population.add(38781291);
        Population.add(172954319);
        Population.add(333287557);
        Population.add(30896590);
        Population.add(64756584);
        Population.add(42239854);
        Population.add(84432670);
        Population.add(216422446);
        Population.add(26439111);
        return Population;
    }

    public ArrayList<Double> Employee_Salary() {
        ArrayList<Double> Salary = new ArrayList<>();
        Salary.add(90000.87);
        Salary.add(200000.6);
        Salary.add(300000.67);
        Salary.add(120000.56);
        Salary.add(150000.87);
        Salary.add(50000.98);
        Salary.add(30000.89);
        Salary.add(70000.87);
        return Salary;
    }

    public static void main(String[] args) {
        ArrayList_Generics obj = new ArrayList_Generics();
        ArrayList<String> CountryName = obj.Country_Name();
        for (int i = 1; i < CountryName.size(); i++) {
            System.out.println("Printing Country Name : " + "    " + i + "-> " + CountryName.get(i));
        }
        for (String var : CountryName) {
            System.out.println(" Using Advance For Loop Printing Country Name : " + (var));
        }

        int m = 1;
        while (m < CountryName.size()) {
            System.out.println(" Using   While Loop Printing Country Name : " + CountryName.get(m));
            m++;
        }
        int j = 1;
        do {
            System.out.println(" Using  do While Loop Printing Country Name : " + CountryName.get(j));
            j++;
        }
        while (j < CountryName.size());
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
        for (int n = 1; n < salary.size(); n++) {
            System.out.println("Using For Loop Printing Salary are : " + salary.get(n));
        }
        int w = 1;
        while (w < salary.size()) {
            System.out.println("Using while loop Printing salary : " + salary.get(w));
            w++;
        }
        int e = 1;
        do {
            System.out.println("Using do while loop Printing salary are : " + salary.get(e));
            e++;
        } while (e < salary.size());


    }

}


