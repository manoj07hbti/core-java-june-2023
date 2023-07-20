package condition_statement;

public class NOT_Operator_Statement {
    public static void main(String[] args) {
        int age=18;
        String Gender="Male";
        if (!(age<20)){
            System.out.println("TRUE :This is valid Voting ");
        }else {
            System.out.println("FALSE :This is not valid Voting ");

        } Gender="Female";
        if (!(Gender=="Male")){
            System.out.println("TRUE : THis is Valid person ");
        }else {
            System.out.println(" FALSE : This is not Valid person ");
        }
    }
}
