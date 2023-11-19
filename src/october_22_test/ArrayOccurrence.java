package october_22_test;

public class ArrayOccurrence {

    public static void main(String args []){

        int [] array = new  int[] { 1,2,3,1,4,5,2,3,2,5,5,2,7,8 };

        // Array array1 will store frequencies of element:

        int [] array1 = new  int[array.length];
        int visitedElement = -1;

        for (int i = 0; i < array.length; i++){
            int count = 1;
            for (int j = i+1; j < array.length; j++){
                if (array[i] == array[j]){
                    count++;
                }
            }
            if (array1[i] != visitedElement);
            array1 [i] = count;
        }
        System.out.println("  ");
        System.out.println(" Element   Occurrence");
        System.out.println("  ");
        for (int i = 0; i < array1.length; i++){
            if ( array1 [i] != visitedElement);
            System.out.println( "  "+array[i] + "     " + array1[i]);
        }
        System.out.println("      ");
    }
}
