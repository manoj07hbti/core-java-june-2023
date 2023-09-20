package collection.linkedhash_set;

import java.util.LinkedHashSet;

public class DemoLinked_Double {

    public LinkedHashSet<Double>createDoubleSet(){

        LinkedHashSet<Double>DoubleData = new LinkedHashSet<>();

        DoubleData.add(1.0);
        System.out.println("Hash code data 1" +DoubleData.hashCode());

        DoubleData.add(1.1);
        System.out.println("Hash code data 2" +DoubleData.hashCode());
        DoubleData.add(1.2);
        System.out.println("Hash code data 3" +DoubleData.hashCode());
        DoubleData.add(1.3);
        System.out.println("Hash code data 4" +DoubleData.hashCode());
        DoubleData.add(1.4);
        System.out.println("Hash code data 5" +DoubleData.hashCode());
        DoubleData.add(1.0);
        System.out.println("Hash code data 6" +DoubleData.hashCode());
        DoubleData.add(1.1);
        System.out.println("Hash code data 7" +DoubleData.hashCode());
        DoubleData.add(1.2);
        System.out.println("Hash code data 8" +DoubleData.hashCode());
        DoubleData.add(1.3);
        System.out.println("Hash code data 9" +DoubleData.hashCode());
        DoubleData.add(1.4);
        System.out.println("Hash code data 10" +DoubleData.hashCode());

       return DoubleData;

    }

    public static void main(String[] args) {

    DemoLinked_Double obj = new DemoLinked_Double();

    LinkedHashSet<Double> value = obj.createDoubleSet();

    int x = 0;

    for(Double var : value){

        System.out.println("Values are " +var+ "At Index" +x);

        x++;
    }





    }





}
