package conditional_statements;

public class Demo_And_operator {
    public static void main(String[] args) {
        int age = 18;
        String city="Delhi";
        if(age>=18 && city=="Delhi"){
            System.out.println("person is eligible for voting in Delhi");
        }else{
            System.out.println("person is not eligible for voting in Delhi");
        }
      age=10;
        city="pune";
        if(age>=18 && city=="pune"){
            System.out.println("person is eligible for voting in pune : " + age);
        }else{
            System.out.println("person is not eligible for voting in pune at age : " + age);
        }

    }
}
