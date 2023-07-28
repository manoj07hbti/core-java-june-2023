package arrays_demo;

public class DemoArray {

    public static void main(String[] args) {

        String name1="Raj";
        String name2="Ramehsh";
        String name3="Mohit";
        //SYNTAX : Datatype varName [] = {value1, value2,value3.......valune N};
        String names []={"Raj","Ramesh","Mohit","Jeetesh","Mukesh","Rahul"};

        //Reading array : varName[INDEX];

        System.out.println("Printing data at 1 index : "+names[1]);

        System.out.println("Printing data at 2 index : "+names[2]);

        // print all data of array

        for(int i=0; i<5; i++){

            System.out.println("Printing data at  index : "+i +" : "+names[i]);
        }

        for(int i=0; i<names.length; i++){

            System.out.println("Printing data at  index using length : "+i +" : "+names[i]);
        }

        // do this using while loop and do while loop

        // Advance loop : array or collection
        //SYNTAX : for (Datatype varName : arrayName){
        //   //CODE
        // }

        for(String var : names){

            System.out.println("Printing array using advanced loop : "+var);
        }

        int marks []={54,23,76,87,56,34,76,88};

        // apply all loops and print all the data

        for(int var : marks){

            System.out.println("Printing marks array :"+var);
        }

    }
}
