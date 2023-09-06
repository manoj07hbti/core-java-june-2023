package collection;

import java.util.ArrayList;

public class AssignmentArraylistGeneric {


    public ArrayList<String>  countryName()
    {
        ArrayList<String> cn=new ArrayList<>();
        cn.add("India");
        cn.add("Bangladesh");
        cn.add("United state");
        return cn;
    }

    public ArrayList<Long> population()
    {

        ArrayList<Long> p=new ArrayList<>();
        p.add(8564852L);
        p.add(185624752L);
        p.add(785236465L);

        return p;

    }

    public  ArrayList<Double> salary()
    {
        ArrayList<Double> s=new ArrayList<>();
        s.add(50000.0);
        s.add(85000.0);
        s.add(1500000.58);
        return s;
    }
    public static void main(String[] args) {

        AssignmentArraylistGeneric arraylistGeneric=new AssignmentArraylistGeneric();
         ArrayList<String> names= arraylistGeneric.countryName();
         ArrayList<Long> population=arraylistGeneric.population();
         ArrayList<Double> sal=arraylistGeneric.salary();

        System.out.println();
        System.out.println("...............Using for loop..........");
        for (int i=0;i< names.size();i++)
        {

            System.out.println(" " +names.get(i));
        }
        System.out.println();
        System.out.println("...............Using while loop..........");
        int i=0;
        while (i< names.size())
        {
            System.out.println(" "+names.get(i));
            i++;
        }

        System.out.println();
        System.out.println("...............Using do while loop..........");
       i=0;
        do {
            System.out.println(" "+names.get(i));
            i++;
        }while (i< names.size());
        System.out.println();
        System.out.println("...............Using Advanced for loop..........");
        for (String var:names)
        {
            System.out.println(" "+var);
        }

        System.out.println();
        System.out.println("Population method");

        System.out.println("...............Using for loop..........");

        for (i=0;i< population.size();i++)
        {
            System.out.println(" "+population.get(i));
        }

        System.out.println();
        System.out.println("...............Using while loop..........");
        i=0;
        while (i< population.size())
        {
            System.out.println(" "+population.get(i));
            i++;
        }

        System.out.println();
        System.out.println("...............Using do while loop..........");
    i=0;
        do {
            System.out.println(" "+population.get(i));
            i++;
        }while (i< population.size());


        System.out.println();
        System.out.println("...............Using Advanced for loop..........");
        for (Long var:population)
        {
            System.out.println(" "+var);
        }



        System.out.println();
        System.out.println("Salary method");
        System.out.println("...............Using for loop..........");

        for ( i=0;i< sal.size();i++)
        {
            System.out.println(" "+sal.get(i));
        }
        System.out.println();
        System.out.println("...............Using while loop..........");
        i=0;
        while (i< sal.size())
        {
            System.out.println(" "+sal.get(i));
            i++;
        }
        System.out.println();
        System.out.println("...............Using do while loop..........");
        i=0;
        do {
            System.out.println(" "+sal.get(i));
            i++;
        }while (i< sal.size());
        System.out.println();
        System.out.println("...............Using Advanced for loop..........");
        for (Double var:sal)
        {
            System.out.println(" "+var);
        }


    }
}
