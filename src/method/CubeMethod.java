package method;

public class CubeMethod {
//TODO Write a code to find a particular cubicle
   // TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}

   public void findCube(){
       int number=3;
       System.out.println("Square of "+number+" is "+number*number*number);
   }

    public static void main(String[] args) {
        CubeMethod obj=new CubeMethod();
        obj.findCube();
    }

}
