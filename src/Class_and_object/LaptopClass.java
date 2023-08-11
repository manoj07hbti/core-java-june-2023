package Class_and_object;

public class LaptopClass {
    // data laptop

    String LaptopName = "Dell";

    double version = 5.1;

    String harddisck = "1TB";

    String Windows = "Windows10";

    String Warranty  = "1 year";


    public static void main (String []args){
        //Classname objName= new classname (); DEFAULT CONSTRUCTOR
        LaptopClass laptop= new LaptopClass();
        // object.propertyName;

        System.out.println("The Laptop Name is:"+laptop.LaptopName+"The version is:"+laptop.version+"The Hard Disk Size is:"+laptop.harddisck+"The Windows is:"+laptop.Windows+" The warranty period is:"+laptop.Warranty );
    }
}
