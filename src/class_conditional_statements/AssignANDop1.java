package class_conditional_statements;

public class AssignANDop1 {
    public static void main(String[] args) {
            int marks = 60;
            String section="ScienceDiv";

            //SYNTAX :if(condition1 op condition2 op condition3......){
            //TRUE & TRUE =TRUE
            // }


            if(marks>=60 && section == "ScienceDiv"){

                System.out.println("Student is Passed in Science Div");
            }else {

                System.out.println("Student is not Passed in Science Div");
            }

            // TRUE & FALSE =FALSE

        int marks2 = 60;
        String section2="ArtsDiv";

        if(marks2>=60 && section2 == "ScienceDiv"){

            System.out.println("Student is Passed in Science Div");
        }else {

            System.out.println("Student is not Passed in Science Div");
        }


        //FALSE & TRUE =FALSE
        int marks3 = 59;
        String section3="ScienceDiv";

        if(marks3>=60 && section3 == "ScienceDiv"){

            System.out.println("Student is Passed in Science Div");
        }else {

            System.out.println("Student is not Passed in Science Div");
        }


        //FALSE & FALSE =FALSE


        int marks4 = 59;
        String section4="ArtsDiv";

        if(marks4>=60 && section4 == "ScienceDiv"){

            System.out.println("Student is Passed in Science Div");
        }else {

            System.out.println("Student is not Passed in Science Div");
        }


        }

    }


