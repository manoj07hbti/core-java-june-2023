package arrays_package;

public class ArrayMarksWhileLoop {
    public static void main(String[] args) {
        int[] marksArray = {10, 50, 20, 30, 58, 76, 66, 88, 90, 23};
        int marks = 0;
        while (marks < marksArray.length) {
            System.out.println("inside the while loop:" + marksArray[marks]);
            marks++;
        }

    }
}
