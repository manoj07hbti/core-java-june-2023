package function_and_method;

public class Method_With_ReturnType {

    public int makeSquare(int number) {
        int square = number * number;
        return square;
    }
    //*******************************************************//
    public int makeCube(int number) {
        int cube = number * number * number;
        return cube;
    }
    //*******************************************************//
    public String addSurname(String firstName){
        String FullName = firstName + "Sharma";
        return FullName;
    }

    public static void main(String[] args) {
        Method_With_ReturnType obj = new Method_With_ReturnType();
        int result = obj.makeSquare(8);// we need to store value
        System.out.println("Print the value of square " + result);

        //*********************************************************//
        int solve = obj.makeCube(5);
        System.out.println("Print the value of cube " + solve);

        //*********************************************************//
        String addSurname = obj.addSurname("Rohit");
        System.out.println("Full name is "+addSurname);



    }
}
