package exception_demo;

public class DemoExceptionHierarchy {

    public void hierarchy() {

        try {

            System.out.println("This is sample code");

            throw new RuntimeException();
        } catch (RuntimeException e) {

            System.out.println("Runtime Exception occurred" + e);

        } catch (Exception e) {

        }

    }

    public static void main(String[] args) {

        DemoExceptionHierarchy obj = new DemoExceptionHierarchy();

        obj.hierarchy();

    }

}
