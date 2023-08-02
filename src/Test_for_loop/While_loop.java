package Test_for_loop;

public class While_loop {
    public static void main(String[] args) {

        int[]marks={54,23,76,87,56,34,76,88};
        int size=marks.length;
        double[]doublemarks= new double[size];

        int i=0;
        while(i < size) {
            doublemarks[i] = (double) marks[i];
            i++;
        }
        System.out.println("Double array:");
        int j = 0;
        while (j < size) {
            System.out.print(doublemarks[j] + " ");
            j++;
        }

        }
    }

