package Method;

public class Cube_Method {

    // multiply,

    public void cube(){
        int k=3;
        int cube1=3*3*3;
        int result =k*k*k;
        System.out.println(cube1);
    }
public void cube2(){
        int n =12;
        int cube2=12*12*12;
        int result=n*n*n;
    System.out.println(cube2);
}
public void cube3(){
        int a =10;
        int cube3=10*10*10;
        int result=a*a*a;
    System.out.println(cube3);
}
    public static void main(String[] args) {

    Cube_Method obj=new Cube_Method();
    obj.cube();
    obj.cube2();
    obj.cube3();


    }
}







