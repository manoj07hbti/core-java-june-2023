package Class_and_object;

public class DoctorClass {
    // data doctor
    String Profession = "Doctor";

    int Duration = 5;

    String College = "RMC";

    String Specialization  = "MBBS,PHYSIO,BHMS,BDS,BAMS";

    String ShortCourses = "PHYSIO,etc";

    public static void main(String[]args){
        //Classname objName= new classname (); DEFAULT CONSTRUCTOR

        DoctorClass doctor1 = new DoctorClass();
        // object.propertyName;
        System.out.println("The Profession name is:"+doctor1.Profession);
        System.out.println("The Profession duration is:"+doctor1.Duration);
        System.out.println("The College name is:"+doctor1.College);
        System.out.println("The Specialization name is:"+doctor1.Specialization);
        System.out.println("The ShortCourses name is:"+doctor1.ShortCourses);

    }
}
