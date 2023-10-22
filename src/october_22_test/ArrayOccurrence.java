package october_22_test;

public class ArrayOccurrence {

    public static void main(String[] args) {
            int [] arr = new int [] {1, 2, 3, 1, 4, 5, 2, 3, 2, 5, 5, 2, 7, 8};
            /**Array arr1 will store frequencies of element*/
            int [] arr1 = new int [arr.length];
            int visitedElement = -1;
            for(int i = 0; i < arr.length; i++){
                int count = 1;
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        /**To avoid counting same element again*/
                        arr1[j] = visitedElement;
                    }
                }
                if(arr1[i] != visitedElement)
                    arr1[i] = count;
            }
            System.out.println("---------------------------------------");
            System.out.println(" Element | Occurrence");
            System.out.println("---------------------------------------");
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != visitedElement)
                    System.out.println("    " + arr[i] + "    |    " + arr1[i]);
            }
            System.out.println("----------------------------------------");
        }}


