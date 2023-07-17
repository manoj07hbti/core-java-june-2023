package conditional_package;

public class if_Class {
    public static void main(String[] args) {
        // SYNTAX:
        //  if(expression/condition){
        //      //CODE
        //      }

        int marks= 60;
                if(marks <= 60) {
                    System.out.println("Person got first division");
                }

                int marks_1=33;
                if(marks_1 <23){
                    System.out.println("passed");
                }else{
                    System.out.println("not passed");

                }

                int price = 5000;
                if (price < 6000){
                    System.out.println("product is costly");
                }else{
                    System.out.println("product is average price");
                }

                String country = "india";
                if (country.equals("japan")){
                    System.out.println("i am an indian");
                }else{
                    System.out.println("i am not an indian");
                }
    }

}
