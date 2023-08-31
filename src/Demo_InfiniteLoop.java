public class Demo_InfiniteLoop {

    // if we give  condition is always true in loops then loop will not   stop running(यदि हम लूप में कंडिशन हमेशा सत्य देते हैं तो लूप चलना बंद नहीं करेगा)
    public static void main(String[] args) {

        for (int i = 1; i > 0; i++){

            System.out.println("Printing infinite loos "+i);
        }


        int j =1;
        while (j > 0){

            System.out.println("printing while infinite loop.. "+j);
            j++;
        }
    }
}
