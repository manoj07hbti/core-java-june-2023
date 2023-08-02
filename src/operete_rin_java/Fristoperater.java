package operete_rin_java;

public class Fristoperater {

    public static void main(String[] args) {


        // TRUE/TRUE OPERATER

        int marks = 60;
        String Subject = "science";
        if (marks >= 60 && Subject == "science") {


            System.out.println("TRUE student is science baground");
        } else {
            System.out.println(" student is not science baground");
        }
// TRUE AND FALSE STATMENT
marks = 55;
        Subject = "science";
        if (marks >= 60 && Subject == "science") {


            System.out.println("TRUE:student is science baground");
        } else {
            System.out.println("false: student is not science baground");
        }

// FALSE AND TRUE STATMENT
        marks = 65;
        if (marks >= 60 && Subject == "art") {


            System.out.println("TRUE:student is science baground");
        } else {
            System.out.println("false: student is not science baground");
        }
// FALSE && FALSE STATMENT

        Subject = "art";
        marks = 55;
        if (marks >= 60 && Subject == "art") {

            System.out.println("TRUE:student is science baground");
        } else {
            System.out.println("false: student is not science baground");
        }

        // TRUE && TRUE = TRUE

        int age = 18;
        String State = "uttar pradesh";
        if (State == "uttar pradesh" && age >= 18) {

            System.out.println("TRUE: Person ellegibal for voting in uttar pradesh");

        } else {
            System.out.println("FALSE:Person is not ellegebal for voting");
        }
// TRUE && FALSE = FALSE
        age = 18;
        State = "uttar pradesh";
        if (State == "maharastra" && age >= 18) {

            System.out.println("TRUE: Person ellegibal for voting in uttar pradesh");

        } else {
            System.out.println("FALSE:Person is not ellegebal for voting");
        }
        // FALSE && TRUE = FALSE
        age = 17;
        State = "uttar pradesh";
        if (State == "uutar pradesh" && age >= 18) {

            System.out.println("TRUE: Person ellegibal for voting in uttar pradesh");

        } else {
            System.out.println("FALSE:Person is not ellegebal for voting");
        }
        //FALSE && FALSE = FALSE
        age = 17;
        State = "uttar pradesh";
        if (State == "maharastra" && age >= 18) {

            System.out.println("TRUE: Person ellegibal for voting in uttar pradesh");

        } else {
            System.out.println("FALSE:Person is not ellegebal for voting");
        }

    }
}