package loop_working;

public class DemoBreak {

    public static void main(String[] args) {


        for (int i=1; i<=10; i++){

            if(i==7){
                break;
            }
            System.out.println("This is for loop ..."+i);

        }


        int arr[]={1,2,3,4,5,6,7,8,9,10};

        //find 4 in given array and it's position

        for(int var: arr){
            System.out.println("Finding number 4 in Array , checking: "+var);
            if(var==4){
                System.out.println("Given number 4 is found ");
                break;
            }
        }

    }
}
