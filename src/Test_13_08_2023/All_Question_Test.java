package Test_13_08_2023;

public class All_Question_Test {


    public void cube() {
        int ArrayCube[] = {1 * 1 * 1, 2 * 2 * 2, 3 * 3 * 3, 4 * 4 * 4, 5 * 5 * 5, 6 * 6 * 6, 7 * 7 * 7, 8 * 8 * 8, 9 * 9 * 9, 10 * 10 * 10};
        //Testing model class next Testing Cube is ---->
        for (int var : ArrayCube) {
            System.out.println("Printing cube number is ---> " + var);
        }

    }


    public static void main(String[] args) {
        for (int i = 5; i <= 150; i++) {
            if (i % 3 == 0) {
                System.out.println("Printing number divided 3 is not even number : " + i);
            }
            if (i % 2 == 0) {
                System.out.println("Printing number divided to 2 is even number : " + i);
            }
        }
        for (int i = 7; i <= 190; i++) {
            if (i % 7 == 0) {
                System.out.println("Printing it is odd number : ");
            }
            if (i % 2 == 0) {
                System.out.println("Printing it is even number : " + i);
            }
        }
        for (int i = 9; i <= 160; i++) {
            if (i % 9 == 0) {
                System.out.println("Printing it is old number : ");
            }
            if (i % 2 == 0) {
                System.out.println("Printing it is even number : " + i);
            }
        }


        for (int i = 11; i <= 160; i++) {
            if (i % 11 == 0) {
                System.out.println("Printing it is old number : ");
            }
            if (i % 2 == 0) {
                System.out.println("Printing it is even number : " + i);
            }
        }


        for (int i = 11; i <= 180; i++) {
            if (i % 11 == 0) {
                System.out.println("Printing it is old number : ");
            }
            if (i % 2 == 0) {
                System.out.println("Printing it is even number : " + i);
            }
        }
        for (int i = 3; i <= 300; i++) {
            if (i % 3 == 0) {
                System.out.println("Printing it is old number : ");
            }
            if (i % 2 == 0) {
                System.out.println("Printing it is even number : " + i);
            }
        }
    }
}





