package class_conditional_statements;

public class IFday3 {

    public static void main(String[] args) {
        //SYNTAX : if(condition){ code to be executed } else {}

        int marks=64;

        if (marks >= 60){

            System.out.println("First Division");
        }
        if (marks<33)
        {
            System.out.println("Not Cleared Exam");
        }


        int price=4000;

        if(price>=5000){

            System.out.println("Product Price is Costly");
        }
        if (price<5000)

        {
            System.out.println("Product Price is Average");
        }

        String CountryName="Europe";
        if(CountryName=="India"){

        System.out.println("You are Indian");

        }
        if(CountryName!="India"){

            System.out.println("You are not Indian");
        }
    }


}
