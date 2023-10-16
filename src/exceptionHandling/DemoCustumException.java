package exceptionHandling;

public class DemoCustumException {


    public void voting(int age) throws ageNotEligibalException {

        if (age < 18) {

            throw new ageNotEligibalException("candidate age must be grater thane 18 and equele");

        } else {
            System.out.println("Welcome to voting management");
        }


    }

    public static void main(String[] args) {

        DemoCustumException obj = new DemoCustumException();

        try {
            obj.voting(16);
        } catch (Exception e) {

            System.out.println("Exception occurred");
        }

    }
}
