   package method;

public class Object {

    public void checkVotingEligibilty() {

        int age = 20;
        String cityName = "mumbai";

        if (age >= 18 && cityName == "mumbai") {

            System.out.println("print person elligebal for voting");

        } else {
            System.out.println("print voter not elligibal for voting");
        }
    }

    public void arrayName() {

        String[] Name = {"rahul", "uday", "sonu", "systum"};


        for (int i = 0; i < 3; i++) {

            System.out.println("print array name:" + Name[i]);

        }
    }
    public void weekDay() {
        int day=3;

            switch (day) {

                case 1:
                    System.out.println("monday");
                    break;
                case 2:

                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:

                    System.out.println("tharsday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:

                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                    break;
                default:

                    System.out.println("plese enter valid day");
                    break; }
        }

        public void studentResult(){

        int marks=60;
        String subject= "english";
        if (marks>=33 && subject=="englsh"){

            System.out.println("True: statment");
        }else {
            System.out.println("True: statment");
        }
        marks=30;
        if (marks<30 && subject=="math"){

            System.out.println("false: statment");
        }else {
            System.out.println("False: statment");

        }
        }
    public static void main(String[] args) {
        Object Object = new Object();
        Object.checkVotingEligibilty();
        Object.arrayName();
        Object.weekDay();
Object.studentResult();
    }
}
