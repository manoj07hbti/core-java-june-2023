package conditionalstmt;

public class DemoAndOp1 {
        public static void main(String[] args) {
            int marks=65;
            String section="Science";

            //if(op && op && op)
            //true + true =true
            if (marks>=60 && section=="Science"){

                System.out.println("True Student got marks above 60% they belong science section");
            }else {

                System.out.println("false student below 60% or they not belong science section ");
            }
            //false + true = false
            marks=58;
            if (marks>=60 && section=="Science"){

                System.out.println("True Student got marks above 60% they belong science section");
            }else {

                System.out.println("false student below 60% or they not belong science section ");
            }
            //true + false=false
            marks=80;
            section="Arts";
            if (marks>=60 && section=="Science"){

                System.out.println("True Student got marks above 60% they belong science section");
            }else {

                System.out.println("false student below 60% or they not belong science section ");
            }
            //false + false =false
            marks=45;
            if (marks>=60 && section=="Science"){

                System.out.println("True Student got marks above 60% they belong science section");
            }else {

                System.out.println("false student below 60% or they not belong science section ");
            }





        }
    }


