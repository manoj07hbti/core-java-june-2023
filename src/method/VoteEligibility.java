package method;

public class VoteEligibility {

    public void checkVoterEligibility(){
        String city="Agra";
        int age=22;
        if (age>=18&&city=="Agra"){
            System.out.println("Voter is Eligible for cast the Vote in Agra");
        }else {
            System.out.println("Voter is not Eligible for cast the Vote in Agra");
        }
    }

    public static void main(String[] args) {
        VoteEligibility obj=new VoteEligibility();
        obj.checkVoterEligibility();
    }
}
