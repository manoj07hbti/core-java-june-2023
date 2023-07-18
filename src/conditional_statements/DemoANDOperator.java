package conditional_statements;

public class DemoANDOperator {

    public static void main(String[] args) {

        //True && True =True
        int cost = 2000000;
        String company = "Mahindra";
        if (cost>=2000000 && company=="Mahindra"){
            System.out.println("You will Buy Scorpio");
        } else {
            System.out.println("Yow will not Buy Scorpio");
        }

        //True && False = False
        company = "Tata";
        if (cost>=2000000 && company=="Mahindra"){
            System.out.println("You will Buy Scorpio");
        } else {
            System.out.println("You will not buy Scorpio");
        }

        //False && True = False
        cost = 1000000;
        if (cost>=2000000 && company=="Mahindra"){
            System.out.println("You will get Scorpio");
        } else {
            System.out.println("You will not get Scorpio");
        }

        //False && False = False
        cost=1000000;
        company="Tata";
        if (cost>=2000000 && company=="mahindra"){
            System.out.println("You will get Scorpio");
        } else {
            System.out.println("You will not get Scorpio");
        }

    }


}