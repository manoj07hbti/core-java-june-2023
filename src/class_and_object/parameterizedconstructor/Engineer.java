package class_and_object.parameterizedconstructor;

public class Engineer {
    String name;
    String  Stream;
    String Company;

    public Engineer(String name, String stream, String company) {
        this.name = name;
        Stream = stream;
        Company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public static void main(String[] args) {
        Engineer engineer1=new Engineer("Nitin","Mechanical","TCS");
        System.out.println("name is"+engineer1.name+"age is "+engineer1.Stream+"Selected for"+engineer1.Company);
        Engineer engineer2=new Engineer("Anvita","CSE","AMDOCS");
        System.out.println("name is"+engineer2.name+"age is "+engineer2.Stream+"Selected for"+engineer2.Company);
        System.out.println("after changes");
        engineer1.setCompany("MAGANA");

        System.out.println("name is"+engineer1.name+"age is "+engineer1.Stream+"Selected for"+engineer1.Company);
        engineer1.getCompany();
        engineer2.setName("Vaishali");

        System.out.println("name is"+engineer2.name+"age is "+engineer2.Stream+"Selected for"+engineer2.Company);

    }
}
