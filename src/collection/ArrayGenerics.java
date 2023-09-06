package collection;

import java.util.ArrayList;

public class ArrayGenerics {


    public ArrayList<String> createStringList() {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("shinkansen");
        stringArrayList.add("noodles");

        return stringArrayList;
    }
    public ArrayList<Integer> createIntegerList(){
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(55);
        marks.add(56);
        marks.add(57);
        marks.add(58);
        marks.add(59);
        marks.add(60);

        return marks;
    }

    public static void main(String[] args) {
        ArrayGenerics obj=new ArrayGenerics();
        ArrayList<String >names=obj.createStringList();
        for (int i=0;i<names.size();i++){
            System.out.println("Printing names using for loop :"+names.get(i));
        }

        System.out.println(" ");
        int j=0;
        while (j<names.size()){
            System.out.println("Printing names using while loop :"+names.get(j));
            j++;
        }
        System.out.println(" ");
        int k=0;
        do {
            System.out.println("Printing names using do while loop :"+names.get(k));
            k++;
        }while (k<names.size());

        System.out.println(" ");
        //Advance for loop  for(Datatype var : collection/array){ BODY }

        for (String var:names){
            System.out.println("Printing names using advanced for loop :"+var);
        }
        System.out.println(" ");
        ArrayList<Integer>mark=obj.createIntegerList();
       for (Integer var:mark){
           System.out.println("Printing marks using advanced for loop :"+var);
       }
        System.out.println(" ");

       for (int i=0;i<mark.size();i++){
           System.out.println("Printing marks using for loop :"+mark.get(i));
       }
        System.out.println(" ");

       int m=0;
       while (m<mark.size()){
           System.out.println("Printing marks using while loop :"+mark.get(m));
           m++;
       }
        System.out.println(" ");
       int n=0;
       do {
           System.out.println("Printing marks using do while loop :"+mark.get(n));
           n++;
       }while (n<mark.size());
    }
}