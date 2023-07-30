package arrays_package;

public class ArrayNames_WhileLoop {
    public static void main(String[] args) {
        String ArrayNames[] = {"Poonam", "Ambika", "Anshu", "Kanak", "Dauli"};
        int names = 0;
        while (names < ArrayNames.length) {
            System.out.println("Names Inside the While Loop :" + ArrayNames[names]);
            names++;
        }

    }
}
