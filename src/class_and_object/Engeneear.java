package class_and_object;

public class Engeneear {
    public Engeneear(String name, String age, String branch, int rollNo) {
        Name = name;
        Age = age;
        this.branch = branch;
        this.rollNo = rollNo;
    }

    String Name;
    String Age;
    String branch;
    int rollNo;

    public static void main(String[] args) {
        Engeneear Engeneear = new Engeneear("Chandan", "23", "computer science", 120);

        System.out.println("Engeneear name:" + Engeneear.Name + ":Age:" + Engeneear.Age);
        System.out.println("Engeneear branch:" + Engeneear.branch + ": Rollno:" + Engeneear.rollNo);

        Engeneear Engeneear1 = new Engeneear("Raju", "22", "clectronics", 123);

        System.out.println("Engeneear name:" + Engeneear1.Name + ":Age:" + Engeneear1.Age);
        System.out.println("Engeneear branch:" + Engeneear1.branch + ": Rollno:" + Engeneear1.rollNo);

        Engeneear Engeneear2 = new Engeneear("Sanjay", "20", "Machanical", 124);

        System.out.println("Engeneear name:" + Engeneear2.Name + ":Age:" + Engeneear2.Age);
        System.out.println("Engeneear branch:" + Engeneear2.branch + ": Rollno:" + Engeneear2.rollNo);

        Engeneear Engeneear3 = new Engeneear("Rani", "26", "civil", 126);

        System.out.println("Engeneear name:" + Engeneear3.Name + ":Age:" + Engeneear3.Age);
        System.out.println("Engeneear branch:" + Engeneear3.branch + ": Rollno:" + Engeneear3.rollNo);

        Engeneear Engeneear4 = new Engeneear("Jitu", "25", "E.C", 125);

        System.out.println("Engeneear name:" + Engeneear4.Name + ":Age:" + Engeneear4.Age);
        System.out.println("Engeneear branch:" + Engeneear4.branch + ": Rollno:" + Engeneear4.rollNo);


    }
}
