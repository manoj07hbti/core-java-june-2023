package returntype_method;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

public class ATM_ReturnType {

    public boolean checkPassword(String cardNumber, String Password, String Address, String Amount) {

        if (cardNumber.equals("4321") && Password.equals("1232") && Address.equals("SBI") && Amount.equals("One Lakh"))

        {

            return true;
        }

          return false;
    }

    public static void main(String[] args) {

        ATM_ReturnType obj = new ATM_ReturnType();
        boolean result = obj.checkPassword("4521", "1232", "SBI", "twoLakh");
        System.out.println(result);

        if (result) {

            System.out.println("welcome to SBI ATM.....please select your transaction");
        } else {
            System.out.println("sorry... incorrect your detail entered...");

            if (result) {

                System.out.println("please select your cardNumber...");

            } else {

                System.out.println("sorry...incorrect your cardNumber...");

                if (result) {
                    System.out.println("please select your Amount....");
                } else {
                    System.out.println("please select your minimum Amount...");
                }
            }
        }

    }

}
