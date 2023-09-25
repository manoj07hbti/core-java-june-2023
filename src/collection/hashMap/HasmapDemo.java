package collection.hashMap;

import collection.hashset.EmployHashset;
import collection.model.Employ;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

public class HasmapDemo {

    public void companyEmployData() {

        HashMap<String, ArrayList<Employ>> companyEmploy = new HashMap<>();

        ArrayList<Employ> ibmEmpoly = new ArrayList<>();

        System.out.println("Print IBM Company Data");

        Employ employ1 = new Employ("Sanjay", "IBM", 40000, 401);
        Employ employ2 = new Employ("Sandesh", "IBM", 42000, 403);
        Employ employ3 = new Employ("Shivaji", "IBM", 44000, 406);
        Employ employ4 = new Employ("Santosh", "IBM", 46000, 409);
        Employ employ5 = new Employ("Salman", "IBM", 47000, 411);
        Employ employ6 = new Employ("Sumit", "IBM", 48000, 414);
        Employ employ7 = new Employ("Sunil", "IBM", 49000, 416);
        Employ employ8 = new Employ("Somesh", "IBM", 50000, 418);
        Employ employ9 = new Employ("Sanju", "IBM", 51000, 420);
        Employ employ10 = new Employ("Satish", "IBM", 540000, 421);
        Employ employ11 = new Employ("Surrender", "IBM", 550000, 422);

        ibmEmpoly.add(employ1);
        ibmEmpoly.add(employ2);
        ibmEmpoly.add(employ3);
        ibmEmpoly.add(employ4);
        ibmEmpoly.add(employ5);
        ibmEmpoly.add(employ6);
        ibmEmpoly.add(employ7);
        ibmEmpoly.add(employ8);
        ibmEmpoly.add(employ9);
        ibmEmpoly.add(employ10);

        companyEmploy.put("IBM", ibmEmpoly);

        ArrayList<Employ> tcsEmploy = new ArrayList<>();
        Employ employ12 = new Employ("Rakesh", "TCS", 45000, 501);
        Employ employ13 = new Employ("Rahul", "TCS", 42000, 503);
        Employ employ14 = new Employ("Ritesh", "TCS", 46000, 505);
        Employ employ15 = new Employ("Rajkumar", "TCS", 43000, 507);
        Employ employ16 = new Employ("Arjun", "TCS", 41000, 509);
        Employ employ17 = new Employ("Virendra", "TCS", 47000, 504);
        Employ employ18 = new Employ("Bhanu Pratap", "TCS", 48000, 502);
        Employ employ19 = new Employ("Dinesh", "TCS", 49000, 510);
        Employ employ20 = new Employ("Kshitesh", "TCS", 55000, 511);
        Employ employ21 = new Employ("Semendra", "TCS", 65000, 521);
        tcsEmploy.add(employ12);
        tcsEmploy.add(employ13);
        tcsEmploy.add(employ14);
        tcsEmploy.add(employ15);
        tcsEmploy.add(employ16);
        tcsEmploy.add(employ17);
        tcsEmploy.add(employ18);
        tcsEmploy.add(employ19);
        tcsEmploy.add(employ20);
        tcsEmploy.add(employ21);

        companyEmploy.put("TCS", tcsEmploy);

        ArrayList<Employ> infosysCompany = new ArrayList<>();

        Employ employ22 = new Employ("Sandeep", "INFO-SYS", 50000, 600);
        Employ employ23 = new Employ("Saurabh", "INFOSYS", 50000, 600);
        Employ employ24 = new Employ("Sahil", "INFOSYS", 50000, 600);
        Employ employ25 = new Employ("Saily", "INOSYS", 50000, 600);
        Employ employ26 = new Employ("Supriya", "INFOSYS", 50000, 600);
        Employ employ27 = new Employ("Suja", "INFOSYS", 50000, 600);
        Employ employ28 = new Employ("Suman", "INFOSYS", 50000, 600);
        Employ employ29 = new Employ("Sharmin", "INFOSYS", 50000, 600);
        Employ employ30 = new Employ("Pooja", "INFOSYS", 50000, 600);
        Employ employ31 = new Employ("Priti", "INFOSYS", 50000, 600);
        Employ employ32 = new Employ("Hemlata", "INFOSYS", 50000, 600);

        infosysCompany.add(employ22);
        infosysCompany.add(employ23);
        infosysCompany.add(employ24);
        infosysCompany.add(employ25);
        infosysCompany.add(employ26);
        infosysCompany.add(employ27);
        infosysCompany.add(employ28);
        infosysCompany.add(employ29);
        infosysCompany.add(employ30);
        infosysCompany.add(employ31);
        infosysCompany.add(employ32);

        companyEmploy.put("INFOSYS", infosysCompany);


        for (String key : companyEmploy.keySet()) {

            System.out.println(" ");

            System.out.println("******Print company Employ Data ******");
            System.out.println(" ");

            ArrayList<Employ> employs = companyEmploy.get(key);

            for (int i = 0; i < employs.size(); i++) {

                System.out.println("Print Data :" + employs.get(i).getName() + " CompnayName: " + employs.get(i).getWorkPlace() + " Salary : " + employs.get(i).getSalary() + " ID : " + employs.get(i).getID());

            }
        }
    }

    public static void main(String[] args) {
        HasmapDemo obj = new HasmapDemo();
        obj.companyEmployData();
    }
}


