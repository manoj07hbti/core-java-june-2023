package Collection.hashset;

import java.awt.geom.QuadCurve2D;
import java.util.HashSet;

public class Demo_hashset {

    public  HashSet<String>   createStringSet(){

        HashSet<String>courses=new HashSet<>();
        courses.add("physics");
        courses.add("chemistry");
        courses.add("biology");
        courses.add("maths");
        courses.add("History");
        courses.add("polity");
        courses.add("economy");
        courses.add("geography");
        courses.add("History");
        courses.add("chemistry");
        courses.add("drawing");

        return courses;
    }

    public HashSet<Integer> IntegerList(){

        HashSet<Integer> Number=new HashSet<>();
        Number.add(78);
        Number.add(98);
        Number.add(90);
        Number.add(87);
        Number.add(65);
        Number.add(76);
        Number.add(98);
        Number.add(44);
        Number.add(45);
        Number.add(23);
        Number.add(12);
        Number.add(66);

        return Number;
    }

    public HashSet<Double> DoubleList(){

        HashSet<Double> Salary=new HashSet<>();
        Salary.add(890.8);
        Salary.add(90.98);
        Salary.add(890.0);
        Salary.add(76.9);
        Salary.add(90.7);
        Salary.add(67.9);
        Salary.add(67.09);
        Salary.add(45.9);
        Salary.add(56.9);

        return Salary;
    }

    public static void main(String[] args) {
        Demo_hashset obj=new Demo_hashset();
        HashSet<String> courses=obj.createStringSet();
        HashSet<Integer> number=obj.IntegerList();
        HashSet<Double> salary=obj.DoubleList();

      int i=0;
      for (String var:courses){

          System.out.println("printing course data: "+var+" at Index"+i);
          i++;
      }
      int k=0;
      for (Integer var:number){
          System.out.println("printing my number data: "+var+" at Index"+k);
          k++;
      }
      int j=0;
      for (Double var:salary){
          System.out.println("printing my salary data: "+var+" at Index"+j);
          j++;
      }

    }

}
