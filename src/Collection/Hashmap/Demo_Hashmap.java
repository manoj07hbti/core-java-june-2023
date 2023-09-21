package Collection.Hashmap;

import java.util.HashMap;

public class Demo_Hashmap {

    public void createMap(){

        HashMap<Integer,String> Subjects=new HashMap<>();

        Subjects.put(1,"History");
        Subjects.put(2,"polity");
        Subjects.put(3,"Science");
        Subjects.put(4,"Geography");
        Subjects.put(5,"Economy");
        Subjects.put(6,"Information and technology");
        Subjects.put(7,"Commission");
        Subjects.put(8,"Science and Tech");
        Subjects.put(9,"Electronics");
        Subjects.put(10,"Computer");

        System.out.println(Subjects);


        Subjects.get(1);
        System.out.println(Subjects.get(1));
        Subjects.get(2);
        System.out.println(Subjects.get(2));
        Subjects.get(3);
        System.out.println(Subjects.get(3));
        Subjects.get(4);
        System.out.println(Subjects.get(4));
        Subjects.get(5);
        System.out.println(Subjects.get(5));
        Subjects.get(6);
        System.out.println(Subjects.get(6));
        Subjects.get(7);
        System.out.println(Subjects.get(7));
        Subjects.get(8);
        System.out.println(Subjects.get(8));
        Subjects.get(9);
        System.out.println(Subjects.get(9));
        Subjects.get(10);
        System.out.println(Subjects.get(10));
    }

    public static void main(String[] args) {
        Demo_Hashmap obj=new Demo_Hashmap();
        obj.createMap();
    }







}
