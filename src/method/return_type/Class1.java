package method.return_type;

public class Class1 {


    public String welcome(){//TODO<---------------without input
        return "Welcome to India";
    }
    public String welcome1(String name){
        return "Welcome to India "+name;
    }

    public static void main(String[] args) {
        Class1 obj=new Class1();
        String output= obj.welcome();
        System.out.println(output);
        System.out.println(obj.welcome1 ("Tom Cruise"));
    }
}
