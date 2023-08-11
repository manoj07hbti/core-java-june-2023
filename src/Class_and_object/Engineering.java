package Class_and_object;

public class Engineering {

    // data engineering
    String Name = "Engineering";

    int Branch = 5;

    String College = "RMC";

    String BranchName = "CS,EXTC,CIVIL,IT,MECH,EEE";

    String Duration = "Four year";

    public static void main(String[] args) {
        //Classname objName= new classname (); DEFAULT CONSTRUCTOR

        Engineering engineering1 = new Engineering();

        // object.propertyName;

        System.out.println("Print Course name:"+engineering1.Name);
        System.out.println("Print Course name:"+engineering1.Branch);
        System.out.println("Print Course name:"+engineering1.College);
        System.out.println("Print Course name:"+engineering1.BranchName);
        System.out.println("Print Course name:"+engineering1.Duration);
    }
}
