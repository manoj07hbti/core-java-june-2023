package conditional_statements;

public class DemoNotOperator {
    public static void main(String[] args) {
        int age = 15;
        if (!(age < 18)) {
            System.out.println("You are Eligible for Voting");
        } else {
            System.out.println("You are not Eligible for Voting");
        }
        String city = "Agra";
        if (!(city != "Mumbai")) {
            System.out.println("You belongs to Mumbai");
        } else {
            System.out.println("You do not belongs to Mumbai");
        }
    }
}