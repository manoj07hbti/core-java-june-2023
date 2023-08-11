package class_and_object.Parameterized_Constructor_with_or_without_Get_Set;

public class Book {

    String Book_Name;
    String Writer_Name;
    String Published_Date;
    int Book_Pages;
    double Book_Price;

    //Parameterized Constructor


    public Book(String book_Name, String writer_Name, String published_Date, int book_Pages, double book_Price) {
        Book_Name = book_Name;
        Writer_Name = writer_Name;
        Published_Date = published_Date;
        Book_Pages = book_Pages;
        Book_Price = book_Price;
    }

    //Getter and Setter


    public String getBook_Name() {
        return Book_Name;
    }

    public void setBook_Name(String book_Name) {
        Book_Name = book_Name;
    }

    public String getWriter_Name() {
        return Writer_Name;
    }

    public void setWriter_Name(String writer_Name) {
        Writer_Name = writer_Name;
    }

    public String getPublished_Date() {
        return Published_Date;
    }

    public void setPublished_Date(String published_Date) {
        Published_Date = published_Date;
    }

    public int getBook_Pages() {
        return Book_Pages;
    }

    public void setBook_Pages(int book_Pages) {
        Book_Pages = book_Pages;
    }

    public double getBook_Price() {
        return Book_Price;
    }

    public void setBook_Price(double book_Price) {
        Book_Price = book_Price;
    }


    public static void main(String[] args) {


        Book book1 = new Book("The Lord of the Rings", "John Ronald Reuel Tolkien", "29 July 1954", 9250, 4122.35);
        System.out.println("Book Name is :" + book1.Book_Name + " Writer Name is :" + book1.Writer_Name + " Published Date is :" + book1.Published_Date + " Pages Count are :" + book1.Book_Pages + " Book Price is :" + book1.Book_Price);

        Book book2 = new Book("The Harry Potter ", "J.K.Rowling", "26 June 1997", 3407, 2500);
        System.out.println("Book Name is :" + book2.Book_Name + " Writer Name is :" + book2.Writer_Name + " Published Date is :" + book2.Published_Date + " Pages Count are :" + book2.Book_Pages + " Book Price is :" + book2.Book_Price);

        Book book3 = new Book("Indiana Jones and the Army of the Dead", "Steve Perry", "29 September 2009", 336, 627.00);
        System.out.println("Book Name is :" + book3.Book_Name + " Writer Name is :" + book3.Writer_Name + " Published Date is :" + book3.Published_Date + " Pages Count are :" + book3.Book_Pages + " Book Price is :" + book3.Book_Price);

        Book book4 = new Book("Indiana Jones and the Peril at Delphi", "Rob MacGregor", "1 January 1991", 3200, 13218.00);
        System.out.println("Book Name is :" + book4.Book_Name + " Writer Name is :" + book4.Writer_Name + " Published Date is :" + book4.Published_Date + " Pages Count are :" + book4.Book_Pages + " Book Price is :" + book4.Book_Price);

        Book book5 = new Book("Indiana Jones and the Dinosaur Eggs", "Max McCoy", "1996", 9250, 4122.35);
        System.out.println("Book Name is :" + book5.Book_Name + " Writer Name is :" + book5.Writer_Name + " Published Date is :" + book5.Published_Date + " Pages Count are :" + book5.Book_Pages + " Book Price is :" + book5.Book_Price);


        //Getter And Setter Method

        System.out.println("Data after used setter method");
        book5.setBook_Name("xyz");
        book5.setWriter_Name("pqr");
        book5.setPublished_Date("__/__/____");
        book5.setBook_Pages(00);
        book5.setBook_Price(00.00);
        System.out.println("Book Name is :" + book5.Book_Name + " Writer Name is :" + book5.Writer_Name + " Published Date is :" + book5.Published_Date + " Pages Count are :" + book5.Book_Pages + " Book Price is :" + book5.Book_Price);
    }
}
