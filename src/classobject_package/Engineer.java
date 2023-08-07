package classobject_package;
public class Engineer {
    String EngineerName="Surendra Singh";
    String Department=" Mechanical Department";
    String CompanyName="Azimuth business on wheels ";
    String CompanyAddress="Greater Noida";
    String Company_TurnOver=" 1000 Crore ";
    public static void main(String[] args) {
        // create object
        // Class_Name Object_name=new Class_Name();
        Engineer obj = new Engineer();
        System.out.println("Printing Engineer name is : " + obj.EngineerName);
        System.out.println("Printing Engineer  department is : " + obj.Department);
        System.out.println("Printing company name is : " + obj.CompanyName);
        System.out.println("Printing company address is : " + obj.EngineerName);
        System.out.println("Printing company turn Over is : " + obj.Company_TurnOver);

        Engineer obj1 = new Engineer();
        System.out.println("Printing Engineer name is : " + obj1.EngineerName);
        System.out.println("Printing Engineer  department is : " + obj1.Department);
        System.out.println("Printing company name is : " + obj1.CompanyName);
        System.out.println("Printing company address is : " + obj1.EngineerName);
        System.out.println("Printing company turnOver is : " + obj1.Company_TurnOver);

        Engineer obj2 = new Engineer();
        System.out.println("Printing Engineer name is : " + obj2.EngineerName);
        System.out.println("Printing Engineer  department is : " + obj2.Department);
        System.out.println("Printing company name is : " + obj2.CompanyName);
        System.out.println("Printing company address is : " + obj2.EngineerName);
        System.out.println("Printing company turnOver is : " + obj2.Company_TurnOver);

        Engineer obj3 = new Engineer();

        System.out.println("Printing Engineer name is : " + obj2.EngineerName);
        System.out.println("Printing Engineer  department is : " + obj3.Department);
        System.out.println("Printing company name is : " + obj3.CompanyName);
        System.out.println("Printing company address is : " + obj3.EngineerName);
        System.out.println("Printing company turnOver is : " + obj3.Company_TurnOver);


    }
}
