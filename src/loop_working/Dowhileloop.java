package loop_working;

public class Dowhileloop {
    public static void main(String[] args) {
        int i=1;
        do{
            if(i%2== 0) {
                System.out.println("This are even number" + i);
            }else{
                System.out.println("This are odd number" + i);
            }
            i++;
        } while(i<=100);
    }
}
