package condition_statement;

public class If_else_Statement {
    public static void main(String[] args) {

        int marks=60;
        if(marks>=60){
            System.out.println("Printing Fist Division Grater Than 60 marks:  ");

        }
        if (marks<33) {
            System.out.println("Printing Third Division 33 Marks Only Pass Marking: ");
        }
        else
        {
                System.out.println("Printing 33 Marks less than Not Clear Exam:");
            }
        int price=5500;
        if (price>=5000){
            System.out.println("Printing Costly Product prince than 5000Rs Grater than: ");
        }
        else {
            System.out.println("Printing Less Than 5000 RS Price is Average :");
        }
        if (price<4999){
            System.out.println("Printing Costly Price:");
        }
        else
        {
            System.out.println("Printing Average Price");
        }
        String Country_Name="India";
        if(Country_Name=="India"){
            System.out.println("Printing I am Indian : ");
        }else {
            System.out.println("Printing I am not Indian : ");
        }
        if (Country_Name=="Bhutan"){
            System.out.println("Printing I am Indian Cityzen :");
        }else {
            System.out.println("Printing I am Not Indian");
        }


    }
}

