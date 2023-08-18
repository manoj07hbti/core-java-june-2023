package Input_parameter;

public class democube {

    public void cube(int number){

        int result=number*number*number;

        System.out.println("result of the cube"+result);




    }

    public static void main(String[] args) {
        democube cube1=new democube();
        cube1.cube(8);
        cube1.cube(10);
        cube1.cube(12);
        cube1.cube(15);
        cube1.cube(18);
    }
}
