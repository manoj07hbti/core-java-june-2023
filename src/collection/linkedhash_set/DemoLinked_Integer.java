package collection.linkedhash_set;

import java.util.LinkedHashSet;

public class DemoLinked_Integer {

    public LinkedHashSet<Integer> createIntegerSet(){

        LinkedHashSet<Integer>Data= new LinkedHashSet<>();

        Data.add(1);
        System.out.println("Hash code data 1" +Data.hashCode());
        Data.add(2);
        System.out.println("Hash code data 2" +Data.hashCode());

        Data.add(3);
        System.out.println("Hash code data 3" +Data.hashCode());

        Data.add(4);
        System.out.println("Hash code data 4" +Data.hashCode());

        Data.add(5);
        System.out.println("Hash code data 5" +Data.hashCode());

        Data.add(1);
        System.out.println("Hash code data 1" +Data.hashCode());

        Data.add(2);
        System.out.println("Hash code data 2" +Data.hashCode());

        Data.add(3);
        System.out.println("Hash code data 3" +Data.hashCode());

        Data.add(4);
        System.out.println("Hash code data 4" +Data.hashCode());

        Data.add(5);
        System.out.println("Hash code data 5" +Data.hashCode());

        return Data;

    }

    public static void main(String[] args) {

        DemoLinked_Integer obj = new DemoLinked_Integer();

        LinkedHashSet<Integer> value = obj.createIntegerSet();

        int i = 0;

        for(Integer var : value){

            System.out.println("values are " + var + "At index" +i);

            i++;

        }










    }


}
