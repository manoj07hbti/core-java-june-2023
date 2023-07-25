package july_25_test;

public class July_25_test {
    public static void main(String[] args) {


        double number = 500;
        double percentage = 500 * 5 / 100;
        System.out.println("the percentage value of 500 at 5% is : " + percentage);

        int age = 75;
        String city = "pune";
        if (age >= 18 && city == "pune") {
            System.out.println("person is eligible for voting in pune");
        } else {
            System.out.println("person is not eligible for voting in pune");
        }

        int a = 100;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("printing the even number id : " + i);
            }

        }
        number=300;
        for(int i=1; i<=300; i++){
            if(i%3==1){
                System.out.println("printing the value of odd number 300 is : " + i);
            }
        }


    }
}



