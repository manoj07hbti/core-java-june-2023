package method;

public class Return_type {

    public int sum(int a, int b) {
        int result = a + b;

        return result;
    }

    public int sub(int a, int b) {

        int result = a - b;
        return result;
    }

    public int multiple(int a, int b) {

        int result = a * b;
        return result;
    }

    public int devesion(int a, int b) {

        double result = (double) a / b;

        return a / b;
    }


    public static void main(String[] args) {

        Return_type obj = new Return_type();
        System.out.println(obj.sum(4, 3));
        System.out.println(obj.sum(5, 7));
        System.out.println(obj.sub(8, 5));
        System.out.println(obj.sub(12, 5));
        System.out.println(obj.multiple(9, 3));
        System.out.println(obj.devesion(9, 6));
        System.out.println(obj.devesion(8, 3));


    }


}
