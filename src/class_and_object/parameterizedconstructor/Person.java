package class_and_object.parameterizedconstructor;

public class Person {
    String name;
    int age;
    String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main(String[] args) {
        Person person1=new Person("Shubham",25,"Kohapur");
        System.out.println("Name is:"+person1.name+"\t"+"age is:"+person1.age+"\t"+"city is:"+person1.city);
        Person person2=new Person("Rohit",35,"Sangli");
        System.out.println("Name is:"+person2.name+"\t"+"age is:"+person2.age+"\t"+"city is:"+person2.city);
        Person person3=new Person("Suraj",38,"Pune");
        System.out.println("Name is:"+person3.name+"\t"+"age is:"+person3.age+"\t"+"city is:"+person3.city);
        Person person4=new Person("Nilesh",45,"Nagpur");
        System.out.println("Name is:"+person4.name+"\t"+"age is:"+person4.age+"\t"+"city is:"+person4.city);
        System.out.println("After changes..");
        person4.setCity("Satara");

        System.out.println("Name is:"+person4.name+"\t"+"age is:"+person4.age+"\t"+"city is:"+person4.city);

    }



}
