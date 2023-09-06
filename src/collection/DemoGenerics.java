package collection;

import java.util.ArrayList;

public class DemoGenerics {

    public ArrayList<String> createStringList(){
   //SYNTAX: CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList <String> stringArrayList= new ArrayList<>();

        stringArrayList.add("raj");//0
        stringArrayList.add("Mukesh");//1
        //stringArrayList.add(33);  it will not allow any other datatype
        stringArrayList.add("Mohit");//2
        stringArrayList.add("1.4 Billion,3 Million");

        return  stringArrayList;
    }

    public ArrayList<Integer> createIntegerList(){

        ArrayList<Integer> marks= new ArrayList<>();

        marks.add(76);//0
        marks.add(45);//1
        marks.add(33);
        marks.add(65);
        marks.add(34);

        return marks;
    }
    public static void main(String[] args) {
        DemoGenerics obj= new DemoGenerics();
        ArrayList <String> names=obj.createStringList();

        for(int i=0; i<names.size(); i++){
            System.out.println("Printing names: "+names.get(i));
        }
        int j=0;
        while(j<names.size()){
            System.out.println("Printing names using while : "+names.get(j));
            j++;
        }
        int k=0;
        do{
            System.out.println("Printing names using DO while : "+names.get(k));
            k++;
        }while (k<names.size());

        //Advance for loop  for(Datatype var : collection/array){ BODY }

        for(String var: names){

            System.out.println("Printing names using Advanced loop :"+var);
        }


        ArrayList<Integer> marks= obj.createIntegerList();

        for(Integer var: marks){

            System.out.println("Printing marks using Advanced loop: "+var);
        }
        //TODO do it using for , while and do while
    }

}
