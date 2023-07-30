package arrays_package;

public class ArrayMarksDoWhileLoop {
    public static void main(String[] args) {
        int[] marksArray = {67, 58, 34, 84, 45, 65, 79, 90, 54, 78};
        int marks = 0;
        do {
            System.out.println("Inside the Do While Loop :" + marksArray[marks]);
            marks++;

        } while (marks < marksArray.length);


    }

}
