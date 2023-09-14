package collection.generic_arraylist;

import collection.model.Engineer;

import java.util.ArrayList;
import java.util.Scanner;

public class EngineerArrayList {
    static ArrayList<Engineer> engineerArrayList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String flag = "y";
        while (flag.equals("y")) {
            System.out.println("Please enter engineer name: ");
            String name = scanner.nextLine();

            System.out.println("Please enter engineer id: ");
            String id = scanner.nextLine();

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter engineer salary: ");
            int salary = scanner1.nextInt();

            Engineer engineer = new Engineer(name, id, salary);
            engineerArrayList.add(engineer);

            System.out.println("Press Y to continue........and any key to Exit");
            Scanner scanner3 = new Scanner(System.in);
            flag = scanner3.nextLine();

        }
        int i = 0;
        for (Engineer engineer : engineerArrayList) {
            System.out.println("Data Created As : " + engineer.getEngName() + "|" + "Id is : " + engineer.getEngID() + "|" + engineer.getSalary() + " at INDEX " + i);
            i++;

        }
    }

}


