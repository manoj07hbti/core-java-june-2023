package condition_statement;

public class AND_Operator_Statement {
    public static void main(String[] args) {
        int mathsMarks = 60;
        String section = "Science Arts";
        if (mathsMarks >= 60 && section == "Science Arts") {
            System.out.println("Printing Maths Marks and Science Arts are true");
        } else {
            System.out.println("Printing Maths Marks and Science Arts are false");

        }
        section = "Science Maths";
        if (mathsMarks >= 60 && section == "Science Arts") {
            System.out.println("Printing Maths Marks and Science Arts are true");
        } else {
            System.out.println("Printing Maths Marks and Science Arts are false");
        } mathsMarks=55;
        if (mathsMarks>=65){
            System.out.println("Printing Maths Marks and Science Arts are true");

        }else {
            System.out.println("Printing Maths Marks and Science Arts are false");

        }mathsMarks=55;
        section="Science Group";
        if (mathsMarks>=60  && section=="Science Arts"){
            System.out.println("Printing Maths Marks and Science Arts are true");

        }else {
            System.out.println("Printing Maths Marks and Science Arts are false");


        }
    }
}