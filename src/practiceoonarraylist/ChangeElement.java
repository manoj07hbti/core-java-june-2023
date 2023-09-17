package practiceoonarraylist;

import java.util.ArrayList;

public class ChangeElement {
    public ArrayList<String> changeArray(){

        ArrayList<String> a1=new ArrayList<>();
        a1.add("Ankita");
        a1.add("Chougule");

        //adding specific index
        a1.add(1,"rahul");
        System.out.println(" "+a1);

        a1.set(2,"Anvit");
        System.out.println(" " +a1);
        return a1;
    }

    public static void main(String[] args) {
        ChangeElement ce=new ChangeElement();
        ArrayList<String> st=ce.changeArray();
    }
}
