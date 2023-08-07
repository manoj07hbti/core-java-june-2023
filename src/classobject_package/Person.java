package classobject_package;

public class Person {
    String PersonName = "Darshan Raval";
    String PersonHeight = "183cm";
    int age = 28;
    String PersonCountry = "Ahmedabad";
    String Hobbies = "Singer";
    String Personid = "@darshanravaldz";

    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println("Printing Person name is : " + obj.PersonName);
        System.out.println("Printing Person hight is : " + obj.PersonHeight);
        System.out.println("Printing Person age is : " + obj.age);
        System.out.println("Printing Person Country is : " + obj.PersonCountry);
        System.out.println("Printing Person hobbies is : " + obj.Hobbies);
        System.out.println("Printing Person id is : " + obj.Personid);

        Person obj1 = new Person();
        System.out.println("Printing Person name is : " + obj1.PersonName);
        System.out.println("Printing Person hight is : " + obj1.PersonHeight);
        System.out.println("Printing Person age is : " + obj1.age);
        System.out.println("Printing Person Country is : " + obj1.PersonCountry);
        System.out.println("Printing Person hobbies is : " + obj1.Hobbies);
        System.out.println("Printing Person id is : " + obj1.Personid);
    }
}
