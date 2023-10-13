package OOPs.inheritance.Polymorphism;

public class Calc {
    public int add(){
        int a=23;
        int b=43;
        int c=a+b;
        return c;
    }
    public  int add(int x , int y){
        int c;
        c=x+y;
        return c;
    }
    public double add(int a,double b){
        double c;
        c=a+b;
        return c;
    }
    public int sub(){
        int a=20;
        int b=15;
        int c=a+b;
        return c;
    }
    public int sub(int a,int b){
        int c;
        c=a-b;
        return c;
    }
    public double sub(double a,int b){
        double c;
        c=a-b;
        return c;
    }
    public int mul(){
        int a=20;
        int b=20;
        int c=a*b;
        return c;
    }
    public int mul(int a,int b){
        int c=a*b;
        return c;
    }
    public double mul(double a,int b){
        double c=a*b;
        return c;
    }



}
