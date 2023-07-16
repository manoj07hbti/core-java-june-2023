package conditional_statements;

public class DemoifDay01 {

    public static void main(String[] args) {

        //if statements
        // marks greater or equal 60 :  first division
        // marks less than 33  : not cleared exam
        // price greater than 5000:  costly product
        // price less than 5000 : average price product
        // country : INDIA ----> You are indian
        //                 ----> you are not indian

        int mark = 60;

        if (mark >= 60) ;
        {

            System.out.println("Then the person has pass in first division");
        }
        int marks = 33;

        if (marks > 30) ;
        {

            System.out.println("Then the person is not clear the exam");
        }
        int price = 5000;

        if(price>5100) ;
        {

            System.out.println("Its Costly Product");
        }

        if(price<5000) ;
        {

            System.out.println("Its average product");
        }

        String country = "India";

        if(country == "India") {
            System.out.println("You are India");

        }

        String Continent = "USA";

        if(Continent=="USA"){
            System.out.println("Then you are not Indian");
        }
    }
}
