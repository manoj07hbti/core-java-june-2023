package condition_statement;

public class Nested_Statement {
    public static void main(String[] args) {
        int number=10;
        if (number%3==0 ){
            System.out.println("Number is by 3  Divide " +number);
        }else {
            System.out.println("Number is not by 3 Divide " +number);
        }if (number%5==0){
            System.out.println("Number is by 5  Divide " +number);

        }else {
            System.out.println("Number is not by 5 Divide " +number);
        }if(number%4==0) {
            System.out.println("Number is by 4  Divide " + number);
        } else
                {
                   System.out.println("Number is by 4  Divide " +number);

               } int age =20;
            String Gender="Male";
            if (age>18){
                System.out.println("You are eligible");
                if (Gender=="male"){
                    System.out.println("You are invited");
                }else {
                    System.out.println("You are not invited");
                }
            } else {
                System.out.println("You are not eligible");
            }
        }
    }


