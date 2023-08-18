package methds;

public class CubeInputParameter {
    public void cubeInputParameter(int a) {
        int cubeResult = a * a * a;
        System.out.println("Printing Cube is : " + cubeResult);
    }

    public static void main(String[] args) {
        CubeInputParameter obj = new CubeInputParameter();
        obj.cubeInputParameter(2);
        obj.cubeInputParameter(125);
        obj.cubeInputParameter(8);
    }
}
