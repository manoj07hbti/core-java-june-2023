package conditional_statements;

public class DemoIfAndElse {

    //if and else
    //	if(marks >= 60)  first division 	else   not first division
    //
    //	 if(marks< 33) : not cleared exam  else: clear exam
    public static void main(String[] args) {

        int mark=60;

        if(mark>=60) {
            System.out.println("You are pass with first division");
        } else {
            System.out.println("You are not pass with first division");
        }
int marks = 33;
        if (mark<33){
            System.out.println("Has not clear the exam");
        } else {
            System.out.println("Has clear the exam");
        }
    }
}
