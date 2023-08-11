package Method;

public class Engineer {

    String name;

    String department;

    String city;

    String goals;

    int age;

    public void leadershipmethod(){
        System.out.println("this is leadership method of engineer");
    }

    public  void communicationmethod(){
        System.out.println("this is communication method of engineer");
    }

    public void interpersonalmethod(){
        System.out.println("this is interpersonal method of engineer");
    }
    public void criticalreasoning(){
        System.out.println("this is criticalreasoning method of engineer");
    }
    public void creativitymethod(){
        System.out.println("this is creativity method of engineer");
    }

    public static void main(String[] args) {
        Engineer engineer1=new Engineer();

        engineer1.leadershipmethod();
        engineer1.communicationmethod();
        engineer1.interpersonalmethod();
        engineer1.criticalreasoning();
        engineer1.creativitymethod();

    }
}
