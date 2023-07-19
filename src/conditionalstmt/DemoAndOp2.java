package conditionalstmt;

public class DemoAndOp2 {


        public static void main(String[] args) {

            int age=19;
            String city="UP";
            if (age>=18 && city=="UP"){
                System.out.println("True: You are eligible for voting");
            }
            else {

                System.out.println("False:You are not eligible for voting ");
            }
            //condition2

            age=16;
            if (age>=18 && city=="UP"){
                System.out.println("True: You are eligible for voting");
            }
            else {

                System.out.println("False:You are not eligible for voting ");
            }


            //condition 3
            age=18;
            city="pune";
            if (age>=18 && city=="UP"){
                System.out.println("True: You are eligible for voting");
            }
            else {

                System.out.println("False:You are not eligible for voting ");
            }

            //condition 4
            age=15;
            if (age>=18 && city=="UP"){
                System.out.println("True: You are eligible for voting");
            }
            else {

                System.out.println("False:You are not eligible for voting ");
            }
        }

    }


