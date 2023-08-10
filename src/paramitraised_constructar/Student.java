package paramitraised_constructar;

public class Student {

    public void study() {
        System.out.println("print student is study");
    }

    public void writing() {

        System.out.println("student is writing");
    }

    public void readding() {

        System.out.println("student is reading");
    }

    public void sleping() {

        System.out.println("student is sleping");
    }

    public void playing() {

        System.out.println("student is playing");
    }

    public void eating() {

        System.out.println("print student eating");
    }

    public void running() {

    }

    public static void main(String[] args) {

        Student obj = new Student();

        obj.writing();
        obj.study();
        obj.readding();
        obj.eating();
        obj.playing();
        obj.running();
        obj.sleping();


    }

}
