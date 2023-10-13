package OOPs.inheritance.Polymorphism;

public class CalcSub  extends Calc{
    public static void main(String[] args) {
        CalcSub obj=new CalcSub();
      int c=  obj.add();
        System.out.println("Addition : " +c);
        int add= obj.add(23,56);
        System.out.println("Addition : " +add);
        double Add= obj.add(45,56.70);
        System.out.println("Addition : " +Add);
        System.out.println();

        int sub= obj.sub();
        System.out.println("Subtraction : " +sub);
       int sub1= obj.sub(23,34);
        System.out.println("Subtraction :" +sub1);
        double sub2=obj.sub(60.700,40);
        System.out.println("Subtraction: " +sub2);
        System.out.println();


       int multi= obj.mul();
        System.out.println("Multiplication : " +multi);
        int multi2=obj.mul(23,54);
        System.out.println("Multiplication : " +multi2);
        double multi3=obj.mul(4.40,4);
        System.out.println("Multiplication : " +multi3);

    }

}
