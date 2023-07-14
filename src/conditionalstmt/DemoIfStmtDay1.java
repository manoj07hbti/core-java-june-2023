package conditionalstmt;

public class DemoIfStmtDay1 {

    public static void main(String[] args) {


        //syntax:if(condition/expression)
        //{
        //code
        //}
//int marks=25;
        int marks=65;
        if(marks>=60)
        {
            System.out.println("You got First Division");

        }

        if(marks<33)
        {
            System.out.println("You have not cleared the exam");
        }

        int price=6524;
        if (price>=5000)
        {
            System.out.println("Product is very costly");
        }
        if (price<=5000)
        {
            System.out.println("product is average");
        }

       String countryName="India";
       // String countryName="USA";
        if (countryName=="India")
        {
            System.out.println("you are Indian");
        }

    }
}
