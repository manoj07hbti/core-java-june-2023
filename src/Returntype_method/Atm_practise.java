package Returntype_method;

public class Atm_practise {

    public boolean ATM ( String user, String pin){

        if (user.equals("ram") && pin.equals("7240")){

            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Atm_practise atm1=new Atm_practise();
        boolean result=atm1.ATM("ram","7240");
        System.out.println(result);
        if (result) {
            System.out.println("welcome to atm and check transaction");
        } else {
            System.out.println("sorry incorrect details");
        }
    }
}
