package class_and_object;

public class Person {
    String pName="Aditya";
    int age=30;
    float weight=80.5f;
    float height=174.6f;

    public static void main(String[] args) {
        Person person1=new Person();
        Person person2=new Person();
        Person person3=new Person();
        Person person4=new Person();
        Person person5=new Person();

        System.out.println("Person name is:"+person1.pName+"\t"+"age is:"+person1.age+"\t"+"Weight is:"+person1.weight+"\t"+"Height is:"+person1.height);
        System.out.println("Person name is:"+person2.pName+"\t"+"age is:"+person2.age+"\t"+"Weight is:"+person2.weight+"\t"+"Height is:"+person2.height);
        System.out.println("Person name is:"+person3.pName+"\t"+"age is:"+person3.age+"\t"+"Weight is:"+person3.weight+"\t"+"Height is:"+person3.height);
        System.out.println("Person name is:"+person4.pName+"\t"+"age is:"+person4.age+"\t"+"Weight is:"+person4.weight+"\t"+"Height is:"+person4.height);
        System.out.println("Person name is:"+person5.pName+"\t"+"age is:"+person5.age+"\t"+"Weight is:"+person5.weight+"\t"+"Height is:"+person5.height);

    }
}
