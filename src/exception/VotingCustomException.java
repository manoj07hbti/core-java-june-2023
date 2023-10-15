package exception;

public class VotingCustomException {

    public void voting(int age) throws AgeNotEligibleException {


        if (age < 18) {

            throw new AgeNotEligibleException("Candidate Age must be greater than or equal to 18..");

        } else {
            System.out.println("Candidate is eligible for Voting");
        }
    }

    public static void main(String[] args) {
        VotingCustomException obj = new VotingCustomException();

        try {
            obj.voting(19);
        } catch (Exception e) {
            System.out.println("Exception Occurred :" + e);
        }

    }

}
