package class_and_object;

public class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {


        Person person1 = new Person("Anoop,", 35, "Pune");
        System.out.println("Person1 Name is : " + person1.name + " Age  : " + person1.age + " and Address  " + person1.address);

        Person person2 = new Person("Jaydeep, ", 30, "Hinjewadi");
        System.out.println("Person2 Name is : " + person2.name + " Age  : " + person2.age + " and Address  " + person2.address);

        System.out.println("Printing after setter Method");

        person1.setAddress("Grishma Apartment");
        System.out.println("Person1 Name is : " + person1.name + " Age  : " + person1.age + " and Address  " + person1.address);

        person2.setName("Neeraj,");
        System.out.println("Person2 Name is : " + person2.name + " Age  : " + person2.age + " and Address  " + person2.address);


    }
}