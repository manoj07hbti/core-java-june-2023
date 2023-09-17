package collection.arraylist;

import java.util.ArrayList;

public class AssignmentArraylist {


    public void cityNames()
    {
        ArrayList nameofCity=new ArrayList<>();

        nameofCity.add("Kolhapur");
        nameofCity.add("Nashik");
        nameofCity.add("Satara");
        nameofCity.add("Pune");
        nameofCity.add("Karad");


        nameofCity.add("Agra");
        nameofCity.add("Delhi");
        nameofCity.add("Jaipur");
        nameofCity.add("Surat");
        nameofCity.add("Kanpur");

        nameofCity.add("Panhala");
        nameofCity.add("Jothiba");
        nameofCity.add("Sangli");
        nameofCity.add("YavatMal");
        nameofCity.add("Kagal");


        nameofCity.add("Jaisingpur");
        nameofCity.add("Warana");
        nameofCity.add("Belgum");
        nameofCity.add("Gokarn");
        nameofCity.add("Murdeshwer");


        System.out.println();
        System.out.println("............using for...........");
        for (int i=0;i<nameofCity.size();i++)
        {
            System.out.println("NAme of cities are: " +nameofCity.get(i));
        }

        System.out.println();
        System.out.println("............using do while...........");

        int i=0;
        do {
            System.out.println("Name of cities  are  " +nameofCity.get(i));
            i++;
        }while (i< nameofCity.size());

        System.out.println();
        System.out.println("...........using while ............");
        i=0;
        while (i< nameofCity.size())
        {
            System.out.println("name of cities are " +nameofCity.get(i));
            i++;
        }
        System.out.println();
        System.out.println(" before Removing data");



        System.out.println(" "+nameofCity.get(18));
        System.out.println(" "+nameofCity.get(17));
        System.out.println(" "+nameofCity.get(5));

        System.out.println("Removing data");
        nameofCity.remove(18);
        nameofCity.remove(17);
        nameofCity.remove(5);
        i=0;
        while (i< nameofCity.size())
        {
            System.out.println("name of cities are " +nameofCity.get(i));
            i++;
        }


    }
    public static void main(String[] args) {
        AssignmentArraylist obj=new AssignmentArraylist();
        obj.cityNames();

    }
}
