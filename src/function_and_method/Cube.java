package function_and_method;

public class Cube {
    public void cube(){

        int a = 4;
        int result = a*a*a;
        System.out.println("given cube number " + result);
    }

    public static void main(String[] args) {

        Cube obj = new Cube();
        obj.cube();
    }
}
