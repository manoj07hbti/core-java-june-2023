package collections;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;

public class Collection_demo {

    public void createList(){    // (FIST CREATE A METHODE..)

        //SYNTAX : ArrayList objName= new ArrayList(); CREATE A OBJECT....)

        ArrayList list = new ArrayList();

        list.add("Ajay");      // INDEX.0 - ( LIST INDEX NUMBER ALWAYS START AT 0 ... )
        list.add("Deepa");     // INDEX.1
        list.add("Suman");     // INDEX.2
        list.add("Tannu");     // INDEX.3
        list.add("Mohini");    // INDEX.4
        list.add("Laxmi");
        list.add("Pooja");
        list.add("Madhu");
        list.add("Komal");
        list.add("Hemant");
        list.add("Dev");
        list.add("Divya");
        list.add("Suraj");
        list.add("Kajal");

        // ( AFTER ADDING THE DATA , IT IS READ.)
        // ( LIST.GET USE FOR READ. )
        System.out.println(list.get(2));

         // (PRINT ALL ELEMENT OF ARRAYLIST..)
        for (int i = 0 ; i < list.size();i++) {  // SIZE < TOLD US List.size. IT WILL GIVE US SIZE OF LIST

            System.out.println("Using for loop .. " + list.get(i) +  " - at index " + i );

        }
        // PRINTING WITH WHILE LOOP..

         int j = 0;
        while (j < list.size()){
            System.out.println("Printing list in while loop .. " + list.get(j)+  " - at index " + j);
            j++;
        }

        // PRINTING WITH ADVANCE LOOP..


        for (Object var : list){ // OBJECT DATA TYPE IS PARENTS CLASS. ALL DATA INCLUDE IN OBJECT

            System.out.println("Printing for Advance loop " + var );
        }

        // HOW TO DELETE THE DATA.

        list.remove(1);

        for (int i = 0 ; i < list.size();i++) {

            System.out.println(" After Remove Using for loop .. " + list.get(i) + " - at index " + i);

        }

        }

    public static void main(String[] args) {

        Collection_demo obj = new Collection_demo();
        obj.createList();
    }
}
