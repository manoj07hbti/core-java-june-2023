package method;

public class PercentageMethod {
    //TODO Write a code to find a percentage
    // TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}

    public void findPercentage(){

        double number=500;
        double percentage=500*5/100;
        System.out.println("Percentage of "+number+" is "+percentage+"%");

    }

    public static void main(String[] args) {
        PercentageMethod obj=new PercentageMethod();
        obj.findPercentage();
    }
}
