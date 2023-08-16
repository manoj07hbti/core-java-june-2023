package methods;

public class DemoInputParameter {

   /*TODO  access_specifier return_type  method_name (Datatype varName..) {
        CODE..   }*/

    public void findEvenOdd(int number){

        if(number%2==0){
            System.out.println("Number is even number "+number);
        }else {
            System.out.println("Number is odd Number "+number);
        }

    }

    public void checkVoteEligibility(String city, int age){

        if(city=="Pune" && age>= 18){

            System.out.println("Eligible for voting in Pune");
        }else {
            System.out.println("Not Eligible for voting in Pune");
        }

    }

    public void calculateDivision(String section,int number,int rollNumber,String name){

        double result = (double)  (number*100)/600;

        System.out.println(" % is  "+result);

        if(result>=60){

            System.out.println(" Student "+name +" roll number "+rollNumber+" got first division in section "+section);
        }

    }

    public static void main(String[] args) {
        DemoInputParameter obj= new DemoInputParameter();
        obj.findEvenOdd(3);
        obj.findEvenOdd(12);
        obj.findEvenOdd(13);

        obj.checkVoteEligibility("Pune",19);

        obj.checkVoteEligibility("Pune",17);

        obj.calculateDivision("CS",300,1,"Raj");

        obj.calculateDivision("CS",400,1,"Rohit");

    }

}
