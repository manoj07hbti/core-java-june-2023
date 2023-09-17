package practiceoonarraylist;

import java.util.ArrayList;

public class RemoveElement {
    public ArrayList<Double> remove(){
        ArrayList<Double> ad=new ArrayList<>();
        //creating arraylist object oof Double Data type

        ad.add(2.5);
        ad.add(5.3);
        ad.add(87.5);
        ad.add(7.5);

        //adding ana element specific index
        ad.add(1,2.6);

        System.out.println("Initial arraylist"+ad);

        //removing element above list list using index
        ad.remove(1);
        System.out.println(" arraylist"+ad);

        //removing element above list using object
        ad.remove(87.5);
        System.out.println("updated arraylist"+ad);

        return ad;
    }

    public static void main(String[] args) {
        RemoveElement re=new RemoveElement();
        ArrayList<Double> ad=re.remove();
    }
}
