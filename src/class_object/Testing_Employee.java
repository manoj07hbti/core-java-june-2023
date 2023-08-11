package class_object;

public class Testing_Employee {

    public static void main(String[] args) {
        Employee_Doctor_Engineer_Method obj = new Employee_Doctor_Engineer_Method();
        System.out.println();
        System.out.println("Printing employee testing process---------> ");
        System.out.println();
        System.out.println("Printing Testing Employee  :  " + obj.Employee_Name);
        System.out.println("Printing Testing Employee :  " + obj.Employee_Id);
        System.out.println("Printing Testing Employee  :  " + obj.Employee_age);


        Employee_Doctor_Engineer_Method obj1 = new Employee_Doctor_Engineer_Method();
        System.out.println();

        System.out.println("Printing Doctor testing process---------> ");
        System.out.println();
        System.out.println("Printing Testing Doctor  :  " + obj1.Doctor_Name);
        System.out.println("Printing Testing  Doctor:  " + obj1.Doctor_Degree);
        System.out.println("Printing Testing  Doctor  :  " + obj1.Doctor_age);
        System.out.println("Printing Testing  Doctor  :  " + obj1.Doctor_Fees);

        Employee_Doctor_Engineer_Method obj2 = new Employee_Doctor_Engineer_Method();
        System.out.println();
        System.out.println("Printing Engineer testing process---------> ");
        System.out.println();

        System.out.println("Printing Testing Doctor  :  " + obj2.Engineer_Name);
        System.out.println("Printing Testing  Doctor:  " + obj2.Engineer_Department);
        System.out.println("Printing Testing  Doctor  :  " + obj2.Engineer_Salary);


    }
}
