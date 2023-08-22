package class_and_object;

public class Book {

    String bookName;
    String bookAuthar;
    int bookPages;
    int boolPrice;

    public Book(String bookName, String bookAuthar, int bookPages, int boolPrice) {
        this.bookName = bookName;
        this.bookAuthar = bookAuthar;
        this.bookPages = bookPages;
        this.boolPrice = boolPrice;
    }

    public static void main(String[] args) {

        Book Book1=new Book("math","rahul",250,300);

        System.out.println("print bookName:"+Book1.bookName+":BookAuthar:"+Book1.bookAuthar);
        System.out.println("print bookPages:"+Book1.bookPages+":bookPrice:"+Book1.boolPrice);

        Book Book2=new Book("Hinde","Ram",200,350);

        System.out.println("print bookName:"+Book2.bookName+":BookAuthar:"+Book2.bookAuthar);
        System.out.println("print bookPages:"+Book2.bookPages+":bookPrice:"+Book2.boolPrice);

        Book Book3=new Book("English","Sanjay",270,400);

        System.out.println("print bookName:"+Book3.bookName+":BookAuthar:"+Book3.bookAuthar);
        System.out.println("print bookPages:"+Book3.bookPages+":bookPrice:"+Book3.boolPrice);

        Book Book4=new Book("SocalScience","Raj",280,390);

        System.out.println("print bookName:"+Book4.bookName+":BookAuthar:"+Book4.bookAuthar);
        System.out.println("print bookPages:"+Book4.bookPages+":bookPrice:"+Book4.boolPrice);















    }





}











