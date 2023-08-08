package class_and_object;

public class Doctor {

    String DocName = "Vandana";
    String DocDept = "Neurology";
    String DocID = "__twe-6433";
    int DocAge = 24;
    int DocSal = 50000;

    public static void main(String[] args) {
        //ClassName objName=new ClassName() DEFAULT CONSTRUCTOR

        Doctor DOC = new Doctor();
        //object.propertyName

        System.out.println("Printing DocName:" + DOC.DocName);
        System.out.println("Printing DocDept:" + DOC.DocDept);
        System.out.println("Printing DocID:" + DOC.DocID);
        System.out.println("Printing DocAge:" + DOC.DocAge);
        System.out.println("Printing DocSal:" + DOC.DocSal);

        Doctor DOC1 = new Doctor();
        //object.propertyName
        System.out.println("Printing DocName:" + DOC1.DocName + " Printing DocDept:" + DOC1.DocDept + " Printing DocID:" + DOC1.DocID + " Printing DocAge:" + DOC1.DocAge + " Printing DocSal:" + DOC1.DocSal);


    }

}
