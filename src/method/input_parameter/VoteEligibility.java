package method.input_parameter;

public class VoteEligibility {

    // TODO write a code to check the voter eligibility
    // TODO  Syntax : access_specifier return_type  method_name (Datatype varName....) { CODE..}

    public void checkVoteEligibility(int age, String city) {
        if (age >= 18 && city == "Agra") {
            System.out.println("Voter is Eligible for Cast the Vote ");
        } else {
            System.out.println("Voter is NOT Eligible for Cast the Vote ");
        }
    }

    public static void main(String[] args) {
        VoteEligibility obj = new VoteEligibility();
        obj.checkVoteEligibility(19, "Agra");
        obj.checkVoteEligibility(19, "Delhi");
    }

}
