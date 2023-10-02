package OOPs.inheritance;

public class Super {
    public void Add(int a, int b) {
        int c = a + b;
        System.out.println("Printing Addition a and b : " + c);
    }

    public void Sub(int a, int b) {
        int c = a - b;
        System.out.println("Printing Sub a and b : " + c);

    }

    public void mul(int a, int b) {
        int c = a * b;
        System.out.println("Printing Mul a and b : " + c);

    }

    public void div(int a, int b) {
        int c = a / b;
        System.out.println("Printing Div a and b : " + c);

    }

    public static void main(String[] args) {
        Super obj = new Super();
        obj.Add(2, 18);
        obj.Sub(20, 15);
        obj.mul(40, 2);
        obj.div(44, 2);
    }


}
