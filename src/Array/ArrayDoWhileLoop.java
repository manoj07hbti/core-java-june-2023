package Array;

public class ArrayDoWhileLoop {
    public static void main(String[] args) {

        int i=0;
        String name1 = "Rohan";
        String name2 = "Ashwin";
        String name3 = "Vedant";
        String name4 = "Tushar";

        //SYNTAX : Datatype varName [] = {value1, value2,value3.......valune N};


        String names[] = {"Rohan", "Ashwin", "Vedant", "Tushar", "Rahul"};
    do {

        System.out.println("Printing data at index using do while loop : " + i + ":" + names[i]);
        i++;
    } while (i<=4);
        for(String var : names){

            System.out.println("Printing array using advanced loop : "+var);
        }
}


}
