package class_and_object;

public class Person {

    // data members
    String name;
    int age;
    String address;

    // parameterised constructor

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

        Person person1= new Person("Raj",23,"Pune");

        System.out.println("Person 1 Name is: "+person1.name +" Age: "+person1.age+" Address: "+person1.address);

        Person person2= new Person("Mohit",22,"Mumbai");

        System.out.println("Person 2 name: "+person2.name+" Age: "+person2.age+" Address: "+person2.address);

        Person person3= new Person("Rohit",24,"Agra");

        System.out.println("Person 2 name: "+person3.name+" Age: "+person3.age+" Address: "+person3.address);


        System.out.println("Data after using setter method");

        person1.setName("Raj Kumar");
        person1.setAge(25);
        person1.setAddress("Nagpur");

        System.out.println("Person 1 Name is: "+person1.name +" Age: "+person1.age+" Address: "+person1.address);

        person2.setName("Mohit Singh");
        person2.setAddress("Pune");
        System.out.println("Person 2 name: "+person2.name+" Age: "+person2.age+" Address: "+person2.address);

    }


}
