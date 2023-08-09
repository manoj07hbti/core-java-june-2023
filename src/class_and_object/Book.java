package class_and_object;

public class Book {

    //data member or properties
    String name="Java";
    int pages=400;
    String writerName="James Gosling";

    //CAPABILITIES
    /*read
    write*/


    public void readMethod(){

        System.out.println("This is read method of book class");
    }

    public void writeMethod(){

        System.out.println("This is write method.....");
    }

    public static void main(String[] args) {
        //ClassName objName= new ClassName();   DEFAULT CONSTRUCTOR

       Book obj= new Book();

       obj.readMethod();
       obj.writeMethod();

    }
}
