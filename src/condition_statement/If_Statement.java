package condition_statement;

public class If_Statement {

    public static void main(String[] args) {
        int marks=75;
        if (marks>=60){
            System.out.println(" Printing marks First Division ");
        }

        if(marks>32){
            System.out.println("Printing Not Clear Exam  ");

        }
        int price=5500;
        if (price>5000) {
            System.out.println("Printing Price Costly Product  ");
        }
        if (price>4500){
            System.out.println("Printing average Price Product ");
        }
        String Country="India";
        if (Country=="India"){
            System.out.println("Printing I am Indian");
        }

        if (Country=="BHUTAN"){
            System.out.println("Printing I am not Indian");
        }

    }
}
