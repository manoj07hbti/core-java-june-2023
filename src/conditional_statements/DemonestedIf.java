package conditional_statements;

public class DemonestedIf {
    public static void main(String[] args) {

    int marks=69;
    String stream="Science";

    /// TRUE && TRUE =  TRUE ////

    if (marks>=60 & stream=="Science") {
    System.out.println("THIS STUDENT IS BRIGHT FUTURE");
    }
    else {
        System.out.println("THIS STUDENT IS NOT BRIGHT FUTURE");
    }

        /// TRUE && FALSE =  FALSE ////
        stream="Art";
        if (marks>=60 & stream=="Science") {
            System.out.println("THIS STUDENT IS BRIGHT FUTURE");
        }
        else {
            System.out.println("THIS STUDENT IS NOT BRIGHT FUTURE");
        }

        /// FALSE && TRUE =  FALSE ////

        marks=55;

        if (marks>=60 & stream=="Science") {
            System.out.println("THIS STUDENT IS BRIGHT FUTURE");
        }
        else {
            System.out.println("THIS STUDENT IS NOT BRIGHT FUTURE");
        }

        /// FALSE && FALSE =  FALSE ////

        marks=55;
        stream = "Art";

        if (marks>=60 & stream=="Science") {
            System.out.println("THIS STUDENT IS BRIGHT FUTURE");
        }
        else {
            System.out.println("THIS STUDENT IS NOT BRIGHT FUTURE");
        }

    }

}
