package conditional_statement;

public class Demo_or_Operator {


    public static void main(String args[]) {

        String brand = "IBM";
        int ram = 8;

        if (brand == "IBM" || ram > 4) {

            System.out.println("Good configuration.....TRUE");
        } else
            System.out.println("Not bad configuration");


        brand = "DELL";
        if (brand == "IBM" || ram > 4) {

            System.out.println("Not good configuration.....TRUE");
        } else {
            System.out.println(" Good configuration. ");
        }


        brand = "IBM";
        ram = 8;

        if (brand == "DELL" || ram > 4) {

            System.out.println("Not good configuration.....TRUE");
        } else {
            System.out.println("Good configuration");
        }


        brand = "DELL";
        ram = 4;

        if (brand == "IBM" || ram > 8) {

            System.out.println("Not configuration");
        } else {
            System.out.println("Not good configuration.....FALSE");
        }


    }
}




