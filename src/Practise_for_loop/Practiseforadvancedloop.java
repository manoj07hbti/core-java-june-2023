package Practise_for_loop;

public class Practiseforadvancedloop {
    public static void main(String[] args) {

int[] marks={54,23,76,87,56,34,76,88};
        double[] doubleMarks = new double[marks.length];

        int i = 0;
        for (int mark : marks) {
            doubleMarks[i] = (double) mark;
            i++;
        }


        System.out.println("Double array:");
        for (double mark : doubleMarks) {
            System.out.print(mark + " ");
        }

    }
}


