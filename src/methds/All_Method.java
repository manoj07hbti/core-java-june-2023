package methds;

public class All_Method {
    public void add() {
        int a = 10;
        int b = 20;
        int addResult = a + b;
        System.out.println("Printing add Method is " + addResult);
    }

    // input parameter is--->
    public void add1(int a, int b) {
        int result = a + b;
        System.out.println("Printing input add method is : " + result);
    }
    // return type method is----->

    public int addReturn(int a, int b) {
        int result1 = a + b;
        return result1;
    }

    public int subReturn(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int mulReturn(int a, int b, int c) {
        int mul = a * b * c;
        return mul;

    }

    public double divReturn(double a, double b) {
        double div = a / b;
        return div;
    }

    // String type data ude return type method--->
    public String mobile() {
        return "welcome to apple mobile feature ";
    }

    public String mobileName(String mobileCompanyName, String FaceId, String OS, String productDimensions, String ItemPartNumber, String WirelessCommunicationTechnology, String ConnectivityTechnologies) {
        return "welcome to apple mobile feature : " + mobileCompanyName + " , Face id  :  " + FaceId + " , Apple Operating System : " + OS + " , Apple mobile Size is : " + productDimensions + " , Apple Item Part Number is : " + ItemPartNumber + " , Apple mobile Wire Less Communication is :" + WirelessCommunicationTechnology + " , Connectivity Technologies : " + ConnectivityTechnologies;
    }

    public static void main(String[] args) {
        All_Method obj = new All_Method();
        obj.add();
        obj.add1(45, 56);
        All_Method obj1 = new All_Method();
        int add = obj1.addReturn(67, 89);
        System.out.println("Printing Return type method is : " + add);
        int sub = obj1.subReturn(45, 43);
        System.out.println("Printing use return type method of subtraction : " + sub);
        int mul = obj1.mulReturn(4, 5, 6);
        System.out.println("Printing use return type method of multiplication : " + mul);
        double div = obj1.divReturn(67, 7);
        System.out.println("Printing use return type method of div : " + div);
        String mobile = obj1.mobile();
        System.out.println(mobile);
        System.out.println(obj1.mobileName(" : Brand Apple ", " Self Photo ", "IOS", "0.78*7.15*14.67 cm; 172 Grams", "BOBDHX8Z63", "Bluetooth , Wi_Fi ", "Bluetooth,Wi_fi,USB "));


    }
}

