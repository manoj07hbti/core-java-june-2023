package method.return_type;

public class AutomaticTellerMachine {

    public boolean ATM(String user, String pin) {

        if (user.equals("JATIN") && pin.equals("1234")) {

            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        AutomaticTellerMachine obj = new AutomaticTellerMachine();
        boolean result = obj.ATM("JATIN", "1234");
        System.out.println(result);
        if (result) {
            System.out.println("Welcome to ATM Please select your transaction");
        } else {
            System.out.println("Sorry...incorrect details entered");

        }
    }
}
