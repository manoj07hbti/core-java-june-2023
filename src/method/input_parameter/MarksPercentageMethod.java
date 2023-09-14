package method.input_parameter;

public class MarksPercentageMethod {
    //TODO write a code to find percentage

    public void findPercentage(int marks) {

        double percentage = (double) (marks * 100) / 600;// TODO<-----TypeCastMethod
        System.out.println("Percentage of " + marks + " is " + percentage + "%");
    }

    public static void main(String[] args) {
        MarksPercentageMethod obj = new MarksPercentageMethod();
        obj.findPercentage(460);
    }
}
