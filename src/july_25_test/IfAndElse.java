package july_25_test;

public class IfAndElse {

    public static void main(String [] args ){
        int age = 18;
        String city = "Pune";

        if ( age > 17 && city =="Pune" ){

            System.out.println("Eligible for voting in pune.");

        }else if (age > 17 && !(city=="Pune")){
            System.out.println(" Not Eligible for voting in pune.");
        }

    }
}
