package class_and_object;

public class Person {

    String PerName = "PQR";
    int PerAge = 22;
    String PerGen = "Male/Female";
    String PerHob = "Multitasking";
    String PerJob = "FundManager";

    public static void main(String[] args) {
        //ClassName objName=new ClassName() DEFAULT CONSTRUCTOR

        Person person = new Person();
        //object.propertyName
        System.out.println("Printing PerName:" + person.PerName);
        System.out.println("Printing PerAge:" + person.PerAge);
        System.out.println("Printing PerGen:" + person.PerGen);
        System.out.println("Printing PerHob:" + person.PerHob);
        System.out.println("Printing PerJob:" + person.PerJob);


        Person person1 = new Person();
        //object.propertyName
        System.out.println("Printing PerName:" + person1.PerName + " Printing PerAge:" + person1.PerAge + " Printing PerGen:" + person1.PerGen + " Printing PerHob:" + person1.PerHob + " Printing PerJob:" + person1.PerJob);
    }

}
