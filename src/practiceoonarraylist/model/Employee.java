package practiceoonarraylist.model;

public class Employee {


        String empId;
        String add;
        int age;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String empId, String add, int age) {
        this.empId = empId;
        this.add = add;
        this.age = age;
    }
}
