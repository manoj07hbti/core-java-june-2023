package collection.hashset;

import collection.model.Employee;

import java.util.HashSet;

public class EmployeeHashSet {

    public  HashSet<Employee>  EmployeeDetails()
    {
        HashSet<Employee> emp=new HashSet<>();
      //  System.out.println("HashCode of 1 employee: " +employee1.hashCode());
        Employee employee1=new Employee("A21","Ashok",28,65826.35,"tcs","pune");

        System.out.println("HashCode of 1 employee: " +employee1.hashCode());

        Employee employee2=new Employee("A22","Niku",35,88000.85,"tcs","pune");
        System.out.println("HashCode of 2 employee: " +employee2.hashCode());

        Employee employee3=new Employee("A21","Ashok",28,65826.35,"tcs","pune");
        System.out.println("HashCode of 3 employee: " +employee3.hashCode());


        Employee employee4=new Employee("A23","Nikita",35,88000.85,"tcs","pune");
        System.out.println("HashCode of 4 employee: " +employee4.hashCode());


        Employee employee5=new Employee("A24","shreya",28,65826.35,"tcs","pune");
        System.out.println("HashCode of 5 employee: " +employee5.hashCode());


        Employee employee6=new Employee("A22","Niku",35,88000.85,"tcs","pune");
        System.out.println("HashCode of 6 employee: " +employee6.hashCode());


        Employee employee7=new Employee("A24","shreya",28,65826.35,"tcs","pune");
        System.out.println("HashCode of 7 employee: " +employee7.hashCode());


        Employee employee8=new Employee("A25","Chetan",35,88000.85,"tcs","pune");
        System.out.println("HashCode of 8 employee: " +employee8.hashCode());


        Employee employee9=new Employee("A21","Ashok",28,65826.35,"tcs","pune");
        System.out.println("HashCode of 9 employee: " +employee9.hashCode());

        Employee employee10=new Employee("A25","Chetan",35,88000.85,"tcs","pune");
        System.out.println("HashCode of 10 employee: " +employee10.hashCode());


        Employee employee11=new Employee("A21","Ashok",28,65826.35,"tcs","pune");
        System.out.println("HashCode of 11 employee: " +employee11.hashCode());


        Employee employee12=new Employee("A22","Niku",35,88000.85,"tcs","pune");
        System.out.println("HashCode of 12 employee: " +employee12.hashCode());


        emp.add(employee1);
        emp.add(employee2);
        emp.add(employee3);
        emp.add(employee4);
        emp.add(employee5);
        emp.add(employee6);
        emp.add(employee7);
        emp.add(employee8);
        emp.add(employee9);
        emp.add(employee10);
        emp.add(employee11);
        emp.add(employee12);


        return emp;
    }

    public static void main(String[] args) {
        EmployeeHashSet obj=new EmployeeHashSet();
        HashSet<Employee> employee=obj.EmployeeDetails();

        for (Employee var:employee)
        {
            System.out.println(""+var.getEmpId()+" "+var.getEmpName()+" "+ var.getAge()+" "+var.getSal());
        }

    }
}
