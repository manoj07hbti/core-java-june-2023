package Collection.Hashmap;

import Collection.Model.CollegeData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CollegeFaculty {
    public void CreateCollegeTeacher() {
        HashMap<String, ArrayList<CollegeData>> CollegeList = new HashMap<>();
        // Create list of Agra College and Faculty
        ArrayList<CollegeData> AgraCollegeListAndFaculty = new ArrayList<>();
        CollegeData College1 = new CollegeData(127, "Vandhana Kumari ", "Manoj Sharma", "Sachin Gautam", "Farah Khan");
        CollegeData College2 = new CollegeData(128, "Renu Kumari ", "Rohan Sharma", "Mukesh Gautam", "Imrana Khan");
        CollegeData College3 = new CollegeData(129, "Rashmi Kumari ", "Dev Sharma", "Rahul Gautam", "Mushkan Khan");
        CollegeData College4 = new CollegeData(130, "Meena Kumari ", "Vijay Sharma", "Virat Gautam", "Afreen Khan");
        CollegeData College5 = new CollegeData(131, "Kushma Kumari ", "Rakesh Sharma", "Manish Gautam", "Zoya Khan");
        CollegeData College6 = new CollegeData(132, "Manju Kumari ", "Vejendra Sharma", "Ram Gautam", "Heena Khan");
        CollegeData College7 = new CollegeData(133, "Vandhana Kumari ", "Ramu Sharma", "Shelesh Gautam", "Alia Khan");
        CollegeData College8 = new CollegeData(134, "Rashmika Kumari ", "Munnesh Sharma", "Suresh Gautam", "Sara Khan");
        CollegeData College9 = new CollegeData(135, "Vidhya Kumari ", "Satish Sharma", "Surendra Gautam", "Karina Khan");
        CollegeData College10 = new CollegeData(136, "Pinki Kumari ", "Mukesh Sharma", "Sunendra Gautam", "Kushi Khan");

        AgraCollegeListAndFaculty.add(College1);
        AgraCollegeListAndFaculty.add(College2);
        AgraCollegeListAndFaculty.add(College3);
        AgraCollegeListAndFaculty.add(College4);
        AgraCollegeListAndFaculty.add(College5);
        AgraCollegeListAndFaculty.add(College6);
        AgraCollegeListAndFaculty.add(College7);
        AgraCollegeListAndFaculty.add(College8);
        AgraCollegeListAndFaculty.add(College9);
        AgraCollegeListAndFaculty.add(College10);

        CollegeList.put("Agra Faculty and College Code : ", AgraCollegeListAndFaculty);


        // Create list of Meerut College and Faculty
        ArrayList<CollegeData> MeerutCollegeListAndFaculty = new ArrayList<>();

        CollegeData College11 = new CollegeData(137, "Satish Kumar ", "Ashok Sharma", "Tinku Gautam", "Deepa Kumari");
        CollegeData College12 = new CollegeData(138, "Ravindra Kumar ", "Mukesh Tyagi", "Munnesh Shukla", "Prinka kumari");
        CollegeData College13 = new CollegeData(139, "Rashmi Kumari Sharam ", "Dev Kumar", "Rahul Sharma", "Mushkan Kumari");
        CollegeData College14 = new CollegeData(140, "Rakhi Kumari ", "Ajay Sharma", "Verendra Gautam", "Hina  Khan");
        CollegeData College15 = new CollegeData(141, "Suresh Chandra Gautam ", "Ramesh Chandra Sharma", "Nitin Gautam", "A.K Gautam");
        CollegeData College16 = new CollegeData(142, "M.K Kumari ", "Yubraj Singh", "Renu Tastongi", "Alia Khan");
        CollegeData College17 = new CollegeData(143, "kushbhu Kumari ", "Sonendra Sharma", "Mukesh Gautam", "Monika Kumari");
        CollegeData College18 = new CollegeData(144, "Rashmita Kumari ", "Anil Kumar", "Satish Chaudhary", "Ram Prakash");
        CollegeData College19 = new CollegeData(145, "Vinod Kumar ", "Kuldeep Kumar", "Pooja Kumari", "Doli Kumari");
        CollegeData College20 = new CollegeData(146, "Pinkey Mathur ", "Sandeep Mathur", "Jagdish Sagar", "Mushkan Kumari");

        MeerutCollegeListAndFaculty.add(College11);
        MeerutCollegeListAndFaculty.add(College12);
        MeerutCollegeListAndFaculty.add(College13);
        MeerutCollegeListAndFaculty.add(College14);
        MeerutCollegeListAndFaculty.add(College15);
        MeerutCollegeListAndFaculty.add(College16);
        MeerutCollegeListAndFaculty.add(College17);
        MeerutCollegeListAndFaculty.add(College18);
        MeerutCollegeListAndFaculty.add(College19);
        MeerutCollegeListAndFaculty.add(College20);

        CollegeList.put("Meerut Faculty and College Code : ", MeerutCollegeListAndFaculty);


        // Create list of Aligarh College and Faculty
        ArrayList<CollegeData> AligarhCollegeListAndFaculty = new ArrayList<>();

        CollegeData College21 = new CollegeData(147, "Satish Kumar ", "Ashok Sharma", "Tinku Gautam", "Deepa Kumari");
        CollegeData College22 = new CollegeData(148, "Ravindra Kumar ", "Mukesh Tyagi", "Munnesh Shukla", "Prinka kumari");
        CollegeData College23 = new CollegeData(149, "Rashmi Kumari Sharam ", "Dev Kumar", "Rahul Sharma", "Mushkan Kumari");
        CollegeData College24 = new CollegeData(150, "Rakhi Kumari ", "Ajay Sharma", "Verendra Gautam", "Hina  Khan");
        CollegeData College25 = new CollegeData(151, "Suresh Chandra Gautam ", "Ramesh Chandra Sharma", "Nitin Gautam", "A.K Gautam");
        CollegeData College26 = new CollegeData(152, "M.K Kumari ", "Yubraj Singh", "Renu Tastongi", "Alia Khan");
        CollegeData College27 = new CollegeData(153, "kushbhu Kumari ", "Sonendra Sharma", "Mukesh Gautam", "Monika Kumari");
        CollegeData College28 = new CollegeData(154, "Rashmita Kumari ", "Anil Kumar", "Satish Chaudhary", "Ram Prakash");
        CollegeData College29 = new CollegeData(155, "Vinod Kumar ", "Kuldeep Kumar", "Pooja Kumari", "Doli Kumari");
        CollegeData College30 = new CollegeData(156, "Pinkey Mathur ", "Sandeep Mathur", "Jagdish Sagar", "Mushkan Kumari");


        AligarhCollegeListAndFaculty.add(College21);
        AligarhCollegeListAndFaculty.add(College22);
        AligarhCollegeListAndFaculty.add(College23);
        AligarhCollegeListAndFaculty.add(College24);
        AligarhCollegeListAndFaculty.add(College25);
        AligarhCollegeListAndFaculty.add(College26);
        AligarhCollegeListAndFaculty.add(College27);
        AligarhCollegeListAndFaculty.add(College28);
        AligarhCollegeListAndFaculty.add(College29);
        AligarhCollegeListAndFaculty.add(College30);

        CollegeList.put("Aligarh Faculty and College Code :  ", AligarhCollegeListAndFaculty);
        System.out.println("Printing District College List : " + CollegeList);

        Set<String> CollegeLists = CollegeList.keySet();
        for (String var : CollegeLists) {
            System.out.println("Printing District College List : ");
            ArrayList<CollegeData> DistrictCollegeAndFaculty = CollegeList.get(var);
            for (int i = 0; i < DistrictCollegeAndFaculty.size(); i++) {
                System.out.println("Printing District College List and All Faculty : " + var + " " + DistrictCollegeAndFaculty.get(i).getCollegeCode() + " Faculty 1 : " + DistrictCollegeAndFaculty.get(i).getITTeacherName() + " Faculty 2 : " + DistrictCollegeAndFaculty.get(i).getMechanicalTeacherName() + " Faculty 3 : " + DistrictCollegeAndFaculty.get(i).getElectricalTeacherName() + " Faculty 4 " + DistrictCollegeAndFaculty.get(i).getPCTeacherName());
            }
        }


    }

    public static void main(String[] args) {
        CollegeFaculty obj = new CollegeFaculty();
        obj.CreateCollegeTeacher();
    }
}
