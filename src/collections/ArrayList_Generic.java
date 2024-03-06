package collections;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;

public class ArrayList_Generic {

    public ArrayList<String> StringList() {
        //CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList<String> StringArrayList = new ArrayList<>();

        StringArrayList.add("India");
        StringArrayList.add("America");
        StringArrayList.add("Japan");
        StringArrayList.add("Dubai");
        StringArrayList.add("Nepal");
        StringArrayList.add("Bhutan");
        StringArrayList.add("Bangladesh");
        StringArrayList.add("Pakistan");
        StringArrayList.add("Sudan");
        StringArrayList.add("England");

        return StringArrayList;
    }
    public ArrayList<Integer> IntegerList() {

        ArrayList<Integer> age  = new ArrayList<>();

        age.add(25);
        age.add(26);
        age.add(28);
        age.add(29);
        age.add(30);

        return age;

    }

    // STRING **************************
    public static void main(String[] args) {
        ArrayList_Generic obj = new ArrayList_Generic();
        ArrayList<String> CityName = obj.StringList(); // DATA STORAGE IN CITY NAME VARIABLE

        ArrayList<Integer> age = obj.IntegerList();
        // USING FOR LOOP...............
        for (int i = 0; i < CityName.size(); i++) {

            System.out.println("Printing for loop " + CityName.get(i) + " index number.." + i);
        }

        // USING WHILE LOOP..............
        int j = 0;
        while (j < CityName.size()) {
            System.out.println("Printing names With While Loop : " + CityName.get(j) + j);
            j++;
        }
        // USING DO WHILE LOOP ............
        int l = 0;
        do {
            System.out.println("printing City Name with Do While loop : " + CityName.get(l) + l);
            l++;
        } while (l < CityName.size());

        // USING ADVANCE LOOP........................

        for (String var : CityName){
            System.out.println("Printing City Name with advance loop " + var );

        }

         // INTEGER ****************************
        // USING FOR LOOP...............
        for (int i = 0; i < age.size(); i++) {

            System.out.println("Printing for loop " + age.get(i) + " index number.." + i);
        }

        int m = 0;
        while (m < age.size()) {
            System.out.println("Printing age With While Loop : " + age.get(m) );
            m++;


        }
    }
}