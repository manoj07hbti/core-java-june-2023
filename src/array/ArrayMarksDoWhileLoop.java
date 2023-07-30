package array;

public class ArrayMarksDoWhileLoop {
    public static void main(String[] args) {
        int [] marksArray = {44, 55, 33, 87, 98, 67, 78, 32, 41, 14};
        int marks =0;
        do {
            System.out.println("Inside the Do While Loop :"+marksArray[marks]);
            marks++;

        }while (marks<marksArray.length);
    }
}
