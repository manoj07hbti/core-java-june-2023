package array_demo_day1;

public class Demo_array {
    public static void main(String args[]) {

        String name1 = "Rohan";
        String name2 = "Mohit";
        String name3 = "Sobhit";
        String name4 = "Rahul";
        String name5 = "Sohan";

        String names[] = {"Rohan", "Mohit", "Sobhit", "Rahul", "Sohan"};

        System.out.println("printing data in one index   :" + names[1]);

        System.out.println("printing data in one index   :" + names[2]);

        for (int i = 1; i <= names.length; i++) {
            System.out.println("Printing data in on index  :"+names[1]);

        }

        for (String var: names){
            System.out.println("Printing array using advanced loop  :"+var);
        }





        double price1 = 78.96;
        double price2 = 89.56;
        double price3 = 45.67;
        double price4 = 34.89;
        double price5 = 45.67;

        double prices[]={78.96,89.56,45.67,34.89,45.67};
        System.out.println("Printing data in one index  "+prices[1]);
        System.out.println("Printing data in one index  "+prices[2]);



        for (double i = 1; i <= prices.length; i++){
            System.out.println("Printing data in index  :"+prices[1]);

        }

        for (double var : prices){

            System.out.println("Printing array using advanced loop  :"+var);
        }


        int i = 0;
        do {
            System.out.println(prices [i]);
            i++;
        }while (i<=prices.length);


    }

}