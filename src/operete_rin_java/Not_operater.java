package operete_rin_java;

public class Not_operater {

    public static void main(String[] args) {

        int age = 15;

        if (!(age > 18)) {

            System.out.println("Print ellegebal for voting");
        } else System.out.println("person not ellegebal for voting!");

        String city = "mumbai";

        if ((city != "delhi")) {
            System.out.println("belong to delhi");
        } else {
            System.out.println("not belong to delhi");
        }

        int price= 110;

        if (!(price >100)) {

            System.out.println("price is high");
        } else System.out.println("price is normal");

        String product = "facecrem";

        if (product == "facecrem") {
            System.out.println("this is for face");
        } else {
            System.out.println("this is not use for face");
        }
    }
}

