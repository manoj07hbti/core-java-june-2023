package test_25_07_2023_java;

public class Voting_ellegibilty {

    public static void main(String[] args) {

        int age =18;
        if (age> 0) {

            if (age >= 18) {

                System.out.println("print person ellegibal for voting");
            } else {
                System.out.println("print person not ellegebal for voting");
            }
            String cityname = "pune";


            if (cityname == "pune") {

                System.out.println("print person belong to pune");
            } else {
                System.out.println("person is not bellong to pune");
            }
        }else {
            System.out.println("print vailid number");
        }
    }
}