package method.input_parameter;

public class PercentageMethod {
    //TODO write a code to find percentage

    public void findPercentage(int marks) {

        double percentage = (double) (marks * 100) / 600;// TODO<-----TypeCastMethod
        System.out.println("Percentage of " + marks + " is " + percentage + "%");
    }

    public static void main(String[] args) {
        PercentageMethod obj = new PercentageMethod();
        obj.findPercentage(460);
    }
}
