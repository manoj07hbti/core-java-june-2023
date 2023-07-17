package conditional_statements;

public class Demo_if {
    public static void main(String[] args) {
        int age=17;
        if (age < 18){

            System.out.println(" person is not eligible for voting in : " + age);
        }
        String city="Agra";
        if(city=="Agra") {
            System.out.println("person is eligible  for voting in : " + city);
        }
        age =57;
        if(age>18) {
            System.out.println("person is eligible for voting : " + age);

        }
        age=25;
        if(age>18){
            System.out.println("person is eligible for voting " + age);
        }

        age =16;
        if (age<18){
            System.out.println("person is not eligible for voting : " +age);
        }
        city="Delhi";
        if (city=="Delhi"){
            System.out.println("person is belong from : " +city);

        }
        city="Mumbai";
        if(city=="Lucknow"){
            System.out.println("person is belongs from : " + city );
        }

        }
    }

