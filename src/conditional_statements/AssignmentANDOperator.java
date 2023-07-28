package conditional_statements;

public class AssignmentANDOperator {

        public static void main(String[] args) {

            //brand = IBM &&   ram >=8    Print Good Configuration
            // 1.   TRUE && TRUE = TRUE     1*1= 1
            // 2.   TRUE && FALSE= FALSE    1*0= 0
            // 3.   FALSE && TRUE= FALSE    0*1= 0
            // 4.   FALSE && FALSE= FALSE   0*0= 0
            int ram = 8;
            String brand = "IBM";
            if (ram >= 8 && brand == "IBM") {
                System.out.println("Good Configuration");
            } else {
                System.out.println("Bad Configuration");
            }
            brand = "Dell";
            if (ram >= 8 && brand == "IBM") {
                System.out.println("Good Configuration");
            } else {
                System.out.println("Bad Configuration");
            }

            ram = 6;
            brand = "IBM";
            if (ram >= 8 && brand == "IBM") {
                System.out.println("Good Configuration");
            } else {
                System.out.println("Bad Configuration");
            }
            ram = 6;
            brand = "Dell";
            if (ram >= 8 && brand == "IBM") {
                System.out.println("Good Configuration");
            } else {
                System.out.println("Bad Configuration");
            }


        }
    }


