package july_test;

public class Percentage {

    public static void main(String[] args) {

        double percentage = 20;
        double number = 500;

        double result = calculatepercentage(percentage, number);
        System.out.println(percentage + " % of " + number + " is:" + result);
    }

    public static double calculatepercentage(double percentage, double number) {
        return (percentage / 100) + number;

    }

}
