package exception_demo;

public class DemoExceptionHierarchy {

   public void demo(){

       try {
           System.out.println("This is sample code ");
           throw new Exception();
       }

       catch (RuntimeException e){
           System.out.println("Runtime exception occurred.."+e);
       }
       catch (Exception e){
           System.out.println(" Exception occurred.."+e);
       }


   }

    public static void main(String[] args) {

        DemoExceptionHierarchy obj= new DemoExceptionHierarchy();
        obj.demo();
    }
}
