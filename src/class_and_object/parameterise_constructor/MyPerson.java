package class_and_object.parameterise_constructor;

public class MyPerson {

    String name;
    int age;
    String add;

    // Parameterised constructor

    public MyPerson(String name, int age, String add) {
        this.name = name;
        this.age = age;
        this.add = add;
    }

    public static void main(String args []){

        MyPerson Myperson1 = new MyPerson("Kunal",23,"Gwalior");
        System.out.println("Myperson1 name is:"+Myperson1.name+ "  age: "+Myperson1.age+"  add: "+Myperson1.add);
        MyPerson Myperson2 = new MyPerson("Aman",28,"Bhopal");
        System.out.println("Myperson2 name is:"+Myperson2.name+ "  age: "+Myperson2.age+"  add: "+Myperson2.add);
        MyPerson Myperson3 = new MyPerson("Prabhat",26,"Agra");
        System.out.println("Myperson3 name is:"+Myperson2.name+ "  age: "+Myperson3.age+"  add: "+Myperson3.add);

    }
}
