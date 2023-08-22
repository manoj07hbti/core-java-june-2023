package paramitraised_constructar;

public class Teacher {

    public void name() {

        System.out.println("teacher name is sujeet kumar");
    }

    public void work() {

        System.out.println("work is student teaching");
    }

    public void subject() {

        System.out.println("subject is math");
    }

    public void degree() {


        System.out.println("degree is Bsc Msc math");
    }
    public static void main(String[] args) {

        Teacher obj = new Teacher();
        obj.name();
        obj.degree();
        obj.subject();
        obj.work();

    }

}
