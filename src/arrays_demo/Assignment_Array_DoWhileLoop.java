package arrays_demo;

public class Assignment_Array_DoWhileLoop {
    public static void main(String[] args) {

        int marks[] = {54, 23, 76, 87, 56, 34, 76, 88};
        int i=0;
        do
        {
            System.out.println("Printing Marks using Do while loop ..."+marks[i]);
            i++;
        }
        while (i < 8);

    }

}
