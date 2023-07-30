package arrays_demo;
public class Assignment_Array_WhileLoop {
    public static void main(String[] args) {
        //
        int marks[] = {54, 23, 76, 87, 56, 34, 76, 88};
        int index = 0;
        while ( index < marks.length){
            System.out.println("Printing Marks using While Loop :" +marks[index]);
            index++;
        }

        }
    }