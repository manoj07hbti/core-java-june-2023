package array;

public class Array {

    public static void main(String[] args) {

        String name1="Vandana";
        String name2="Ojal";
        String name3="Mukul";
        String name4="Jatin";
        String name5="Mohit";


        //SYNTAX : DataType varName [] ={value1,value2,value3.......value N}

        String names[]= {"Vandana","Ojal","Mukul","Jatin","Mohit"};

//assignment while and do while loop


        //Reading Array : varName[INDEX];

        System.out.println("Index :"+names[0]);

        //Print all data of array

        for (int i=0;i<3;i++){

            System.out.println("Data at Index:"+i+":"+names[i]);
        }


        for (int i=0;i<names.length;i++){

            System.out.println("Data at Index using Length:"+i+":"+names[i]);
        }
//assignment while and do while loop
        //ADVANCED LOOP : works only with arrays and collections

         //Advance loop : array or collection
        //SYNTAX : for (DataType varName : arrayName){
        // //CODE
        // }

        for(String var : names){

            System.out.println("Data at Index using Advanced Loop: "+var);
        }



        int marks[] = {54,67,65,89,45,32,23,25};

        for (int var : marks){
//assignment while and do while loop
            System.out.println("Marks at Array:"+var);
        }
    }
}
