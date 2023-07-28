package conditional_statements;

    public class AssignmentIf {
        public static void main(String[] args) {
            //if statements
            //
            // marks greater or equal 60 :  first division
            // marks less than 33  : not cleared exam
            // price greater than 5000:  costly product
            // price less than 5000 : average price product
            // country : INDIA ----> You are indian
            //                 ----> you are not indian
            int marks = 60;
            if(marks ==  60);
            {
                System.out.println("Student get 1st Division");
            }
            int examMarks =32;
            if (examMarks<33){
                System.out.println("He is not cleared the Exam");
            }
            int price = 5000;
            if(price>5000);{
                System.out.println("Product is Costly");
            }
            int cost = 5000;
            if (cost<5000);{
                System.out.println("This is Average Price Product");
            }
            String country="India";
            if (country=="India");{
                System.out.println("You are Indian");
            }
            String countryname="Australia";
            if (countryname=="India");{
                System.out.println("You are not Indian");
            }

        }

    }

