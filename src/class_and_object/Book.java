package class_and_object;

public class Book {

    //data member or properties
    String name="Java";
    int pages=400;
    String writerName="James Gosling";


    public static void main(String[] args) {
        //ClassName objName= new ClassName();   DEFAULT CONSTRUCTOR

        Book book1= new Book();

        //object.propertyName;
        System.out.println("Printing Book name: "+book1.name);
        System.out.println("Printing Book Pages: "+book1.pages);
        System.out.println("Printing Book Write name: "+book1.writerName);

        Book book2= new Book();

        System.out.println("Printing Book name: "+book1.name +" Printing pages: "+book2.pages+" Writer Name:"+book2.writerName);

    }
}
