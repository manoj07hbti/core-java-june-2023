package Linked_Set;

import java.util.LinkedHashSet;

public class DemoEmployee {

    public LinkedHashSet<Employee>createEmployeeList(){

        LinkedHashSet<Employee>set=new LinkedHashSet<>();

        set.add(new Employee("Kapil","Khargone","IT",1));
        set.add(new Employee("Paul","indore","Civil",2));
        set.add(new Employee("Tapan","Burhanpur","Marketing",3));
        set.add(new Employee("Prince","Satara","Hospitality",4));
        set.add(new Employee("ashu","Mumbai","Finance",5));
        set.add(new Employee("Paritosh","Jaitpur","Electrical",6));
        set.add(new Employee("gagan","Ashoknagar","Social Science",7));
        set.add(new Employee("Deepak","Bhandara","Polity",8));
        set.add(new Employee("Olly","Chandigarh","History",9));
        set.add(new Employee("Rehan","faghwara","Geogaraphy",10));
        return set;

    }

    public static void main(String[] args) {
        DemoEmployee obj=new DemoEmployee();
        LinkedHashSet<Employee>result=obj.createEmployeeList();

        for (Employee var:result){
            System.out.println("printing employee name:"+var.getName()+"address :"+var.getAddress()+"branch :"+var.getBranch()+"employeeId :"+var.getEmployeeId());
        }
    }

    }

