package july_25test;

public class Eligibility {
    public static void main(String[] args) {

        int age = 21;
        String city = "Pune";
        if (age > 19 && city == "Pune") {
            System.out.println("eligible for voting in Pune ");

        } else if (!(age > 19) && city == "Pune") {
            System.out.println("not eligible for voting in Pune");

        }
    }
}