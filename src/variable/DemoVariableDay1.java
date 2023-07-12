package variable;

public class DemoVariableDay1 {

    public static void main(String[] args) {

        // SYNTAX : Datatype varName;  declare a variable
        // varName=value;  Assignment of data
        // System.out.println("Message : " +varName);

        String countryName; // we have declared a variable  countryName with String datatype

        countryName="India";

        System.out.println("My Country Name is :"+countryName);

        countryName="US"; // reuse variable and stored new value

        System.out.println("My updated Country Name is :"+countryName);

        int age; // we have declared variable age with int datatype

        age=23;

        System.out.println("Age is :"+age);

        double price; // we have declared a variable price with double datatype

        price=423.45;

        System.out.println("Price is :"+price);

        boolean flag; // we have declares a variable flag with boolean data type
        flag=false;

        System.out.println("Flag is : "+flag);

        String name;
        name= "Rahul Singh";

        System.out.println("Name is  :"+name);

        int marks;
        marks=76;

        System.out.println("Marks is :" + marks);

        double salary;
        salary=32124.343;

        System.out.println("Salary is : "+salary);

    }


}
