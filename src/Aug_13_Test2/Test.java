package Aug_13_Test2;

public class Test {

    public static void main(String[] args) {
        int i=3;
        do{
            if(i%3==0) {
                System.out.println("This are even number" + i);
            }else{
                System.out.println("This are odd number" + i);
            }
            i++;
        } while(i<=300);
    }
}
