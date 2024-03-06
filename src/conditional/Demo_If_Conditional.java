package conditional;

public class Demo_If_Conditional {

    public static void main(String[] args) {
        int age;
        age = 25;
        if(age>=25){
            System.out.println("The person is young age"+age);
        }
       //********** *************  **************** ********************  ******************  *************+**//

        age =18;
        if (age>=18) {
            System.out.println("The person is eligible for voting " + age);
        }
      // *************  *****************   ********************  ******************  *************+**//

        age = 21;
        if(age<25){
            System.out.println("The person is not young age "+age);
        }
        // *************  *****************   ********************  ******************  *************+**//

         age = 16;
         if (age<18){
             System.out.println("The person is not eligible for voting "+age);
         }
        // *************  *****************   ********************  ******************  *************+**//

        String city;
         city = "Agra";
         if (city=="Agra") {
             System.out.println("The person belongs to Agra ");
         }
         //*************  *****************   ********************  ******************  *************+**//
          city = "Delhi";
         if(city!="Agra"){
             System.out.println("The person does not belong to agra ");
         }
        }
    }
