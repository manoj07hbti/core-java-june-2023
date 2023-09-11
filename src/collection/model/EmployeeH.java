package collection.model;

public class EmployeeH {



    public String Name;

    public String BatchNo;

    public int Salary;


    public int Age;

    public EmployeeH(String name, String batchNo, int salary, int age) {
        Name = name;
        BatchNo = batchNo;
        Salary = salary;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBatchNo() {
        return BatchNo;
    }

    public void setBatchNo(String batchNo) {
        BatchNo = batchNo;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
