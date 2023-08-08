package class_and_object;

public class Dr {
    String name;

    public Dr(String name, String age, String degree, String department, double salary) {
        this.name = name;
        Age = age;
        this.degree = degree;
        this.department = department;
        this.salary = salary;
    }

    String Age;
    String degree;
    String department;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Dr Dr1 = new Dr("ajay", "35", "MMBS, MD", "ortho", 250000);
        System.out.println("print name:" + Dr1.name + " Age: " + Dr1.Age + "degree: " + Dr1.degree + "depatrment:" + Dr1.department + " salary:" + Dr1.salary);

        Dr Dr2 = new Dr("ashutosh", "32", "MMBS,MD", "surgery", 28000.00);
        System.out.println("dr name:" + Dr2.name + " Age: " + Dr2.Age + ": degree: " + Dr2.degree);
        System.out.println("salary:" + Dr2.salary + " department:" + Dr2.department);

        Dr Dr3 = new Dr("rahu", "28", "MBBS,MS", "ortho surgery", 30000.0);
        System.out.println("Dr name:" + Dr3.name + ":age:" + Dr3.Age + ":degree:" + Dr3.degree + ":department:" + Dr3.department + ":salary:" + Dr3.salary);

        System.out.println("deta after using setter method");

        Dr1.setName("rinku");
        Dr1.setAge("32");
        Dr1.setDegree("MD");
        System.out.println("name:" + Dr1.name + ":age:" + Dr1.Age + ": Degree:" + Dr1.degree);
    }
}
