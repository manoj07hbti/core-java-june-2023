package conditional_statements;

public class DemoSwitch {

    public static void main(String[] args) {

        int day=-1;

      /*  if(day==1){

            System.out.println("Monday..");
        }else if(day==2){
            System.out.println("Tuesday..");
        }else if(day==3){
            System.out.println("Wed..");
        }else if(day==4){
            System.out.println("Thursday..");
        }else if(day==5){
            System.out.println("Friday..");
        }else if(day==6){
            System.out.println("Saturday..");
        }else if(day==7){
            System.out.println("Sunday..");
        }*/

        switch (day){
            case 1:
                System.out.println("Monday..");
                break;
            case 2:
                System.out.println("Tuesday..");
                break;
            case 3:
                System.out.println("Wed..");
                break;
            case 4:
                System.out.println("Thursday..");
                break;
            case 5:
                System.out.println("Friday..");
                break;
            case 6:
                System.out.println("Saturday..");
                break;
            case 7:
                System.out.println("Sunday..");
                break;

            default:
                System.out.println("Please enter correct day of week ..");



        }


    }
}
