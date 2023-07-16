package conditional_statements;

public class DemoifDay01 {

    public static void main(String[] args) {

        //if statements
        // marks greater or equal 60 :  first division

        int mark = 60;

        if (mark >= 60) ;
        {

            System.out.println("Then the person has pass in first division");
        }
        int marks = 33;// marks less than 33  : not cleared exam

        if (marks > 30) ;
        {

            System.out.println("Then the person is not clear the exam");
        }
        int price = 5000;// price greater than 5000:  costly product

        if(price>5100) ;// price less than 5000 : average price product
        {

            System.out.println("Its Costly Product");
        }

        if(price<5000) ;
        {

            System.out.println("Its average product");
        }

        String country = "India"; // country : INDIA ----> You are indian
        //                 ----> you are not indian

        if(country == "India") {
            System.out.println("You are India");

        }

        String Continent = "USA";

        if(Continent=="USA"){
            System.out.println("Then you are not Indian");
        }
    }
}
