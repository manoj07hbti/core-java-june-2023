package arrayusningallloops;

public class Array_Assignment_Loops {

    public static void main(String[] args) {
        int marks[]={58,89,78,83,95,88};

        System.out.println(marks[2]);
        //printing all data using for loop
        for (int i=0;i<5;i++)
        {
            System.out.print(+marks[i]+"\t");
        }
        System.out.println();

        for (int i=0;i<marks.length;i++)
        {
            System.out.print(+marks[i]+"\t");
        }
        System.out.println();
        System.out.println("using advanced for loop");
        for (int var:marks){
            System.out.print(+var+"\t");


        }
        System.out.println();
        System.out.println("while...loop...");
        int  i=0;
        while(i< marks.length)
        {
            System.out.print(+marks[i]+"\t");
            i++;
        }
        System.out.println();
       System.out.println("do...while...loop...");
        i=0;
        do {

            System.out.print(+marks[i]+"\t");
            i++;
        }while (i<marks.length);
    }
}
