package conditional_statements;

public class Multipleconditionclass2 {
    public static void main(String[] args) {
     int age=18;
     String state="up";

     if (age>=18 & state=="up") {
     System.out.println("this is a eligible for voting");
     }
     else {
         System.out.println("this is not eligilble for voting");
     }

     state="mp";
     if (age>=18 & state=="up") {
         System.out.println("this is a person eligible for voting");
     }
     else {
         System.out.println("this is not a eligible for voting");
     }
     age=17;
     state= "up";
     if (age>=18 & state=="up") {
         System.out.println("this is a person eligible for voting");
     }
     else {
         System.out.println("this is not a eligible for voting");
     }

     age=17;
     state="mp";
     if(age>=18 & state=="up") {
         System.out.println("this is a person eligible for voting");
     }
     else {
         System.out.println("this is not a eligible for voting");

     }

    }
}
