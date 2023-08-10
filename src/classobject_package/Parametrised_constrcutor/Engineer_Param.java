package classobject_package.Parametrised_constrcutor;

public class Engineer_Param {

    String engineerName;
    int EngineerAge;
    String engineerDepart;
    String companyAdd;

    public Engineer_Param(String engineerName, int engineerAge, String engineerDepart, String companyAdd) {
        this.engineerName = engineerName;
        EngineerAge = engineerAge;
        this.engineerDepart = engineerDepart;
        this.companyAdd = companyAdd;
    }

    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    public int getEngineerAge() {
        return EngineerAge;
    }

    public void setEngineerAge(int engineerAge) {
        EngineerAge = engineerAge;
    }

    public String getEngineerDepart() {
        return engineerDepart;
    }

    public void setEngineerDepart(String engineerDepart) {
        this.engineerDepart = engineerDepart;
    }

    public String getCompanyAdd() {
        return companyAdd;
    }

    public void setCompanyAdd(String companyAdd) {
        this.companyAdd = companyAdd;
    }

    public static void main(String[] args) {

        Engineer_Param obj = new Engineer_Param("Neetu", 38, "TechMahendra", "Noida");
        System.out.println("Name of Engineer name:" + obj.engineerName);
        System.out.println("Name of Engineer Depart:" + obj.engineerDepart);
        System.out.println("Age of Engineer:" + obj.EngineerAge);
        System.out.println("Name of companyAdd:" + obj.companyAdd);

        Engineer_Param obj1 = new Engineer_Param("Deepak", 54, "Technical", "Pune");
        System.out.println("Name of Engineer: " + obj1.engineerName);
        System.out.println("Name of EngineerDepart: " + obj1.engineerDepart);
        System.out.println("Age of Engineer:" + obj1.EngineerAge);
        System.out.println("Name of companyAdd:" + obj1.companyAdd);

        Engineer_Param obj2 = new Engineer_Param("Gaurav", 39, "civil", "Agra");
        System.out.println("name of Engineer:" + obj2.engineerName);
        System.out.println("name of engineerDepart:" + obj2.engineerDepart);
        System.out.println("Age of engineer:" + obj2.EngineerAge);
        System.out.println("name of companyAdd:" + obj2.companyAdd);

        System.out.println("data after using setter method");
        obj1.setEngineerName("Deepak Daksh");
        obj1.setEngineerAge(60);
        obj1.setCompanyAdd("Kanpur");
        obj1.setEngineerDepart("Mechanical");
        System.out.println("Name of Engineer name:" + obj.engineerName);
        System.out.println("Age of Engineer:" + obj1.EngineerAge);
        System.out.println("Name of EngineerDepart: " + obj1.engineerDepart);
        System.out.println("Name of companyAdd:" + obj1.companyAdd);
    }
}


