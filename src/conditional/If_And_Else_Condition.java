package conditional;

public class If_And_Else_Condition {
    public static void main(String[] args) {
        String city = "Delhi";
        if (city=="Delhi"){
            System.out.println("Person belongs to Delhi");
        }else {
            System.out.println("Person does not belong to delhi");
        }
        //**************** ******************* ********************** ******************* **************//

        int age = 18;
        if(age>=18){
            System.out.println("Person eligible for voting");
        }else {
            System.out.println("Person is not eligible for voting");
        }
        //**************  ********************* ***********  ******************** ******************* //

        city = "Agra";
        if (city=="Delhi"){
            System.out.println("Person belongs to Delhi");
        }else {
            System.out.println("Person does not belong to Delhi");
        }
       // *************** ******************** ********************* ******************* *************//
         age = 17;
        if(age>=18){
            System.out.println("Person eligible for voting"+age);
        }else {
            System.out.println("Person is not eligible for voting "+age);
        }
        //************* ****************** ******************** ********************** ******************//

        int mark = 60;
        if (mark>=60){
            System.out.println("The student got first division"+mark);
        }else {
            System.out.println("The student did not first division");
        }
        //************* ***************** ******************** ****************** ***********************//
         mark = 50;
        if (mark>=60){
            System.out.println("The student got first division"+mark);
        }else {
            System.out.println("The student did not get first division"+mark);
        }
    }
}
