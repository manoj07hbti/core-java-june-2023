package class_and_object.Parameterized_Constructor_with_or_without_Get_Set;

public class Person {
    //Data Member
    String name;
    String city;
    int age;


    //Parameterized Constructor
    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {


        Person person1 = new Person("Jatin", "Agra", 21);
        System.out.println("Name is :" + person1.name + " City is :" + person1.city + " Age is :" + person1.age);

        Person person2 = new Person("Mohit", "Agra", 15);
        System.out.println("Name is :" + person2.name + " City is :" + person2.city + " Age is :" + person2.age);

        Person person3 = new Person("Ojal", "Delhi", 20);
        System.out.println("Name is :" + person3.name + " City is :" + person3.city + " Age is :" + person3.age);

        Person person4 = new Person("Vandana", "Delhi", 19);
        System.out.println("Name is :" + person4.name + " City is :" + person4.city + " Age is :" + person4.age);

        Person person5 = new Person("Mukul", "Delhi", 14);
        System.out.println("Name is :" + person5.name + " City is :" + person5.city + " Age is :" + person5.age);


        //Getter And Setter Method

        System.out.println("Data after used setter method");
        person2.setName("Raju");
        person2.setCity("Mathura");
        person2.setAge(13);

        System.out.println("Name is :" + person2.name + " City is :" + person2.city + " Age is :" + person2.age);
    }
}