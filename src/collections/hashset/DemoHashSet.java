package collections.hashset;

import java.util.HashSet;

public class DemoHashSet {

    // NOTE- HASHSET AUTOMATICALLY REMOVES DUPLICATE DATA ...........
    public HashSet createStingSet() { // WE CREATE A METHOD FOR STRING ...

        //CollectionName <Datatype> objName = new CollectionName<>();

        HashSet<String> States = new HashSet<>(); // WE WILL CREATE A OBJECT...

        States.add("Uttar Pradesh");         // WE WILL ADD TO  DATA IN STRING ....
        States.add("Asam");
        States.add("Bihar");
        States.add("Goa");
        States.add("Gujarat");
        States.add("Haryana");
        States.add("Kerala");
        States.add("Manipur");
        States.add("Punjab");
        States.add("Rajasthan");
        States.add("Tripura");
        States.add("Uttarakhand");
        States.add("Uttar Pradesh");
        States.add("Goa");
        States.add("Gujarat");
        States.add("Bihar");
        States.add("Haryana");
        States.add("Kerala");
        States.add("Rajasthan");
        States.add("Punjab");

        return States;
    }
    public HashSet createInteger(){

        HashSet<Integer> PinNumber = new HashSet<>();

        PinNumber.add(202124);
        PinNumber.add(202001);
        PinNumber.add(211001);
        PinNumber.add(224121);
        PinNumber.add(206121);
        PinNumber.add(221602);
        PinNumber.add(250101);
        PinNumber.add(202124);
        PinNumber.add(202001);
        PinNumber.add(211001);
        PinNumber.add(224121);
        PinNumber.add(206121);
        PinNumber.add(221602);
        PinNumber.add(250101);

        return PinNumber;
    }

    public HashSet CreateDoublePercentList(){

        HashSet<Double> Percent = new HashSet<>();

        Percent.add(88.25);
        Percent.add(95.60);
        Percent.add(87.50);
        Percent.add(96.80);
        Percent.add(98.45);
        Percent.add(92.25);
        Percent.add(88.25);
        Percent.add(95.60);
        Percent.add(87.50);
        Percent.add(96.80);
        Percent.add(98.45);
        Percent.add(92.25);


        return Percent;

    }
    public static void main(String[] args) {

        DemoHashSet obj = new DemoHashSet(); // CREATE A METHOD ....

        HashSet<String> States =  obj.createStingSet(); // NOW WE WILL STORE DATA AND CALLING...

        // IT DOES NOT HAVE AN INDEX ....
        // A VARIABLE HAS BEEN TAKEN FOR INDEX ....

        int i = 0;

        for (String var : States){  // USING ADVANCE FOR LOOP ....

            System.out.println("Printing State data " + var + " at index : " +i);
            i++;
    }

        HashSet<Integer> PinNumber = obj.createInteger(); // CALLING FOR INTEGER NUMBER .....

        for (Integer var : PinNumber) {

            System.out.println("Printing Integer Data " + var);

        }

        // CALLING FOR DOUBLE INTEGER

        HashSet<Double> Percent = obj.CreateDoublePercentList();

        for (Double var : Percent){

            System.out.println(" Printing double integer data "+ var);
        }



    }
}
