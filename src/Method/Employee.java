package Method;

public class Employee {

    String name;

    String company;

    String expert;

    String masters;

    int age;

    public void skillmethod() {
        System.out.println("this is a skill method of employee");
    }

    public  void abilitymethod(){
        System.out.println("this is a skill method of employee");
    }

    public void aptitudemethod(){
        System.out.println("this is a aptitude of employee");
    }

    public void knowledgemethod(){
        System.out.println("this is a knowledge of employee");
    }

    public  void informationmethod(){
        System.out.println("this is a information of a employee");
    }

    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.skillmethod();
        employee1.abilitymethod();
        employee1.aptitudemethod();
        employee1.knowledgemethod();
        employee1.informationmethod();
    }




    }



