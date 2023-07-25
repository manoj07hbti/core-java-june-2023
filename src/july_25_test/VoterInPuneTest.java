package july_25_test;
//WRITE CODE TO CHECK ELIGIBLE VOTER IN PUNE
public class VoterInPuneTest {

    public static void main(String[] args) {
        int age=18;
        String city="pune";
        age=17;
        city="agra";
        age=19;
        city="pune";

        if (age>=18 && city=="pune")
        {
            System.out.println("You are eligible for voting in pune");
        }
        else {

            System.out.println("please enter valid age and city");
        }
    }
}
