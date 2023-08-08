package class_and_object.parameterizedconstructor;

public class Doctor {
    String name;
    int age;
    String degree;
    String specialization;

    public Doctor(String name, int age, String degree, String specialization) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public static void main(String[] args) {
        Doctor doctor1=new Doctor("manjusha",28,"BAMS","Sergeon");
        System.out.println("Name is:"+doctor1.name+"\t"+"age is:"+"\t"+doctor1.age+"\t"+"Degree:"+doctor1.degree+"\t"+"Specialization"+doctor1.specialization);
        Doctor doctor2=new Doctor("Sujata",32,"MBBS","ETC");
        System.out.println("Name is:"+doctor2.name+"\t"+"age is:"+"\t"+doctor2.age+"\t"+"Degree:"+doctor2.degree+"\t"+"Specialization"+doctor2.specialization);
        System.out.println("After changes...");
        doctor1.setName("Meenakumari");
        System.out.println("Name is:"+doctor1.name+"\t"+"age is:"+"\t"+doctor1.age+"\t"+"Degree:"+doctor1.degree+"\t"+"Specialization"+doctor1.specialization);
    }
}
