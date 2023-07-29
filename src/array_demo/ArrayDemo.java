package array_demo;

public class ArrayDemo {
    public static void main(String[] args) {
        int Marks[]={65,64,76,87,84,98,37,86,90,65};
        for(int i=0;i<10;i++){
            System.out.println("Printing Array Marks is : " +Marks[i]);
        }
        for (int i =0;i<9;i++){
            System.out.println("printing array marks is second : " +Marks[i] + " Intex  "  +Marks[i]);
        }
        // advance loop
        int mark[]={45,76,67,56,76};
        for (int var:mark){
            System.out.println("Printing advance array loop is : "  +var);

        }
        String Name[]={"Ramesh","Nitesh","Rakesh","Ramesh","Rohan"};
        for (String var:Name){
            System.out.println("Printing Advance loop is : "  +var);
        }
        int studentMarks[]={43,56,65,45,54,76,67,76};
        int j=0;
        while (j<studentMarks.length){
            System.out.println("Printing student marks is : "  +j + "  intex  " + studentMarks[j]);
            j++;
        }
        String studentName[]={"Ram","Shyam","Jon","Niteesh","Mathur","Mohit"};

        for (String var:studentName)
    {
            System.out.println("Printing Student Name is : "   +var);

        }
        double grad[]={45.87,76.98,67.90,76.9,98.1,98.6,87.78};
        for(double var:grad) {

            System.out.println("Printing grad is : "  +var);
        }



    }
}
