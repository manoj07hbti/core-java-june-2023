package Test_for_loop;

public class ForLoop {
    public static void main(String[] args) {

        int[] marks={54,23,76,87,56,34,76,88};
        int size=marks.length;

        double[]doublemarks=new double[size];

        for(int i=0; i<size; i++) {
            doublemarks[i] = (double) marks[i];
        }

            System.out.println("double array :-***************************");

               for (int i=0;i<size;i++){

                   System.out.println(doublemarks[i]+" ");
               }

            }
            }





