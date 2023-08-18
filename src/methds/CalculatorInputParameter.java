package methds;

public class CalculatorInputParameter {
    public void add(int a, int b) {
        int addResult = a + b;
        System.out.println("Printing add is : " + addResult);
    }

    public void sub(int a, int b) {
        int subResult = a - b;
        System.out.println("Printing sub is : " + subResult);
    }

    public void mul(int a, int b) {
        int mulResult = a * b;
        System.out.println("Printing mul : " + mulResult);
    }

    public void div(double a, double b) {
        double divResult = a / b;
        System.out.println("Printing division is : " + divResult);
    }

    public void percentage(double a, double b) {
        double percentage = (a / b) * 100;
        System.out.println("Printing Marks percentage is : " + percentage);
    }

    public static void main(String[] args) {
        CalculatorInputParameter obj = new CalculatorInputParameter();
        obj.add(34, 54);
        obj.add(54, 45);
        obj.add(42, 45);
        obj.add(78, 98);
        obj.sub(56, 34);
        obj.sub(67, 43);
        obj.sub(70, 56);
        obj.mul(23, 4);
        obj.mul(45, 5);
        obj.div(45, 2);
        obj.div(34, 2);
        obj.div(11, 3);
        obj.percentage(286, 600);
        obj.percentage(275, 500);
        obj.percentage(2890, 5000);
        obj.percentage(188, 400);
        obj.percentage(240, 500);


    }
}