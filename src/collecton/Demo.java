package collecton;

import java.util.ArrayList;

public class Demo {

    // store Students name:

    public void storeDataOfStudents(){

        String name = "Rahul";
        int age  = 23;
        String Sub = "Science";
        String add = "Agra";
        String name1 = "Ramesh";
        int age1 = 24 ;
        String sub1 = "Com";
        String add1 = "Kanpur";
        String name2 = "Rohan";
        int age2 = 25;
        String Sub2 = "Maths";
        String add2 = "Pune";
        String name3 = "Neelam";
        int age3 = 22;
        String Sub3 = "Arts";
        String add3 = "Agra";
        String name4 = "Manu";
        int age4 = 20;
        String Sub4 = "Com";
        String add4 = "Alighar";

        // create ArrayList object to store data of Students

        ArrayList dataOfStudents = new ArrayList();

        // Store the data: obj name.Add (data)

         dataOfStudents.add("Rahul");// 0 INDEX
         dataOfStudents.add(23);// 1 INDEX
         dataOfStudents.add("Science");// 2 INDEX
         dataOfStudents.add("Agra");// 3 INDEX
         dataOfStudents.add("Ramesh");// 4 INDEX
         dataOfStudents.add(24);// 5 INDEX
         dataOfStudents.add("com");// 6 INDEX
         dataOfStudents.add("Kanpur");// 7 INDEX
         dataOfStudents.add("Rohan");// 8 INDEX
         dataOfStudents.add(25);// 9 INDEX
         dataOfStudents.add("Maths");// 10 INDEX
         dataOfStudents.add("Pune");// 11 INDEX
         dataOfStudents.add("Neelam");// 12  INDEX
         dataOfStudents.add(22);// 13 INDEX
         dataOfStudents.add("Arts");// 14 INDEX
         dataOfStudents.add("Agra");// 15 INDEX
         dataOfStudents.add("Manu");// 16 INDEX
         dataOfStudents.add(20);// 17 INDEX
         dataOfStudents.add("com");// 18 INDEX
         dataOfStudents.add("Alighar");// 19 INDEX

        System.out.println("Rahul:"+dataOfStudents.get(0));
        System.out.println("age:"+dataOfStudents.get(1));
        System.out.println("Sub:"+dataOfStudents.get(2));
        System.out.println("Add:"+dataOfStudents.get(3));

        // Print all Data type:
        System.out.println("Using for loop:");
        for (int i = 0; i<dataOfStudents.size();i++){
            System.out.println(" Before delete: Printing all data of list:"+dataOfStudents.get(i)+": INDEX "+i);
        }

        dataOfStudents.remove(4);
        for (int i = 0; i<dataOfStudents.size(); i++){
           System.out.println("After delete: Printing all data of list:"+dataOfStudents.get(i)+" :INDEX "+i);
        }
        System.out.println("Using While loop");
        int i = 0;
        while (i<dataOfStudents.size()){
            System.out.println("Before delete :Printing all data of list:"+dataOfStudents.get(i)+": INDEX "+i);
            i++;
        }
        dataOfStudents.remove(6);
         int i1 = 0;
         while (i1<dataOfStudents.size()){
             System.out.println("After delete :Printing all data of list:"+dataOfStudents.get(i1)+": INDEX "+i1);
             i1++;

         }
         System.out.println("Using do while loop");
         int i2 = 0;
         do {
            System.out.println("Before delete :Printing all data of list:"+dataOfStudents.get(i2)+":INDEX "+i2);
            i2++;
         }while (i2<dataOfStudents.size());

         dataOfStudents.remove(8);
         int i3 = 0;
         do {
             System.out.println("After delete: Printing all data of list:"+dataOfStudents.get(i3)+": INDEX "+i3);
             i3++;
         }while (i3<dataOfStudents.size());
    }


    public static void main(String [] args ){
        Demo demo = new Demo();
        demo.storeDataOfStudents();

    }
}
