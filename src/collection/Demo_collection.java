package collection;

import arrays_demo_class.ArraysNewClass;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Demo_collection {


    public void information() {

        ArrayList Hospitalinfo = new ArrayList<>();
        Hospitalinfo.add("balaji hospital");
        Hospitalinfo.add("total employ is 150");
        Hospitalinfo.add("total department is 10");
        Hospitalinfo.add("pathology department");
        Hospitalinfo.add("pathology technician is chandan");
        Hospitalinfo.add("second department is radiology");
        Hospitalinfo.add("department technician mr reji");
        Hospitalinfo.add("cssd department");
        Hospitalinfo.add("cssd department technician is sanjay");
        Hospitalinfo.add("cath lab ");
        Hospitalinfo.add("cath lab technician is mr chole");
        Hospitalinfo.add("iccu department");
        Hospitalinfo.add("iccu department incharge is dr.nasir khan");
        Hospitalinfo.add("male ward");
        Hospitalinfo.add("female ward");
        Hospitalinfo.add("male and female ward dr sharmin , suman, imran");
        Hospitalinfo.add("hospital admin name : mr kagji sir");
        Hospitalinfo.add("iccu casualty department");
        Hospitalinfo.add("iccu incharge is dr nilesh");
        Hospitalinfo.add("salary 40000");
        Hospitalinfo.add("hospital contect no 213000");

        System.out.println("Name:+ " + Hospitalinfo.get(0));
        System.out.println("total employ:" + Hospitalinfo.get(1));
        System.out.println("1st department:" + Hospitalinfo.get(2));
        System.out.println("2nd department: " + Hospitalinfo.get(3));
        System.out.println("pathology technician " + Hospitalinfo.get(4));
        System.out.println("3 department :" + Hospitalinfo.get(5));
        System.out.println("radiology technician" + Hospitalinfo.get(6));
        System.out.println("ccsd:" + Hospitalinfo.get(7));

        for (int i = 0; i < Hospitalinfo.size(); i++) {

            System.out.println("printing all data :" + Hospitalinfo.get(i));
        }
        Hospitalinfo.remove(10);

        for (int i = 0; i < Hospitalinfo.size(); i++) {

            System.out.println("after remove data :" + Hospitalinfo.get(i) + "INDEX:" + i);
        }
    }

    public void information1() {

        ArrayList Hospitalinfo1 = new ArrayList();

        Hospitalinfo1.add("balaji hospital");
        Hospitalinfo1.add("total employ is 150");
        Hospitalinfo1.add("total department is 10");
        Hospitalinfo1.add("pathology department");
        Hospitalinfo1.add("pathology technician is chandan");
        Hospitalinfo1.add("second department is radiology");
        Hospitalinfo1.add("department technician mr reji");
        Hospitalinfo1.add("cssd department");
        Hospitalinfo1.add("cssd department technician is sanjay");
        Hospitalinfo1.add("cath lab ");
        Hospitalinfo1.add("cath lab technician is mr chole");
        Hospitalinfo1.add("iccu department");
        Hospitalinfo1.add("iccu department in charge is dr.nasir khan");
        Hospitalinfo1.add("male ward");
        Hospitalinfo1.add("female ward");
        Hospitalinfo1.add("male and female ward dr sharmin , suman, imran");
        Hospitalinfo1.add("hospital admin name : mr kagji sir");
        Hospitalinfo1.add("iccu casualty department");
        Hospitalinfo1.add("iccu in charge is dr nilesh");
        Hospitalinfo1.add("salary 40000");
        Hospitalinfo1.add("hospital contest no 213000");

        int j = 0;

        do {

            System.out.println("print all hospital1 data:" + Hospitalinfo1.get(j));

            j++;
        } while (j > Hospitalinfo1.size());

    }

    public void hospitalmanegment() {

        ArrayList hospitalmanegment = new ArrayList();

        hospitalmanegment.add("uday yadav");
        hospitalmanegment.add("jaunpur");
        hospitalmanegment.add("uttar pradesh");
        hospitalmanegment.add("ambedkar college");
        hospitalmanegment.add("principal");
        hospitalmanegment.add("sethapur");


        int i = 0;

        while (i < hospitalmanegment.size()) {


            System.out.println("print my personl deta:" + hospitalmanegment.get(i));
            i++;
        }
        hospitalmanegment.remove(4);

        int j = 0;

        while (j < hospitalmanegment.size()) {

            System.out.println("print after removing data:" + hospitalmanegment.get(j));
            j++;
        }


    }

    public static void main(String[] args) {

        Demo_collection obj = new Demo_collection();
        obj.information();
        obj.information1();
        obj.hospitalmanegment();


    }
}
