package break_continue_package;

public class My_continueClass {

    public static void main(String[] args) {

        for (int i = 10; i <= 20; i++) {

            if (i == 15){
                continue;
            }
            System.out.println("Demo continue of loop..." + i);
        }
    }
}
