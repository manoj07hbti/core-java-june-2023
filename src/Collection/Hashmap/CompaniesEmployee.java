package Collection.Hashmap;

import Collection.Model.CorporateEmployee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CompaniesEmployee {
    public void CreateCompanyEmployee() {
        HashMap<String, ArrayList<CorporateEmployee>> CompaniesData = new HashMap<>();
        // create data of IBM Company's Employee;
        ArrayList<CorporateEmployee> IBMEmployeeList = new ArrayList<>();
        CorporateEmployee Emp1 = new CorporateEmployee("RaviKant Singh", "CPOPM2460M", 60000.87);
        CorporateEmployee Emp2 = new CorporateEmployee("Mohit Sharma", "CPOPM2461M", 70000.87);
        CorporateEmployee Emp3 = new CorporateEmployee("Manoj Gautam", "CPOPM2462M", 80000.87);
        CorporateEmployee Emp4 = new CorporateEmployee("Mathur", "CPOPM2463M", 55000.87);
        CorporateEmployee Emp5 = new CorporateEmployee("Rahul Singh", "CPOPM2464M", 65000.87);
        CorporateEmployee Emp6 = new CorporateEmployee("Bantu Gautam", "CPOPM2465M", 62000.87);
        CorporateEmployee Emp7 = new CorporateEmployee("Pinki Kumari", "CPOPM2466M", 69000.87);
        CorporateEmployee Emp8 = new CorporateEmployee("Sachin Kumar", "CPOPM2467M", 67000.87);
        CorporateEmployee Emp9 = new CorporateEmployee("Rakhi Devi", "CPOPM2468M", 63200.87);
        CorporateEmployee Emp10 = new CorporateEmployee("Doli Devi", "CPOPM2469M", 67000.07);

        IBMEmployeeList.add(Emp1);
        IBMEmployeeList.add(Emp2);
        IBMEmployeeList.add(Emp3);
        IBMEmployeeList.add(Emp4);
        IBMEmployeeList.add(Emp5);
        IBMEmployeeList.add(Emp6);
        IBMEmployeeList.add(Emp7);
        IBMEmployeeList.add(Emp8);
        IBMEmployeeList.add(Emp9);
        IBMEmployeeList.add(Emp10);

        CompaniesData.put("IBM", IBMEmployeeList);

        // create data of TCS Company's Employee;
        ArrayList<CorporateEmployee> TCSEmployeeList = new ArrayList<>();
        CorporateEmployee Emp11 = new CorporateEmployee("Manish Kumar", "CPOPM2470M", 60065.87);
        CorporateEmployee Emp12 = new CorporateEmployee("Sandee Sharma", "CPOPM2471M", 70076.87);
        CorporateEmployee Emp13 = new CorporateEmployee("Doli Gautam", "CPOPM2472M", 80076.87);
        CorporateEmployee Emp14 = new CorporateEmployee(" Bachchoo Singh Mathur", "CPOPM2473M", 55000.87);
        CorporateEmployee Emp15 = new CorporateEmployee("Shagun Mittal", "CPOPM2474M", 65032.87);
        CorporateEmployee Emp16 = new CorporateEmployee("Praval Kumar Gautam", "CPOPM2475M", 62000.87);
        CorporateEmployee Emp17 = new CorporateEmployee("Manju Kumari", "CPOPM2476M", 69008.87);
        CorporateEmployee Emp18 = new CorporateEmployee("Dev Kumar", "CPOPM2477M", 67004.87);
        CorporateEmployee Emp19 = new CorporateEmployee("Priyanka Devi", "CPOPM2478M", 63208.87);
        CorporateEmployee Emp20 = new CorporateEmployee("Meena Devi", "CPOPM2479M", 67076.07);
        TCSEmployeeList.add(Emp11);
        TCSEmployeeList.add(Emp12);
        TCSEmployeeList.add(Emp13);
        TCSEmployeeList.add(Emp14);
        TCSEmployeeList.add(Emp15);
        TCSEmployeeList.add(Emp16);
        TCSEmployeeList.add(Emp17);
        TCSEmployeeList.add(Emp18);
        TCSEmployeeList.add(Emp19);
        TCSEmployeeList.add(Emp20);


        CompaniesData.put("TCS", TCSEmployeeList);
        // create data of INFOSYS Company's Employee;
        ArrayList<CorporateEmployee> INFOSYSEmployeeList = new ArrayList<>();

        CorporateEmployee Emp21 = new CorporateEmployee("Praveen Kumar", "CPOPM2480M", 60465.87);
        CorporateEmployee Emp22 = new CorporateEmployee("Hemant Sharma", "CPOPM2481M", 70976.87);
        CorporateEmployee Emp23 = new CorporateEmployee("Shulekha Gautam", "CPOPM2482M", 80176.87);
        CorporateEmployee Emp24 = new CorporateEmployee(" Pinki Singh Mathur", "CPOPM2483M", 55700.87);
        CorporateEmployee Emp25 = new CorporateEmployee("RaviMittal", "CPOPM2484M", 65232.87);
        CorporateEmployee Emp26 = new CorporateEmployee("Praveen Kumar Gautam", "CPOPM2485M", 62000.87);
        CorporateEmployee Emp27 = new CorporateEmployee("Doli Kumari", "CPOPM2486M", 69708.87);
        CorporateEmployee Emp28 = new CorporateEmployee("Pradeep Kumar", "CPOPM2487M", 67504.87);
        CorporateEmployee Emp29 = new CorporateEmployee("Sheela Devi", "CPOPM2488M", 63218.87);
        CorporateEmployee Emp30 = new CorporateEmployee("Asha Devi", "CPOPM2489M", 67376.07);
        INFOSYSEmployeeList.add(Emp21);
        INFOSYSEmployeeList.add(Emp22);
        INFOSYSEmployeeList.add(Emp23);
        INFOSYSEmployeeList.add(Emp24);
        INFOSYSEmployeeList.add(Emp25);
        INFOSYSEmployeeList.add(Emp26);
        INFOSYSEmployeeList.add(Emp27);
        INFOSYSEmployeeList.add(Emp28);
        INFOSYSEmployeeList.add(Emp29);
        INFOSYSEmployeeList.add(Emp30);


        CompaniesData.put("INFOSYS", INFOSYSEmployeeList);
        System.out.println("Printing all Companies Data : " + CompaniesData);
        Set<String> CompaniesDatas = CompaniesData.keySet();
        for (String var : CompaniesDatas) {
            System.out.println("Printing Companies Data : ");
            ArrayList<CorporateEmployee> Employees = CompaniesData.get(var);
            for (int i = 0; i < Employees.size(); i++) {
                System.out.println("Printing Companies Data are : " + var + " Name : " + Employees.get(i).getEmployeeName() + " ID : " + Employees.get(i).getEmployeeID() + " Salary : " + Employees.get(i).getEmployeeSalary());
            }
        }


    }

    public static void main(String[] args) {
        CompaniesEmployee obj = new CompaniesEmployee();
        obj.CreateCompanyEmployee();


    }
}
