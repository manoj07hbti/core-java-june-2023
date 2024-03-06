package test_22october;

public class Demo_Occurrence {

    public static void main(String[] args) {

        int [] arr = {1,2,3,1,4,5,2,3,2,5,5,2,7,8};
        System.out.println("Duplicate Elements In Given in Array");

        for (int i = 0 ;i<arr.length;i++){

            for (int j = i+1 ; j<arr.length;j++){

                if (arr[i]==arr[j]){

                    System.out.println(arr[i] );
                    break;
                }
                }

            }
        }
    }

