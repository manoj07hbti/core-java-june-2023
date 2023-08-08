package class_and_object;

public class Engineer {

    String EngName = "XYZ";
    String EngDept = "Civil";
    String EngID = "3y4-__37egr23";
    String EngCity = "Pune";
    int EngSal = 756487;

    public static void main(String[] args) {

        //ClassName objName=new ClassName() DEFAULT CONSTRUCTOR

        Engineer engineer = new Engineer();
        //object.propertyName
        System.out.println("Printing EngName:" + engineer.EngName);
        System.out.println("Printing EngDept:" + engineer.EngDept);
        System.out.println("Printing EngID:" + engineer.EngID);
        System.out.println("Printing EngCity:" + engineer.EngCity);
        System.out.println("Printing EngSal:" + engineer.EngSal);

        Engineer engineer1 = new Engineer();
        System.out.println("Printing EngName" + engineer1.EngName + " Printing EngDept" + engineer1.EngDept + " Printing EngID" + engineer1.EngID + " Printing EngCity" + engineer1.EngCity + " Printing EngSal" + engineer1.EngSal);

    }
}
