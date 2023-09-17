package Collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {
    public Set<String> CreateHashSet2() {
        Set<String> List = new HashSet<>();
        List.add("Mathur");
        List.add("Ram Prakash");
        List.add("Manish Kumar");
        List.add("Praval Kumar Pankaj");
        List.add("Ravi Kant Singh");
        List.add("Dileep Oraon");
        List.add("Shiv Kumar");
        return List;

    }

    public static void main(String[] args) {
        HashSet2 obj = new HashSet2();
        Set<String> CS = obj.CreateHashSet2();
        for (String var : CS) {
            System.out.println(" List  : " + var);
        }
        Iterator<String> iterator = CS.iterator();

        while (iterator.hasNext()) {
            String var = (String) iterator.next();
            System.out.println("Using while loop : " + var);
        }
        Iterator<String> it = CS.iterator();
        do {
            System.out.println("Using Do while loop : " + it.next());
        } while (it.hasNext());

    }


}


