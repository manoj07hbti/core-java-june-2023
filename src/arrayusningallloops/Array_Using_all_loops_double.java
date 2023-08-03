package arrayusningallloops;

public class Array_Using_all_loops_double {
    public static void main(String[] args) {
        double percent[]={85.5,89.3,78.2,56.3,58.5,78.4,89.9,71.3};

        System.out.println(percent[4]);

        for (int i=0;i<percent.length;i++)
        {
            System.out.print(+percent[i]+"\t");
        }
        System.out.println();

        //advanced for loop
        System.out.println("advanced for...");
        for (double var:percent)
        {
            System.out.print(+var+"\t");
        }
        System.out.println();
        System.out.println("while...");
        int i=0;
        while (i<percent.length)
        {
            System.out.print(+percent[i]+"\t");
            i++;

        }

        System.out.println();
        System.out.println("do...while...");
        i=0;
        do {
            System.out.print(+percent[i] +"\t");
            i++;
        }while (i< percent.length);
    }
}
