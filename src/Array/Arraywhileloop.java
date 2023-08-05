package Array;

public class Arraywhileloop {
    public static void main(String[] args) {

        String name1 = "Rohan";
        String name2 = "Ashwin";
        String name3 = "Vedant";
        String name4 = "Tushar";

        //SYNTAX : Datatype varName [] = {value1, value2,value3.......valune N};


        String names[] = {"Rohan", "Ashwin", "Vedant", "Tushar", "Rahul"};


        //Reading array : varName[INDEX];

        System.out.println("Printing data at 1 index : " + names[0]);
        System.out.println("Printing data at 2 index : " + names[1]);
        System.out.println("Printing data at 2 index : " + names[2]);
        System.out.println("Printing data at 2 index : " + names[3]);
        System.out.println("Printing data at 2 index : " + names[4]);

/// print array
        for (int i = 0; i <= 4; i++) {
            System.out.println("Printing data at  index : " + i + " : " + names[i]);
        }

/// new way to length (i<=name.length)
        for (int i = 0; i < names.length; i++) {
            System.out.println("Printing data at  index using length : " + i + " : " + names[i]);

        }
///

        int i = 0;
        while (i <= 4) {
            System.out.println("Printing data at index using while loop : " + i + ":" + names[i]);
            i++;
        }
// String var :names
        for(String var : names){

            System.out.println("Printing array using advanced loop : "+var);
        }
    }
}