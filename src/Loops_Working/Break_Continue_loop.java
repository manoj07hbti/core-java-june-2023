package Loops_Working;

public class Break_Continue_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 19; i++) {
            // Break statement of loop:
            if (i == 9) {
                break;
            }
            System.out.println("Printing break loop , checking -----> " + i);

        }
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int var : number) {
            System.out.println("finding number 10 in array , checking " + var);
            if (var == 10) {
                System.out.println(" given number 10 is found ");

                break;
            }
        }
        String StudentName[] = {" Mr. Ravi Sharma", "Mr Rajiv Rao ", "Mr. Shiv Kumar ", "Mr Mathur"};
        for (String name : StudentName) {
            System.out.println("finding String Mr Mathur in array , checking " + name);
            if (name == "Mr Mathur") {
                System.out.println(" given Mr Mathur is found ");
                break;


            }
        }

        int studentMarks[] = {43, 45, 65, 55, 76, 67, 45, 87, 65, 78, 54,76,98,91,88};
        for (int var : studentMarks) {
            if (var == 65) {
                continue;
            }
            System.out.println("printing continue ---> " +var);

        }
        String employeeName[]={"Manish Chandra","Manoj Kumar","Mayak Kumar","Maneesha tyagi","Mukesh Kumar"};
       for (String var:employeeName){

           if (var=="Manoj Kumar"){
               continue;

           }  System.out.println("Printing employee name  is continue , Checking ----> " +var) ;


       }


    }
}

