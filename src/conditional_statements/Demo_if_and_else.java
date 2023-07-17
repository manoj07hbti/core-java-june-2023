package conditional_statements;

public class Demo_if_and_else {

    public static void main(String[] args) {
        int age = 19;
        if (age > 18) {
            System.out.println("person is eligible for voting at the age of : " + age);
        } else {
            System.out.println("person is not eligible for voting : " + age);
        }
        age = 17;
        if (age > 18) {
            System.out.println("person is eligible for voting : " + age);
        } else {
            System.out.println("person is not eligible for voting at the age of : " + age);
        }
        age = 54;
        if (age > 18) {
            System.out.println("person is eligible for voting at the age of : " + age);
        } else {
            System.out.println(" person is not eligible for voting at the age of : " + age);
        }
        String city = "Lucknow";
        if (city == "Lucknow") {
            System.out.println("person is belongs from city : " + city);
        }else{
            System.out.println("person is not belongs from city : " + city);
        }
        city="Ajmer";
        if(city=="Agra"){
            System.out.println("person is belongs from city : " + city);
        }else{
            System.out.println("person is not belongs from city : " + city);
        }
        city="Mumbai";
        if(city=="Mumbai"){
            System.out.println("person is belongs from city : " + city);
        }else{
            System.out.println("person is not belongs from city : " + city);
        }
    }
}