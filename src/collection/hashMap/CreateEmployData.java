package collection.hashMap;

import collection.model.Employ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class CreateEmployData {


    public void creatEmployData() {

        HashMap<String, HashSet<Employ>> employDataMap = new HashMap<>();
        HashSet<Employ> IBMemployset = new HashSet<>();

        Employ employ1 = new Employ("Rakesh", "IBM", 45000, 201);
        Employ employ2 = new Employ("Rajnish", "IBM", 46000, 203);
        Employ employ3 = new Employ("Rahul", "IBM", 40000, 204);
        Employ employ4 = new Employ("Randeep", "IBM", 47000, 206);
        Employ employ5 = new Employ("Akash", "IBM", 43000, 207);
        Employ employ6 = new Employ("Kuldeep", "IBM", 34000, 211);
        Employ employ7 = new Employ("Saurabh", "IBM", 48000, 212);
        Employ employ8 = new Employ("Nikhil", "IBM", 49000, 215);
        Employ employ9 = new Employ("Rajan", "IBM", 32000, 214);
        Employ employ10 = new Employ("Sajan", "IMB", 30000, 216);
        Employ employ11 = new Employ("Sonu", "IBM", 45500, 217);
        Employ employ12 = new Employ("Akash", "IBM", 43000, 207);
        Employ employ13 = new Employ("Kuldeep", "IBM", 34000, 211);
        Employ employ14 = new Employ("Saurabh", "IBM", 48000, 212);

        IBMemployset.add(employ1);
        IBMemployset.add(employ2);
        IBMemployset.add(employ3);
        IBMemployset.add(employ4);
        IBMemployset.add(employ5);
        IBMemployset.add(employ6);
        IBMemployset.add(employ7);
        IBMemployset.add(employ8);
        IBMemployset.add(employ9);
        IBMemployset.add(employ10);
        IBMemployset.add(employ11);
        IBMemployset.add(employ12);
        IBMemployset.add(employ13);
        IBMemployset.add(employ14);
        employDataMap.put("IBM", IBMemployset);

        HashSet<Employ> TCSemploy = new HashSet<>();


        Employ employ15 = new Employ("Santosh", "TCS", 43000, 301);
        Employ employ16 = new Employ("Shahil", "TCS", 44000, 302);
        Employ employ17 = new Employ("Shubham", "TCS", 45000, 303);
        Employ employ18 = new Employ("Sanju", "TCS", 436000, 304);
        Employ employ19 = new Employ("Sanjay", "TCS", 47000, 305);
        Employ employ20 = new Employ("Sumit", "TCS", 48000, 306);
        Employ employ21 = new Employ("Sangeet", "TCS", 43600, 307);
        Employ employ22 = new Employ("Sanjiv", "TCS", 43500, 308);
        Employ employ23 = new Employ("Shivam", "TCS", 43300, 309);
        Employ employ24 = new Employ("Santanu", "TCS", 49000, 309);
        Employ employ25 = new Employ("Shubham", "TCS", 48000, 307);
        Employ employ26 = new Employ("Shashi", "TCS", 45300, 306);
        Employ employ27 = new Employ("Somesh", "TCS", 44500, 311);
        Employ employ28 = new Employ("Sunil", "TCS", 43090, 321);

        TCSemploy.add(employ15);
        TCSemploy.add(employ16);
        TCSemploy.add(employ17);
        TCSemploy.add(employ18);
        TCSemploy.add(employ19);
        TCSemploy.add(employ20);
        TCSemploy.add(employ21);
        TCSemploy.add(employ22);
        TCSemploy.add(employ23);
        TCSemploy.add(employ24);
        TCSemploy.add(employ25);
        TCSemploy.add(employ26);
        TCSemploy.add(employ27);
        TCSemploy.add(employ28);

        employDataMap.put("TCS", TCSemploy);

        HashSet<Employ> INFOSYSEmployData = new HashSet<>();

        Employ employ29 = new Employ("Ravi", "INFOSYS", 45500, 101);
        Employ employ30 = new Employ("Raghvendra", "INFOSYS", 45500, 102);
        Employ employ31 = new Employ("Ramesh", "INFOSYS", 46500, 103);
        Employ employ32 = new Employ("Rakul", "INFOSYS", 47500, 104);
        Employ employ33 = new Employ("Raghav", "INFOSYS", 55000, 105);
        Employ employ34 = new Employ("Rupesh", "INFOSYS", 48500, 106);
        Employ employ35 = new Employ("Ritesh", "INFOSYS", 49500, 107);
        Employ employ36 = new Employ("Rinku", "INFOSYS", 50500, 108);
        Employ employ37 = new Employ("Sanjeev", "INFOSYS", 35500, 109);
        Employ employ38 = new Employ("Shivkumar", "INFOSYS", 34500, 110);
        Employ employ39 = new Employ("Shivansh", "INFOSYS", 45500, 111);
        Employ employ40 = new Employ("Rupesh", "INFOSYS", 45800, 112);
        Employ employ41 = new Employ("Reji", "INFOSYS", 45900, 111);
        Employ employ42 = new Employ("Ravindra", "INFOSYS", 50500, 110);
        Employ employ43 = new Employ("Ramashankar", "INFOSYS", 51500, 113);
        Employ employ44 = new Employ("Parag", "INFOSYS", 52500, 114);
        Employ employ45 = new Employ("Pravesh", "INFOSYS", 53500, 113);
        Employ employ46 = new Employ("Ranjeet", "INFOSYS", 54500, 115);

        INFOSYSEmployData.add(employ29);
        INFOSYSEmployData.add(employ30);
        INFOSYSEmployData.add(employ31);
        INFOSYSEmployData.add(employ32);
        INFOSYSEmployData.add(employ33);
        INFOSYSEmployData.add(employ34);
        INFOSYSEmployData.add(employ35);
        INFOSYSEmployData.add(employ36);
        INFOSYSEmployData.add(employ37);
        INFOSYSEmployData.add(employ38);
        INFOSYSEmployData.add(employ39);
        INFOSYSEmployData.add(employ40);
        INFOSYSEmployData.add(employ41);
        INFOSYSEmployData.add(employ42);
        INFOSYSEmployData.add(employ43);
        INFOSYSEmployData.add(employ44);
        INFOSYSEmployData.add(employ45);
        INFOSYSEmployData.add(employ46);


        employDataMap.put("INFOSYS", INFOSYSEmployData);

        Set<String> keys = employDataMap.keySet();

        for (String key : keys) {

            System.out.println(" ");

            System.out.println("******Print company Employ Data ******");

            HashSet<Employ> employs = employDataMap.get(key);

            for (Employ employ : employs)


                System.out.println("Print Data :" + key + " " + " Name :" + employ.getName() + " Company: " + employ.getWorkPlace() + "Salary: " + employ.getSalary() + "ID: " + employ.getID());
        }
    }


    public static void main(String[] args) {

        CreateEmployData obj = new CreateEmployData();
        obj.creatEmployData();


    }


}



