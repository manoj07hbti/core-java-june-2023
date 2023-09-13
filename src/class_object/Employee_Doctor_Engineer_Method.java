package class_object;

public class Employee_Doctor_Engineer_Method {

    String Employee_Name = "B.S Mathur";
    String Employee_Id = "1948B9148";
    String Employee_age = "33 Year Old";
    String Doctor_Name = "Manik Chandra ";
    String Doctor_Degree = "MBBS and MD";
    String Doctor_age = "45 Year Old";
    String Doctor_Fees = "500 Rupees";
    String Engineer_Name = "Vijay Kumar";
    String Engineer_Department = "Civil Engineering";
    String Engineer_Salary = "90000 Rs ";

    //  Syntax : accesses_specifier return_type,function_name (Parameter) {}
    public void Employee() {
        System.out.println("Printing Employee Method------->");
        System.out.println();
    }

    public void Doctor() {
        System.out.println("Printing Doctor Method -------->");
        System.out.println();
    }

    public void Engineer() {
        System.out.println("Printing Engineer Method -------->");
        System.out.println();
    }


    public static void main(String[] args) {
        Employee_Doctor_Engineer_Method Emp = new Employee_Doctor_Engineer_Method();
        System.out.println();
        Emp.Employee();
        System.out.println();
        System.out.println("Printing Employee name is : " + Emp.Employee_Name);
        System.out.println("Printing Employee Id  is : " + Emp.Employee_Id);
        System.out.println("Printing Employee age is : " + Emp.Employee_age);

        Employee_Doctor_Engineer_Method Doctor = new Employee_Doctor_Engineer_Method();
        System.out.println();
        Doctor.Doctor();
        System.out.println();
        System.out.println("Printing Doctor Name is : " + Doctor.Doctor_Name);
        System.out.println("Printing Doctor Degree is : " + Doctor.Doctor_Degree);
        System.out.println("Printing Doctor age is : " + Doctor.Doctor_age);
        System.out.println("Printing Doctor Fees is : " + Doctor.Doctor_Fees);

        Employee_Doctor_Engineer_Method Engineer = new Employee_Doctor_Engineer_Method();
        System.out.println();
        Engineer.Engineer();
        System.out.println();
        System.out.println("Printing Engineer name is : " + Engineer.Engineer_Name);
        System.out.println("Printing Engineer Department is : " + Engineer.Engineer_Department);
        System.out.println("Printing Engineer Salary is  : " + Engineer.Engineer_Salary);


    }

}


