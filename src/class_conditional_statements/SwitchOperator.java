package class_conditional_statements;

public class SwitchOperator {


    public static void main(String[] args) {


        int month = 11;

      /*  if(day==1){

            System.out.println("Monday..");
        }else if(day==2){
            System.out.println("Tuesday..");
        }else if(day==3){
            System.out.println("Wednesday..");
        }else if(day==4){
            System.out.println("Thursday..");
        }else if(day==5){
            System.out.println("Friday..");
        }else if(day==6){
            System.out.println("Saturday..");
        }else if(day==7){
            System.out.println("Sunday..");
        }*/

        switch (month) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;

            default:
                System.out.println("Please enter correct Month");

        }


    }
}