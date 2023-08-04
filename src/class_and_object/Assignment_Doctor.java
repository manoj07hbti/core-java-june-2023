package class_and_object;
public class Assignment_Doctor {


   // Doctor class and 5 Object
   // Engineer class and 5 Object
   // Laptop class 5 object
   // Person class 5 object
    //default constructor
    String name = "Anil Prasad Bhatt";
    String specialist = "Nephrologist";
    String location = "Pune";
    String distance  = "25 KM";
    String timing = "10 AM to 5 PM";
    public static void main(String[] args) {

    Assignment_Doctor doctor1 = new Assignment_Doctor();
        System.out.println("Doctor Name : " + doctor1.name + ", Specialist in : " + doctor1.specialist +
                ", Location : " + doctor1.location + ", Distance " + doctor1.distance + " and Timing : " + doctor1.timing);

}
}