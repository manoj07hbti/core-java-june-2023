package Class_and_object;

public class PersonClass {
    // data person

    String Name = "Ron";

    int Height = 5;

    String College = "RMC";

    String Profession = "Engineer";

    String currently = "Searching for job";

    public static void main(String[] args) {
        //Classname objName= new classname (); DEFAULT CONSTRUCTOR

        PersonClass person1= new PersonClass();
        // object.propertyName;
        System.out.println(" Person Name is:"+person1.Name+"Height of ron is:"+person1.Height+"The College:"+person1.College+"Profession is:"+person1.Profession+" Currently:"+person1.currently);

    }
}
