package class_object.parameter_constructor;

public class Engineer {
    String EngineerName;
    String Department;
    String CompanyName;
    String CompanyAddress;
    String Company_TarnOver;

    public Engineer(String engineerName, String department, String companyName, String companyAddress, String company_TarnOver) {
        EngineerName = engineerName;
        Department = department;
        CompanyName = companyName;
        CompanyAddress = companyAddress;
        Company_TarnOver = company_TarnOver;
    }

    public String getEngineerName() {
        return EngineerName;
    }

    public void setEngineerName(String engineerName) {
        EngineerName = engineerName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCompanyAddress() {
        return CompanyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        CompanyAddress = companyAddress;
    }

    public String getCompany_TarnOver() {
        return Company_TarnOver;
    }

    public void setCompany_TarnOver(String company_TarnOver) {
        Company_TarnOver = company_TarnOver;
    }

    public static void main(String[] args) {
        Engineer obj = new Engineer("Bhanu Pratap Singh", "Chemical", "India Glycols Ltd. Noida", "Noida", "1000Cr");
        System.out.println("Detail of Engineer " + obj.EngineerName);
        System.out.println("Detail of Engineer " + obj.Department);
        System.out.println("Detail of Engineer " + obj.CompanyName);
        System.out.println("Detail of Engineer " + obj.CompanyAddress);
        System.out.println("Detail of Engineer " + obj.Company_TarnOver);

        Engineer obj1 = new Engineer("Manoj Agrawal", "Mechanical", "Hero private Limited India", "Pune", "10000Cr");
        System.out.println("Detail of Engineer " + obj1.EngineerName);
        System.out.println("Detail of Engineer " + obj1.Department);
        System.out.println("Detail of Engineer " + obj1.CompanyName);
        System.out.println("Detail of Engineer " + obj1.CompanyAddress);
        System.out.println("Detail of Engineer " + obj1.Company_TarnOver);

        Engineer obj2 = new Engineer("Aditay Sharma", "IT", "BK software privet Limited India", "Delhi", "1000Cr");
        System.out.println("Detail of Engineer " + obj2.EngineerName);
        System.out.println("Detail of Engineer " + obj2.Department);
        System.out.println("Detail of Engineer " + obj2.CompanyName);
        System.out.println("Detail of Engineer " + obj2.CompanyAddress);
        System.out.println("Detail of Engineer " + obj2.Company_TarnOver);

        System.out.println("Using Setter Method ");

        obj.setEngineerName("Adil Hussain");
        obj.setDepartment("MCA");
        obj.setCompanyName("TCS");
        System.out.println("Update Information of Engineer " + obj.EngineerName);
        System.out.println("Update Information of Engineer " + obj.Department);
        System.out.println("Update Information of Engineer " + obj.CompanyName);

        obj1.setCompany_TarnOver("5000 Cr");
        obj1.setCompanyAddress("Noida");

        System.out.println("Update Information of Engineer " + obj1.Company_TarnOver);
        System.out.println("Update Information of Engineer " + obj.CompanyAddress);


    }
}
