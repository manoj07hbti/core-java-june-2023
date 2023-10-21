package method;

public class Return_type {

    // create a method which will provide addition of given number
    public int Addition(int a, int b) {

        int result = a + b;

        return result;
    }
    // create a method which sends welcome message to user
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public String Invitation(String name){

        return "Invitation for the opening of Mall : "+name;
    }

    public static void main(String[] args) {
        Return_type obj= new Return_type();
        int result = obj.Addition(5,44);
        System.out.println("Addition is:" +result);
        String message=  obj.Invitation("Rohan");
        System.out.println(obj.Invitation("Rohan"));
    }
}