package arrayusningallloops;

public class Array_Demo_Loops {
    public static void main(String[] args) {


        //syntax: datatype varName[]={value1,value2,value3,...,valueN};
        String names[] = {"Shubham", "Raj", "Nilesh", "suraj", "rohit","anvit","chinamy"};


        //Reading array: varName[INDEX];
        System.out.println(names[2]);
        System.out.println("Printing data at index 2\t"+names[2]);

        //printing all data of array
    //    System.out.println("printing all data of array");
        for (int i=0;i<5;i++)
        {
          //  System.out.println(names[i]);
            System.out.println("printing all data of array\t"+i +" : "+names[i]);
        }

        for (int i=0;i< names.length;i++)
        {
            System.out.println("printing all data of array\t"+i +":" +names[i]);
        }

       // int i=0;

//        while(i<names.length)
//        {
//            System.out.println("printing all data of array using while\t"+i +":" +names[i]);
//            i++;
//        }
        int i=0;
        do {
            System.out.println("printing all data of array using do while\t"+i +":" +names[i]);
            i++;
        }while (i<names.length);

        //advanced for loop
        //for(datatype varName:array_name)
        for (String var:names)
        {
            System.out.println("printing all data of array using advance loop:"+var);
        }
    }
}
