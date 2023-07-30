package array;

public class ArrayMarksWhileLoop {

    public static void main(String[] args) {

        int [] marksArray = {44, 55, 33, 87, 98, 67, 78, 32, 41, 14};
        int marks=0;
        while (marks<marksArray.length){
            System.out.println("Inside the While Loop :"+marksArray[marks]);
            marks++;
        }
    }
}