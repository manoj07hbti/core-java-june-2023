package collection;

import java.util.ArrayList;

public class CollectionArrayDiseases {


    public void diseasesInfo() {


        ArrayList Diseases = new ArrayList<>();


        Diseases.add("Cough");
        Diseases.add("Typhoid");
        Diseases.add("Tuberculosis");
        Diseases.add("Cholera");
        Diseases.add("Pneumonia");
        Diseases.add("Diphtheria");
        Diseases.add("Leprosy");
        Diseases.add("Bubonic Plague");
        Diseases.add("Gonorrhoea");
        Diseases.add("Tetanus");
        Diseases.add("Anthrax");
        Diseases.add("Hepatitis");
        Diseases.add("Poliomyelitis");
        Diseases.add("Measles");
        Diseases.add("Dengue");
        Diseases.add("Myastheniagrabis");
        Diseases.add("Lupus");
        Diseases.add("Chronic Kidney");
        Diseases.add("Deep Vein Thrombosis");
        Diseases.add("Asthma");

// for loop used
        for (int i = 0; i < Diseases.size(); i++) {
            System.out.println("Printing all Diseases List Using for loop:" + Diseases.get(i) + " INDEX " + i);
        }
        System.out.println(" ");
        System.out.println(" ");
// while loop used
        int j = 0;
        while (j < Diseases.size()) {
            System.out.println("Printing all Diseases List Using while loop:" + Diseases.get(j) + "INDEX " + j);
            j++;
        }
        System.out.println(" ");
        System.out.println(" ");
// do while loop used
        int k = 0;
        do {
            System.out.println("Printing all Diseases List Using do while loop:" + Diseases.get(k) + "INDEX " + k);
            k++;
        } while (k < Diseases.size());


        System.out.println(" ");
        System.out.println("********* After removing **********");
        System.out.println(" ");
        Diseases.remove(5);

        // for loop used
        for (int l = 0; l < Diseases.size(); l++) {
            System.out.println("Printing all Diseases List Using for loop:" + Diseases.get(l) + " INDEX " + l);
        }


        System.out.println(" ");
        System.out.println(" ");

// while loop used
        int m = 0;
        while (m < Diseases.size()) {
            System.out.println("Printing all Diseases List Using while loop:" + Diseases.get(m) + " INDEX " + m);
            m++;
        }

        System.out.println(" ");
        System.out.println(" ");
// do while loop used
        int n=0;
        do {
            System.out.println("Printing all Diseases List Using do while loop:" + Diseases.get(n) + " INDEX " + n);
            n++;
        }while (n<Diseases.size());
    }


    public static void main(String[] args) {
        CollectionArrayDiseases obj = new CollectionArrayDiseases();
        obj.diseasesInfo();
    }

}
