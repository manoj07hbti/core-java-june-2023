package method.input_parameter;

public class CalculateDivisionMethod {
    // TODO write a code to calculate percentage
    //TODO Syntax : access_specifier return_type  method_name (Datatype varName....) { CODE..}


    public void calculatePercentage(String section, int number, int rollnumber, String name) {

        double result = (double) (number * 100) / 600;
        System.out.println(" % is " + result);

        if (result >= 60) {
            System.out.println(" Student " + name + " roll number " + rollnumber + " got first division in section " + section);
        } else {
            if (result <= 59) {
                System.out.println(" Student " + name + " roll number " + rollnumber + " got second division in section " + section);
            }
        }
    }


    public static void main(String[] args) {
        CalculateDivisionMethod obj = new CalculateDivisionMethod();
        obj.calculatePercentage("cs", 500, 21, "Hari");
        obj.calculatePercentage("cs", 299, 22, "Hariom");

    }
}
