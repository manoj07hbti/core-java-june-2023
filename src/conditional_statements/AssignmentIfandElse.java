package conditional_statements;
public class AssignmentIfandElse {
    public static void main(String[] args) {

        //if and else
        //	if(marks >= 60)  first division 	else   not first division
        //
        //	 if(marks< 33) : not cleared exam  else: cleares exam

        int marks = 50;
        if (marks >= 60) {
            System.out.println("Student get first division");
        } else {
            System.out.println("Student not get first division");
        }
        int examMarks = 35;
        if (examMarks < 33) {
            System.out.println("He is not cleared the Exam");
        } else {
            System.out.println("He is cleared the Exam");
        }
    }

}