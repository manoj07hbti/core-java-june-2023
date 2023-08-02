package Test_for_loop;

public class Do_while_loop {
    public static void main(String[] args) {

        int[] marks = {54, 23, 76, 87, 56, 34, 76, 88};
        int size = marks.length;


        double[] doubleMarks = new double[size];


        int i = 0;
        do {
            doubleMarks[i] = (double) marks[i];
            i++;
        } while (i < size);


        System.out.println("Double array:");
        int j = 0;
        do {
            System.out.print(doubleMarks[j] + " ");
            j++;
        } while (j < size);

    }
}


