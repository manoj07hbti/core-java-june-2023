package class_and_object;

public class Book1 {

    // data member or properties

    String name = "java";

    int pages = 450;

    String writer_name = "james gosling";


    public static void main(String[] args) {
        //ClassName objName=new ClassName(); DEFAULT CONSTRUCTOR
        System.out.println();
        System.out.println("Printing Book1========> ");
        System.out.println();
        Book1 Book = new Book1();


        //object.propertyName;
        System.out.println("Printing Book1 Name:" + Book.name);
        System.out.println("Printing Book1 Writer Name:" + Book.writer_name);
        System.out.println("Printing Book1 Pages:" + Book.pages);

        Book1 Book2 = new Book1();
        System.out.println("Printing Book1 Name:" + Book2.name + " Printing Book1 Writer Name:" + Book2.writer_name + " Printing Book1:" + Book2.pages);

    }
}
