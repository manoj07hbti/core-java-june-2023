package Class_and_object;

public class DoctorDr {
    //Data of Student
    String Name;
    int Duration;
    String Course;
     String College;
     // Parametrize constructor

    public DoctorDr(String name, int duration, String course, String college) {
        Name = name;
        Duration = duration;
        Course = course;
        College = college;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public static void main(String[] args) {
        DoctorDr DoctorDr1= new DoctorDr("Ron", 4, "MBBS", "RMC");
        System.out.println("DoctorDr1 Name is: "+ DoctorDr1.Name + " Duration is: "+DoctorDr1.Duration + " Branch is: "+DoctorDr1.Course+" College is: "+DoctorDr1.College);

        DoctorDr DoctorDr2= new DoctorDr("SHEETAL", 3, "PHYSICO", "GOGO");
        System.out.println("DoctorDr2 Name is: "+ DoctorDr2.Name + " Duration is: "+DoctorDr2.Duration + " Branch is: "+DoctorDr2.Course+" College is: "+DoctorDr2.College);

        System.out.println("Value after using setter method");
        DoctorDr1.setName("Sushmita");
        DoctorDr1.setDuration(5);
        DoctorDr1.setCourse("BHMS");
        DoctorDr1.setCollege("DYPT");
        System.out.println("DoctorDr1 Name is: "+ DoctorDr1.Name + " Duration is: "+DoctorDr1.Duration + " Branch is: "+DoctorDr1.Course+" College is: "+DoctorDr1.College);

        DoctorDr2.setName("Maya");
        DoctorDr2.setDuration(7);
        DoctorDr2.setCourse("BHMS");
        DoctorDr2.setCollege("GOV");
        System.out.println("DoctorDr2 Name is: "+ DoctorDr2.Name + " Duration is: "+DoctorDr2.Duration + " Branch is: "+DoctorDr2.Course+" College is: "+DoctorDr2.College);


    }
}
