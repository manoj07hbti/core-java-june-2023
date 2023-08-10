package paramitraised_constructar;

public class Engeneer {
    public void name() {
        System.out.println("engeneer name");

    }

    public void branch() {
        System.out.println("branch name");
    }

    public void computer() {

        System.out.println("computer science");

    }

    public void civil() {
        System.out.println("civil engeneer");
    }

    public void machanical() {

        System.out.println("machanical engeneer ");
    }


    public static void main(String[] args) {
        Engeneer obj = new Engeneer();

        obj.branch();
        obj.civil();
        obj.computer();
        obj.machanical();
        obj.civil();
    }

}

