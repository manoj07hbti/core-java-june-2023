package Collection.Hashmap;

import Collection.Model.EmployeeData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class EmployeeInformation {
    public HashMap<String, ArrayList<EmployeeData>> Display() {
        HashMap<String, ArrayList<EmployeeData>> Data = new HashMap<>();
        ArrayList<EmployeeData> IBMEmployee = new ArrayList<>();

        EmployeeData emp1 = new EmployeeData("Shiv", 55000.54, "Pune", "MCA");
        EmployeeData emp2 = new EmployeeData("Mukesh", 55001.54, "Meerut", "BCA");
        EmployeeData emp3 = new EmployeeData("Pinki", 55220.54, "Agra", "B.Ed");
        EmployeeData emp4 = new EmployeeData("Anil", 55040.54, "Tundla", "B.tech");
        EmployeeData emp5 = new EmployeeData("Ravi", 55080.54, "Kanpur", "Agra");
        IBMEmployee.add(emp1);
        IBMEmployee.add(emp2);
        IBMEmployee.add(emp3);
        IBMEmployee.add(emp4);
        IBMEmployee.add(emp5);
        Data.put("IBM", IBMEmployee);
        ArrayList<EmployeeData> TCSEmployee = new ArrayList<>();
        EmployeeData emp6 = new EmployeeData("Pinki Kumari", 55000.54, "Pura", "MCA");
        EmployeeData emp7 = new EmployeeData("Sharma", 550051.54, "Mathura", "BCA");
        EmployeeData emp8 = new EmployeeData("Mathur", 55225.54, "agra", "B.Ed");
        EmployeeData emp9 = new EmployeeData("Mohit", 550406.54, "agra", "B.tech");
        EmployeeData emp10 = new EmployeeData("Rahul", 55087.54, "Tundla", "CA");
        IBMEmployee.add(emp6);
        IBMEmployee.add(emp7);
        IBMEmployee.add(emp8);
        IBMEmployee.add(emp9);
        IBMEmployee.add(emp10);
        Data.put("TCS", IBMEmployee);
        ArrayList<EmployeeData> INFOSYSEmployee = new ArrayList<>();
        EmployeeData emp11 = new EmployeeData("Pinki Kumari", 55000.54, "Pura", "BA");
        EmployeeData emp12 = new EmployeeData("Sharma", 550051.54, "Mathura", "BBA" +
                "A");
        EmployeeData emp13 = new EmployeeData("Mathur", 55225.54, "agra", "BCA");
        EmployeeData emp14 = new EmployeeData("Mohit", 550406.54, "agra", "B.COM");
        EmployeeData emp15 = new EmployeeData("Rahul", 55087.54, "Tundla", "MCA");
        INFOSYSEmployee.add(emp11);
        INFOSYSEmployee.add(emp12);
        INFOSYSEmployee.add(emp13);
        INFOSYSEmployee.add(emp14);
        INFOSYSEmployee.add(emp15);
        Data.put("INFOSYS", INFOSYSEmployee);
        return Data;

    }

    public static void main(String[] args) {
        EmployeeInformation obj = new EmployeeInformation();
        HashMap<String, ArrayList<EmployeeData>> Emp = obj.Display();
        Set<String> set = Emp.keySet();
        for (String var : set) {
            System.out.println("Printing Employee Data : ");
            ArrayList<EmployeeData> map = Emp.get(var);
            for (int i = 0; i < map.size(); i++) {
                if (var.equals("IBM") || var.equals("TCS")) {
                    if (map.get(i).getEmployeeSalary() > 550000) {
                        System.out.println("Printing " + var + " Name : " + map.get(i).getEmployeeName() + " City  : " + map.get(i).getEmployeeCity() + " Salary : " + map.get(i).getEmployeeSalary() + " Dept : " + map.get(i).getEmployeeDept());
                    }
                }
            }
        }
    }
}
