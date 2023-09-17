package practiceoonarraylist;

import java.util.ArrayList;

public class FirstProgramonArraylist {



    public ArrayList<Integer> sizeofArray(){
        int n=5;
        ArrayList<Integer> array1=new ArrayList<>();
        ArrayList<Integer> array2=new ArrayList<>(n);
        for (int i=0;i< n;i++)
        {
array1.add(i);
array2.add(i);
        System.out.println(+array1.get(i));
          //  System.out.println(+array2.get(i));
        }
        System.out.println(" " +array1);
        System.out.println(" " +array2);

        return array1;
    }

    public static void main(String[] args) {
        FirstProgramonArraylist fp=new FirstProgramonArraylist();
        ArrayList<Integer> integerArrayList=fp.sizeofArray();



    }
}
