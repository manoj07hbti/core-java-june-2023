package method;
public class DemoMethod {

        //TODO : find even number or odd number
//Syntax : access_specifier return_type  method_name (parameter) {CODE..}
        public void findEvenOdd(){
            int number=10;

            if(number%2==0){

                System.out.println("Even number found:"+number);
            }else {

                System.out.println("Odd number found:"+number);
            }

        }

        // TODO write a code which can make square of any number

        public void makeSquare(){
            int number=3;

            System.out.println("Square of given number is: "+number*number);

        }

        // TODO write a code to check eligible voter in Pune city

        public void checkVoteEligibility(){

            String city="Pune";
            int age=22;

            if(age>=18 && city=="Pune"){

                System.out.println("Person is eligible for voting in Pune...");
            }else {
                System.out.println("Person is NOT eligible for voting in Pune...");
            }

        }

        public static void main(String[] args) {

            DemoMethod obj= new DemoMethod();
            obj.findEvenOdd();

            obj.makeSquare();

            obj.checkVoteEligibility();
        }
    }


