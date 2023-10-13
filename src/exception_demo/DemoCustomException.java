package exception_demo;

public class DemoCustomException {

    public void voting(int age) throws AgeNotEligibleException {

        if(age<18){
            throw new AgeNotEligibleException("Candidate age must be greater than or equal to 18");
        }else {
            System.out.println("Welcome to Voting System.....");
        }
    }

    public static void main(String[] args) {
        DemoCustomException obj= new DemoCustomException();
        try {
            obj.voting(17);
        }
        catch(Exception e){
            System.out.println("Exception occurred : "+e);
        }

    }
}
