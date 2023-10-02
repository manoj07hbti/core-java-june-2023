package OOPs.inheritance;

public class SubSuper extends Super {
    public void Display(String Level) {
        Level = "Multi-Level Inheritance";
        System.out.println("Printing Inheritance Level :  " + Level);
    }

    public void Remainder(double a, double b) {
        double c = a % b;
        System.out.println("Printing Remainder is : " + c);
    }

    public void division(double a, double b) {
        double c = a / b;
        System.out.println("Printing Division is : " + c);
    }

    public static void main(String[] args) {
        SubSuper obj = new SubSuper();
        obj.Add(34, 78);
        obj.Sub(45, 30);
        obj.mul(45, 20);
        obj.div(40, 4);
    }

}
