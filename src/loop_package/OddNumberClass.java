package loop_package;

public class OddNumberClass {

    public static void main(String[] args) {

        int start= 1;
        int end = 100;
        System.out.println("odd number between 1 to 100");
for (int i= start; i<=end; i++){
    if (i% 2 !=0){
        System.out.println(i + " ");
    }
}
    }
}
