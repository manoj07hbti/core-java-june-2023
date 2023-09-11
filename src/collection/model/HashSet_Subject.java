package collection.model;

public class HashSet_Subject {

  public String Subject;

  public String BookName;

  public double Price;

  public int PageNo;


    public HashSet_Subject(String subject, String bookName, int price, int page) {
        Subject = subject;
        BookName = bookName;
        double Price = price;
        PageNo = page;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getPageNo() {
        return PageNo;
    }

    public void setPageNo(int pageNo) {
        PageNo = pageNo;
    }
}




