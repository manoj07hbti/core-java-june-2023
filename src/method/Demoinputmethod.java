package method;

public class Demoinputmethod {

    public void CheckevenOdd(int number) {

        if (number % 2 == 0) {

            System.out.println("print even number:" + number);
        } else {
            System.out.println("print odd number:" + number);
        }
    }

    public void CheckVoterEligibility(String city, int age) {

        if (city == "pune" && age >= 18) {

            System.out.println("person is elligbal for voting in pune");

        } else {
            System.out.println("person is not elligebal for voting");
        }
    }

    public void sumnumber(int a, int b) {

        int number = a + b;
        System.out.println("print sum number" + number);

    }

    public void subtraction(int a, int b) {

        int number = a - b;
        System.out.println("print subtraction number:" + number);
    }

    public void multiple(int a, int b) {

        int number = a * b;
        System.out.println("print multiple number:" + number);
    }

    public void devision(int a, int b) {

        double number = a / b;

        double result = (double) a / b;
        System.out.println("devesion " + result);
    }

    public static void main(String[] args) {
        Demoinputmethod obj = new Demoinputmethod();
        obj.CheckevenOdd(10);
        obj.CheckevenOdd(5);
        obj.CheckevenOdd(11);
        obj.CheckevenOdd(21);
        obj.CheckevenOdd(35);
        obj.CheckVoterEligibility("pune", 20);
        obj.CheckVoterEligibility("mumbai", 20);
        obj.sumnumber(23, 43);
        obj.sumnumber(20, 20);
        obj.subtraction(20, 10);
        obj.subtraction(30, 22);
        obj.multiple(5, 6);
        obj.multiple(3, 6);
        obj.devision(20, 15);
    }


}
